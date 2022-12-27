FROM eclipse-temurin:17-jre-alpine

RUN mkdir -p /opt/hipo-be-delivery/
WORKDIR /opt/hipo-be-delivery/

ARG JAR_FILE=hipo-be-delivery.jar

COPY ${JAR_FILE} /opt/hipo-be-delivery/app.jar
EXPOSE 8081

CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-Xms512m", "-Xmx1g", "-jar", "app.jar"]
