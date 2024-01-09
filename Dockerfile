FROM maven:3.8.4-openjdk-17 AS build

WORKDIR /app

COPY pom.xml .

COPY src ./src

RUN mvn clean package -DskipTests

FROM openjdk:17-jdk-slim AS production

WORKDIR /app

COPY --from=build /app/target/auth-service.jar ./auth-app.jar

EXPOSE 8080

CMD ["java","-jar","auth-app.jar"]