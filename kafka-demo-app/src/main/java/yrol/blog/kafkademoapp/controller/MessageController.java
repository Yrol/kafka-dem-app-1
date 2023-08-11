package yrol.blog.kafkademoapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yrol.blog.kafkademoapp.dto.PublishDto;
import yrol.blog.kafkademoapp.kafka.KafkaProducer;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController {

    private KafkaProducer kafkaProducer;

    public MessageController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/publish")
    public ResponseEntity<PublishDto> publish(@RequestBody PublishDto publishDto){
        String message = publishDto.getMessage();
        PublishDto savePublishedDto = new PublishDto(publishDto.getMessage());
        kafkaProducer.sendMessage(message);
        return new ResponseEntity<>(savePublishedDto, HttpStatus.CREATED);
    }
}
