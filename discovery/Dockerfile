FROM ubuntu:latest
RUN apt-get update && apt-get install -y openjdk-17-jdk
ARG JAR_FILE=target/*.jar
COPY ./target/discovery-0.0.1-SNAPSHOT.jar discovery.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "/discovery.jar"]
