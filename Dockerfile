FROM openjdk:8
EXPOSE 8080
ADD target/SpringDemo-0.0.1-SNAPSHOT.jar SpringDemo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","SpringDemo-0.0.1-SNAPSHOT.jar"