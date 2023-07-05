# Use a base image with Java installed
FROM openjdk:20-jdk

ARG JAR_FILE=target/bff-service-rest-0.0.1-SNAPSHOT.jar

# Copy the JAR file into the container
COPY ${JAR_FILE} /app.jar

ENTRYPOINT exec java -jar /app.jar
