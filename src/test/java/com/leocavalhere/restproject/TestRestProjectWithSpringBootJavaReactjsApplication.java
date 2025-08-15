package com.leocavalhere.restproject;

import org.springframework.boot.SpringApplication;

public class TestRestProjectWithSpringBootJavaReactjsApplication {

	public static void main(String[] args) {
		SpringApplication.from(RestProjectWithSpringBootJavaReactjsApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
