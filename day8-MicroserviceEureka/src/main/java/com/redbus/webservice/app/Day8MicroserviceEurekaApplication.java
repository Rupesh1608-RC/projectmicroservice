package com.redbus.webservice.app;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class Day8MicroserviceEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day8MicroserviceEurekaApplication.class, args);
		
		System.out.println("this is Eureka Server");
		
		
	}

}
