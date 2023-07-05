package com.mirko.masters.bffservicerest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BffServiceRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BffServiceRestApplication.class, args);
	}

}
