package com.rohit.kafka.Service;

import com.rohit.kafka.Entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String,Course> kafkaTemplate;

    public String sendMessage(Course course){
//        kafkaTemplate.send("topic1",course); // publish to any partition
        kafkaTemplate.send("topic1","course",course); //publish to specific partition
        return "Course message sent to kafka server 😊";
    }
}
