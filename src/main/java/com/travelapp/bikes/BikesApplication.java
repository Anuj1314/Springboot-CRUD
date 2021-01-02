package com.travelapp.bikes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class BikesApplication {

	private static final org.slf4j.Logger LOGGER = org.slf4j.LoggerFactory.getLogger(BikesApplication.class);

	public static void main(String[] args) {
		try {
			LOGGER.info("Application starting....");
			SpringApplication.run(BikesApplication.class, args);
			LOGGER.info("Application started: {}");
		}catch (Exception e ){
			LOGGER.error("Exception occurred while starting the application", e);
			System.exit(0);
		}
	}
}
