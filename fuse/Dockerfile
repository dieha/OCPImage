# Use the httpd-parent image as base
FROM openjdk:8u302-jdk

EXPOSE 8080

USER 0
RUN mkdir /usr/myapp

COPY camel-ose-springboot-xml-1.0.0-SNAPSHOT.jar /usr/myapp

CMD java -jar /usr/myapp/camel-ose-springboot-xml-1.0.0-SNAPSHOT.jar
