package com.example.department_service.core.kafka;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaProducerService {

    @Value("${custom.kafka.department-topic-one}")
    private String topicNameOne;

    private final KafkaTemplate<String, String> kafkaTemplate;


    public String sendToDepartmentTopic(String message) {
        kafkaTemplate.send(topicNameOne, message);
        System.out.println("Sent message to department-topic: " + message);
        return message;
    }



}
