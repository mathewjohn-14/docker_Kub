# Use Java runtime
FROM eclipse-temurin:17-jdk

# Copy jar file
COPY target/java-app.jar app.jar

# Run application
ENTRYPOINT ["java", "-jar", "/app.jar"]