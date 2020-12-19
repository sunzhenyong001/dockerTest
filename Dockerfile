FROM java:8
ADD ./target/dockertest.jar /Users/mm/Desktop/test/dockertest.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/Users/mm/Desktop/test/dockertest.jar"]
CMD ["java", "-version"]
