package com.example.consuldiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsuldiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsuldiscoveryApplication.class, args);
	}
}
