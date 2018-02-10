# Use an official Python runtime as a parent image
#FROM centos
FROM openjdk

# Dockerfile author / maintainer 
MAINTAINER Name sreeyakkanti@outlook.com

# Update application repository list and install the Redis server---->works for centos
#RUN yum update -y 

# install java---->works for centos
#RUN yum install -y java

VOLUME /tmp
ADD /maven/SpringBootH2Session-0.0.1-SNAPSHOT.jar myapp.jar
RUN sh -c 'touch /myapp.jar'

# Set the default command
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/ ./urandom","-jar","/myapp.jar"]