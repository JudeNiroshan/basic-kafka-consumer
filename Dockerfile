FROM registry.access.redhat.com/ubi8/openjdk-11

USER root

COPY ./target/kafka-consumer-0.0.1-SNAPSHOT.jar /opt/

RUN chmod +x /opt/kafka-consumer-0.0.1-SNAPSHOT.jar

CMD java -jar /opt/kafka-consumer-0.0.1-SNAPSHOT.jar
#CMD sleep infinity