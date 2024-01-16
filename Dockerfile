FROM amazoncorretto:17.0.7-alpine
ADD target/java2ec2-0.0.1-SNAPSHOT.jar java2ec2-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "java2ec2-0.0.1-SNAPSHOT.jar"]
EXPOSE 80