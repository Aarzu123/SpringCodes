package com.kafka.mqc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NoteConsumerMsApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(NoteConsumerMsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(NoteConsumerMsApplication.class, args);
		
		logger.info("Running...");
	}

}
