FROM ubuntu:latest
RUN apt-get update && apt-get install -y openjdk-17-jdk
ARG JAR_FILE=target/*.jar
COPY ./target/Config-Server-0.0.1-SNAPSHOT.jar config.jar
EXPOSE 8222
ENTRYPOINT ["java","-jar","/config.jar"]