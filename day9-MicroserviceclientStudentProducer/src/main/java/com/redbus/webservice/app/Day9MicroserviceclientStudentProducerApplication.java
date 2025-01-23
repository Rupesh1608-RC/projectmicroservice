package com.redbus.webservice.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class Day9MicroserviceclientStudentProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day9MicroserviceclientStudentProducerApplication.class, args);
		
		System.out.println("Student producer");
	}

}
