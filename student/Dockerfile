FROM ubuntu:latest
RUN apt-get update && apt-get install -y openjdk-17-jdk
ARG JAR_FILE=target/*.jar
COPY ./target/student-0.0.1-SNAPSHOT.jar student.jar
EXPOSE 8070
ENTRYPOINT ["java", "-jar", "/student.jar"]
