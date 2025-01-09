package com.example.department_service.util.Config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Value("${custom.kafka.department-topic-one}")
    private String topicNameOne;


    @Bean
    public NewTopic topicOne() {
        return TopicBuilder.name(topicNameOne).build();
    }

}
