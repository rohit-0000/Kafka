package com.rohit.kafka.Controller;


import com.rohit.kafka.Entity.Course;
import com.rohit.kafka.Service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consumer")
public class KafkaController {

    @Autowired
    private KafkaService kafkaService;
    @GetMapping("/get")
    ResponseEntity<Course> addCourse(){
        Course res = kafkaService.getMessage();
        return new ResponseEntity<>(res, HttpStatus.CREATED);
    }
}
