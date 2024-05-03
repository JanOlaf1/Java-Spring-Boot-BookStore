# Build stage
FROM maven:3.8.6-openjdk-17-slim AS build
WORKDIR /home/app
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

# Package stage
FROM openjdk:17-jre-slim
WORKDIR /app
COPY --from=build /home/app/target/Java_Spring_Boot-0.0.1-SNAPSHOT.jar /app/bookstore.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "bookstore.jar"]
