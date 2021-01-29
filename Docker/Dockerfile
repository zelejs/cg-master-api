FROM zelejs/app-openjre11:alpine-slim
# outside src root 
# COPY ./target/cg-1.0.0-standalone.jar /usr/local/src/app.jar
# ADD ./Docker/config/application.yml /usr/local/src/config/application.yml


# docker-compose build # within Docker
# required copy ./target/cg-1.0.0-standalone.jar into ./Docker 
COPY ./cg-1.0.0-standalone.jar /usr/local/src/app.jar
ADD ./config/application.yml /usr/local/src/config/application.yml
