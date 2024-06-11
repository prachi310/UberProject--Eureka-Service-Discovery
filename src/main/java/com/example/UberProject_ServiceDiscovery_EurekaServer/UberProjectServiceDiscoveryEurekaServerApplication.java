package com.example.UberProject_ServiceDiscovery_EurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UberProjectServiceDiscoveryEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UberProjectServiceDiscoveryEurekaServerApplication.class, args);
	}

}
