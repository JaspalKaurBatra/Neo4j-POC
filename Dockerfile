FROM openjdk:11.0-jdk
ADD ./target/neo4j-0.0.1-SNAPSHOT.jar /neo4j-poc/neo4j-0.0.1-SNAPSHOT.jar
WORKDIR /neo4j-poc
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "/neo4j-poc/neo4j-0.0.1-SNAPSHOT.jar"]
