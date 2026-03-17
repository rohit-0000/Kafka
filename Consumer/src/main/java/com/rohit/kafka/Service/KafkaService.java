package com.rohit.kafka.Service;

import com.rohit.kafka.Entity.Course;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    private Course message ;

    @KafkaListener(topics = "topic1")
    public void consume(Course course){
        message = course;
        System.out.println(message);
    }

    public Course getMessage(){
        return message;
    }
}
