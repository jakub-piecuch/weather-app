FROM openjdk:17-jdk

COPY target/weather-app-0.0.1-SNAPSHOT.jar weatherapp.jar

EXPOSE 8080

CMD ["java", "-jar", "weatherapp.jar"]