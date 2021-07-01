package com.example.SpringDemoProjects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// This project is the Hello World Project

@SpringBootApplication
@RestController
public class SpringDemoProjectsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoProjectsApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
}
