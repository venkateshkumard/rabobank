FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} rabobank.jar
ENTRYPOINT ["java","-jar","/rabobank.jar"]
