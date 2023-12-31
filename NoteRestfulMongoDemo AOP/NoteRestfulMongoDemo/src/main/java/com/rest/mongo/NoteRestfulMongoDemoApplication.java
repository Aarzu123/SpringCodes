package com.rest.mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class NoteRestfulMongoDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoteRestfulMongoDemoApplication.class, args);
	}

}
