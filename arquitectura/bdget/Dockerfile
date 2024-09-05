FROM openjdk:21-ea-24-oracle
WORKDIR /app
COPY target/bdget-0.0.1-SNAPSHOT.jar app.jar
COPY Wallet_Y60NFVNGVQD8DRN5 /app/oracle_wallet/
EXPOSE 8080


CMD ["java", "-jar", "app.jar"]

