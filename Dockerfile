FROM openjdk:17-jdk

RUN chmod +x mvnw

WORKDIR /app

COPY target/weatherapp-1.0.0.jar /app/springdemo.jar

EXPOSE 8080

CMD ["java", "-jar", "weatherapp.jar"]