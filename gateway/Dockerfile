FROM openjdk:17-slim-buster AS runtime-stage
WORKDIR /app
COPY . .
EXPOSE 8222
CMD ["java", "-jar", "gateway.jar"]