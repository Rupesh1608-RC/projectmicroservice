package com.redbus.webservice.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
public class Day9MicroserviceclientStudentonsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day9MicroserviceclientStudentonsumerApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate rt() {

		RestTemplate rs = new RestTemplate();

		return rs;
	}

}
