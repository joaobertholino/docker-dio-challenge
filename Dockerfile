FROM maven:3.9.7-eclipse-temurin-21 AS builder
COPY src /docker-builder-demo/src
COPY pom.xml /docker-builder-demo
WORKDIR /docker-builder-demo
RUN mvn clean install

FROM eclipse-temurin:21-jdk-alpine
COPY --from=builder /docker-builder-demo/target/*.jar /docker-image-demo/app.jar
WORKDIR /docker-image-demo
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "-DskipTests", "app.jar"]