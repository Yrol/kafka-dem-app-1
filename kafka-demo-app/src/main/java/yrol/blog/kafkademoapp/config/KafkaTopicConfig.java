package yrol.blog.kafkademoapp.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
class KafkaTopicConfig {

    @Bean
    public NewTopic beveragesTopic() {
        return TopicBuilder.name("beverages").partitions(1).replicas(1).build();
    }
}