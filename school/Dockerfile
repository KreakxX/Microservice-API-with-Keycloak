FROM ubuntu:latest
RUN apt-get update && apt-get install -y openjdk-17-jdk
ARG JAR_FILE=target/*.jar
COPY ./target/school-0.0.1-SNAPSHOT.jar school.jar
EXPOSE 8060
ENTRYPOINT ["java", "-jar", "/school.jar"]
