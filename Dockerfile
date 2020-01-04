FROM java
WORKDIR /app
COPY myproject-0.0.1-SNAPSHOT.jar .
EXPOSE 30001
CMD ["java" ,"-jar", "myproject-0.0.1-SNAPSHOT.jar","&"]

