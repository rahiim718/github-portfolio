package com.virtualpet.api.homework.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class AssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssignmentApplication.class, args);
		// var context = new SpringApplicationBuilder(ProjectConfig.class).web(WebApplicationType.SERVLET).run(args);
	}

}
