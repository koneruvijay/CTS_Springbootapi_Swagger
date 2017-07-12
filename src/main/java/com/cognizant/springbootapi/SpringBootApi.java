package com.cognizant.springbootapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication//(scanBasePackages={"com.cognizant.springbootapi"})// same as @Configuration @EnableAutoConfiguration @ComponentScan combined
public class SpringBootApi {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApi.class, args);
	}
}
