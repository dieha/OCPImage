# Use the httpd-parent image as base
FROM tomcat:jdk8

COPY tomcat-users.xml /usr/local/tomcat/conf/tomcat-users.xml  
COPY context.xml /usr/local/tomcat/conf/context.xml 
COPY manager /usr/local/tomcat/webapps/manager/
