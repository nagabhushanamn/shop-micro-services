FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/product-catalog-service-0.0.1-SNAPSHOT.jar pc.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /pc.jar