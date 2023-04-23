FROM maven:4.0.0-jdk-17-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package


FROM openjdk:17-jdk

COPY --from=build /home/app/target/weather-app-0.0.1-SNAPSHOT.jar.jar /usr/local/lib/weather-app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "weather-app.jar"]