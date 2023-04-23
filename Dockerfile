FROM openjdk:17-jdk

WORKDIR /app

COPY target/weather-app-0.0.1-SNAPSHOT.jar /app/weatherapp.jar

EXPOSE 8090

CMD ["java", "-jar", "weatherapp.jar"]