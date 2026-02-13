# Use JDK 17 runtime
FROM eclipse-temurin:17-jre-alpine

# Set the working directory
WORKDIR /app

# Copy the jar from target to the container
COPY target/*.jar app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]