FROM openjdk:8

RUN mkdir -p /opt/vijay/CTS_SpringBootAPI

ADD target/Cognizant_SpringBootAPI-1.0.0.jar /opt/vijay/CTS_SpringBootAPI/

EXPOSE 8081

CMD ["java", "-jar", "/opt/vijay/CTS_SpringBootAPI/Cognizant_SpringBootAPI-1.0.0.jar"]


