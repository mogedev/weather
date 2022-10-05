FROM openjdk:11.0.16
COPY target/clima-1.0.0.jar clima-1.0.0.jar
ENTRYPOINT ["java","-jar","/clima-1.0.0.jar"]