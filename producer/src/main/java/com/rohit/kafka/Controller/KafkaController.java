package com.rohit.kafka.Controller;

import com.rohit.kafka.Entity.Course;
import com.rohit.kafka.Service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class KafkaController {

    @Autowired
    private KafkaService kafkaService;
    @PostMapping("/send")
    ResponseEntity<String> addCourse(@RequestBody Course course){
        String res = kafkaService.sendMessage(course);
        return new ResponseEntity<>(res, HttpStatus.CREATED);
    }
}
