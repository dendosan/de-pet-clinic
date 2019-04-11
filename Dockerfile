FROM adoptopenjdk/openjdk11:latest
LABEL maintainer="dendo74@hotmail.com"
COPY pet-clinic-web/target/pet-clinic-web-0.0.2-SNAPSHOT.jar /home/petclinic.jar
CMD ["java", "-jar", "/home/petclinic.jar"]
