FROM openjdk:8-jdk-alpine
ARG JAR_FILE
ADD ${JAR_FILE} app.jar
CMD ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
#CMD ["/bin/sh","-c","while true; do sleep 2; echo ‘Testing top’; done"]


