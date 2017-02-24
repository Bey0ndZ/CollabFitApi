package com.collabfit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration // enable spring boot auto-config
@ComponentScan
public class CollabFitApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollabFitApiApplication.class, args);
	}
}
