FROM openjdk:17-jdk

WORKDIR /app

COPY target/weather-app-0.0.1-SNAPSHOT.jar /app/weather-app-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "weather-app-0.0.1-SNAPSHOT.jar"]