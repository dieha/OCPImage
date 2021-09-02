# Use the httpd-parent image as base
FROM openjdk:8u302-jdk

EXPOSE 8080

USER 0
RUN mkdir /usr/myapp

COPY firstbk-poc-1.0.0.jar /usr/myapp

CMD java -jar /usr/myapp/firstbk-poc-1.0.0.jar
