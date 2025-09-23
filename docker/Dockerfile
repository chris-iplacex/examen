# syntax=docker/dockerfile:1
FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

COPY target/Calculadora-1.0-SNAPSHOT.jar /app/app.jar

# Puerto de la app si expone uno
EXPOSE 8080

# Variables opcionales
ENV JAVA_OPTS=""

CMD ["sh", "-c", "java $JAVA_OPTS -jar /app/app.jar"]