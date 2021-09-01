# Use the httpd-parent image as base
FROM openjdk:8u302-jdk

EXPOSE 8080

COPY camel-ose-springboot-xml-1.0.0-SNAPSHOT.jar /usr/src/myapp
WORKDIR /usr/src/myapp

CMD ["java","-jar","/usr/src/myapp/camel-ose-springboot-xml-1.0.0-SNAPSHOT.jar"]
