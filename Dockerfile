FROM eclipse-temurin:22-jre-alpine

WORKDIR /usr/src/app

COPY service/target/service-1.0-SNAPSHOT.jar appservice.jar
COPY consumer/target/consumer-1.0-SNAPSHOT.jar appconsumer.jar
COPY provider/target/provider-1.0-SNAPSHOT.jar appprovider.jar
COPY sekToEuroProvider/target/sekToEuroProvider-1.0-SNAPSHOT.jar appsekToEuroProvider.jar

ENTRYPOINT ["java","--module-path","/usr/src/app","--module","org.example.consumer/org.example.consumer.Main"]