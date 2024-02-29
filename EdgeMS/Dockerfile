FROM openjdk:17-slim-buster AS runtime-stage
WORKDIR /app
COPY . .
EXPOSE 8761
CMD ["java", "-jar", "edge-ms.jar"]

ENV SPRING_PROFILES_ACTIVE=prod