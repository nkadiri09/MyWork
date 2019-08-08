package com.naren.readingproperties;

import lombok.extern.slf4j.Slf4j;

import org.apache.logging.log4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@Slf4j

@SpringBootApplication
public class Application {

	// Logger log =

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	
	

	@Bean
	public CommandLineRunner runner(SimpleProperties simpleProperties, NestedProperties nestedProperties) {

		return r -> {
			System.out.println(simpleProperties.getA());
			System.out.println(nestedProperties.getA().getB());

		};

	}
}