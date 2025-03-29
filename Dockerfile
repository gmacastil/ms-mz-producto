FROM openjdk:21-jdk

WORKDIR /application
COPY target/*.jar app.jar

ENV JAVA_OPTS=""

CMD java $JAVA_OPTS -jar /application/app.jar

