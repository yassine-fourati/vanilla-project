FROM openjdk:22-jdk-slim-bullseye

# Copy your Spring Boot application
COPY vanilla-presentation/target/vanilla-presentation-1.0.0.jar vanilla_presentation-1.0.0.jar

# Expose Spring Boot app port
EXPOSE 8080

# Entry point
ENTRYPOINT ["java", "-jar", "vanilla_presentation-1.0.0.jar"]
