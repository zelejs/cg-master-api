#final-stage
FROM zelejs/app-openjre11:alpine-slim

COPY ./target/cg-1.0.0-standalone.jar /usr/local/src/app.jar
ADD ./Docker/config/application.yml /usr/local/src/config/application.yml
