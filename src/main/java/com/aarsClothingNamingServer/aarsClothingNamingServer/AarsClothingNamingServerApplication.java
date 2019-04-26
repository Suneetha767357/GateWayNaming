package com.aarsClothingNamingServer.aarsClothingNamingServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AarsClothingNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AarsClothingNamingServerApplication.class, args);
	}

}
