FROM adoptopenjdk/openjdk15:alpine-slim
WORKDIR /tmp

COPY build/libs/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]