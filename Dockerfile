FROM openjdk:8
RUN apt-get update
VOLUME /app
EXPOSE 8080
ADD  ./build/libs/superEbay-0.0.1-SNAPSHOT.jar superEbay.jar
ENV PATH ${PATH}:/usr/lib/jvm/java-8-openjdk-amd64/bin
ENTRYPOINT ["java", "-jar", "./superEbay.jar"]