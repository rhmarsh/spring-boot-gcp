FROM java:8
EXPOSE 8080
ADD /target/userservice2-0.0.1-SNAPSHOT.jar userservice2-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "userservice2-0.0.1-SNAPSHOT.jar"]