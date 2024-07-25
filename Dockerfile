# FROM openjdk:11-jre-slim-buster
# COPY target/student-management-system-0.0.1.jar student-management-system-0.0.1.jar
# ENTRYPOINT ["java","-Dspring.profiles.active=local","-jar","-Dserver.port=8080","/student-management-system-0.0.1.jar"]


FROM openjdk:11-jre-slim-buster
EXPOSE 80
ADD target/student-management-system-0.0.1.jar student-management-system-0.0.1.jar
RUN ls
ENTRYPOINT ["java","-jar","/student-management-system-0.0.1.jar"]