package com.kafka.demo.kafka.demo.app.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * Kafka subscriber which will consume the message whenever there's a messages sent by the producer
 * **/
@Service
public class KafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

    /**
     * Subscribing to the "beverages" topic and the group ID "my-group-id"
     * **/
    @KafkaListener(topics = "beverages", groupId = "my-group-id")
    public void consume(String message){
        LOGGER.info(String.format("Messaged received by the consumer: %s", message));
    }
}
