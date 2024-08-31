FROM ubuntu:latest
RUN apt-get update && apt-get install -y openjdk-17-jdk
ARG JAR_FILE=target/*.jar
COPY ./target/API-Gateway-0.0.1-SNAPSHOT.jar gateway.jar
EXPOSE 8888
ENTRYPOINT ["java", "-jar", "/gateway.jar"]
