# Use the httpd-parent image as base
FROM openjdk:8u302-jdk

EXPOSE 8080

USER 0
RUN mkdir /usr/myapp

COPY redhat-demo-externalservice-0.0.1.jar /usr/myapp

CMD java -jar /usr/myapp/redhat-demo-externalservice-0.0.1.jar
