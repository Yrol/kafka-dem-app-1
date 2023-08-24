package com.kafka.demo.kafka.demo.app.controller;

import com.kafka.demo.kafka.demo.app.dto.UserDto;
import com.kafka.demo.kafka.demo.app.kafka.JsonKafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka/user")
public class JsonUserMessageController {

    private JsonKafkaProducer jsonKafkaProducer;

    public JsonUserMessageController(JsonKafkaProducer jsonKafkaProducer) {
        this.jsonKafkaProducer = jsonKafkaProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody UserDto userDto) {
        jsonKafkaProducer.sendMessage(userDto);
        return ResponseEntity.ok("User details have been sent to Kafka successfully");
    }
}