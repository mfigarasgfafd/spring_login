package com.example.spring_log123;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringLog123Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringLog123Application.class, args);
	}

}
