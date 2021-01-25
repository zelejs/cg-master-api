FROM zelejs/allin-web:alpine-m2 AS M2

#builk-stage
FROM maven:3.6.0-jdk-11-slim AS build

# init .m2 from alpine-m2 image first
WORKDIR /root/m2
COPY --from=M2 /root/.m2 /root/m2
RUN --mount=type=cache,id=m2_cache,target=/root/.m2,rw cp -r /root/m2/* /root/.m2

## mvn package
WORKDIR /usr/src

COPY ./pom.xml  ./pom.xml
RUN --mount=type=cache,id=m2_cache,target=/root/.m2,rw mvn dependency:go-offline -Dmaven.main.skip=true -Dmaven.test.skip=true
# #RUN --mount=type=bind,source=./.m2,target=/root/.m2,rw mvn -o install

# # To package the application
COPY ./src ./src
RUN --mount=type=cache,id=m2_cache,target=/root/.m2,rw mvn -DskipStandalone=false package -Dmaven.test.skip=true

#final-stage
FROM zelejs/allin-web:jdk11
COPY --from=build /usr/src/target/cg-1.0.0-standalone.jar /webapps/app.jar
