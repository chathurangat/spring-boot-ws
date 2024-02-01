FROM openjdk:19
LABEL maintainer="chathurangat@gmail.com"
WORKDIR /app
COPY target/fr-ws-service.jar /app/fr-ws-service.jar
ENTRYPOINT ["java","-jar","fr-ws-service.jar"]