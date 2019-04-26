package com.cg.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

// to make controller scan explicitly when not able to scan automatically 
@ComponentScan("com.cg.controller")
@ComponentScan("com.cg.dao")
@ComponentScan("com.cg.service")
@ComponentScan("com.cg.model")

//defines the base package
@EntityScan(basePackages = {"com.cg"})

//defines the application as spring boot application
@SpringBootApplication
public class IncomeTaxProgramApplication {

	public static void main(String[] args) {
		SpringApplication.run(IncomeTaxProgramApplication.class, args);
	}

}
