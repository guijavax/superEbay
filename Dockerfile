FROM openjdk:8
RUN apt-get update
VOLUME /app
EXPOSE 8080
ADD  ./build/libs/superEbay-0.0.1-SNAPSHOT.jar superEbay.jar
ENTRYPOINT ["java", "-jar", "superEbay.jar"}