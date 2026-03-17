package com.rohit.kafka.Entity;

import lombok.Data;

@Data
public class Course {
    private String courseId;
    private String title;
    private String trainer;
    private double price;
}
