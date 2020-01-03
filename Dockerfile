FROM java
WORKDIR /app
COPY myproject-0.0.1-SNAPSHOT.jar .
EXPOSE 30001
ENTRYPOINT ["java","-jar","myproject-0.0.1-SNAPSHOT.jar"]
