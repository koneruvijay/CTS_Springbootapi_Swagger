package com.cognizant.springbootapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication//(scanBasePackages={"com.cognizant.springbootapi"})// same as @Configuration @EnableAutoConfiguration @ComponentScan combined
@EnableDiscoveryClient
public class SpringBootApi {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApi.class, args);
	}
}
