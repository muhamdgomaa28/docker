#FROM adoptopenjdk/openjdk11:alpine-jre
FROM openjdk:8-jdk-alpine

ARG JAR_FILE=target/demo-0.0.1-SNAPSHOT.jar

#WORKDIR /opt/app

COPY ${JAR_FILE} demo-0.0.1-SNAPSHOT.jar
EXPOSE 8080

ENTRYPOINT ["java","-jar","demo-0.0.1-SNAPSHOT.jar"]

#CMD java -jar /deployments/myapp-1.0-SNAPSHOT.jar
#CMD java -jar /deployments/myapp-1.0-SNAPSHOT.jar