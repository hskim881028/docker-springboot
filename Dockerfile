FROM openjdk:8-jre
COPY target/docker-springboot-*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]