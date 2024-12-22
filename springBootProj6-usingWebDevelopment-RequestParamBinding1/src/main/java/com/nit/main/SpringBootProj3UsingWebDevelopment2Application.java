package com.nit.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@SpringBootApplication(scanBasePackages = "com.nit")
public class SpringBootProj3UsingWebDevelopment2Application {

	@Bean
	public RequestMappingHandlerMapping creatermhm()
	{
		return new RequestMappingHandlerMapping();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProj3UsingWebDevelopment2Application.class, args);
	}

}
