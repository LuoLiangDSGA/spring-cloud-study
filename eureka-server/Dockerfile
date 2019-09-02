FROM openjdk:8
ADD ./target/eureka-server-0.0.1-SNAPSHOT.jar /app.jar
WORKDIR /
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
EXPOSE 1111