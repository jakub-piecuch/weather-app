FROM openjdk:17-jdk

WORKDIR /app

RUN ""

COPY /target/weather-app-0.0.1-SNAPSHOT.jar /app/weatherapp.jar

EXPOSE 8080

CMD ["java", "-jar", "weatherapp.jar"]