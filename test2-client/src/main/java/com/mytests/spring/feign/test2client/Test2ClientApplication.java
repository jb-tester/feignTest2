package com.mytests.spring.feign.test2client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Test2ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Test2ClientApplication.class, args);
	}

}
