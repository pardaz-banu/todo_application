package com.example.todoapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class TodoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

}

