package com.patroclos.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class PatroclosServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatroclosServiceApplication.class, args);
	}

}

