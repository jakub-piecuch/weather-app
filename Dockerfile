FROM openjdk:17-jdk

RUN chmod +x mvnw

COPY target/weatherapp-1.0.0.jar weatherapp.jar

EXPOSE 8080

CMD ["java", "-jar", "weatherapp.jar"]