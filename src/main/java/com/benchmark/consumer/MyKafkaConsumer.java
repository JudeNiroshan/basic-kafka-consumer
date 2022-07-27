package com.benchmark.consumer;

import lombok.extern.apachecommons.CommonsLog;
import org.apache.avro.generic.GenericRecord;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@CommonsLog(topic = "Consumer Logger")
public class MyKafkaConsumer {

    @KafkaListener(groupId = "#{systemEnvironment['GROUP_ID']}", topics = "#{systemEnvironment['TOPIC']}")
    public void consume(ConsumerRecord<String, GenericRecord> record) {
//        log.info(String.format("Consumed message -> %s", record.value()));
    }
}
