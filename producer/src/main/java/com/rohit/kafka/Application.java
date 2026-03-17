package com.rohit.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

/*
* kafka-topics.bat --create --topic topic1 --bootstrap-server localhost:9092 --partitions 4 --replication-factor 2
* kafka-topics.bat --describe topic1 --bootstrap-server localhost:9092
* kafka-topics.bat --list --bootstrap-server localhost:9092
* */
