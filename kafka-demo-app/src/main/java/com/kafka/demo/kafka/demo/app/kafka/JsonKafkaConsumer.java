package com.kafka.demo.kafka.demo.app.kafka;

import com.kafka.demo.kafka.demo.app.dto.UserDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "users", groupId = "my-group-id")
    public void consume(UserDto user) {
        LOGGER.info(String.format("Json message received: %s", user.toString()));
    }
}