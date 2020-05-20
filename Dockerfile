FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY /target/rabobank-0.0.1-SNAPSHOT.jar rabobank.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/rabobank.jar"]
