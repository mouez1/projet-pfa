# Use an OpenJDK base image
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from your project into the container
COPY ./target/Pi_Spring-0.0.1-SNAPSHOT.jar /app/Pi_Spring-0.0.1-SNAPSHOT.jar

# Expose the port your Spring Boot application runs on (change to the actual port)
EXPOSE 8089


# Define the command to run your Spring Boot application
CMD ["java", "-jar", "Pi_Spring-0.0.1-SNAPSHOT.jar"]
