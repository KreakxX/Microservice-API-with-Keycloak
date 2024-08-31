FROM ubuntu:latest
RUN apt-get update && apt-get install -y openjdk-17-jdk
ARG JAR_FILE=target/*.jar
COPY ./target/Teacher-0.0.1-SNAPSHOT.jar teacher.jar
EXPOSE 8050
ENTRYPOINT ["java", "-jar", "/teacher.jar"]
