FROM openjdk:8-alpine

COPY target/uberjar/corolla-talk.jar /corolla-talk/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/corolla-talk/app.jar"]
