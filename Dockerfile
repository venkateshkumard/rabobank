#FROM openjdk:8-jdk-alpine
#RUN mkdir -p /usr/rabobank
#COPY ./target/rabobank-0.0.1-SNAPSHOT.jar /usr/rabobank
#WORKDIR /usr/rabobank
#EXPOSE 8080
#CMD ["java", "-jar", "rabobank-0.0.1-SNAPSHOT.jar"]

FROM openjdk:8-jdk-alpine
#ARG JAR_FILE=*.jar
#COPY ${JAR_FILE} rabobank.jar
#ENTRYPOINT ["java","-jar","/rabobank.jar"]
