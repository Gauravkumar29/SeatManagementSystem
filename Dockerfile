# FROM openjdk:11-jre-slim-buster
# COPY target/student-management-system-0.0.1.jar student-management-system-0.0.1.jar
# ENTRYPOINT ["java","-Dspring.profiles.active=local","-jar","-Dserver.port=8080","/student-management-system-0.0.1.jar"]


FROM openjdk:11-jre-slim-buster
#
# WORKDIR /app
# COPY target/student-management-system-0.0.1.jar /app/student-management-system-0.0.1.jar
ADD target/student-management-system-0.0.1.jar student-management-system-0.0.1.jar
# RUN ls
EXPOSE 80
ENTRYPOINT ["java","-jar","/student-management-system-0.0.1.jar"]