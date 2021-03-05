package com.udacity.jwdnd.c1.review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewApplication.class, args);
	}

	@Bean
	public String message() {
		System.out.println("Creating message");
		return "Hello, Spring!";
	}

	@Bean
	public String uppercaseMessage(MessageService messageService) {
		System.out.println("Start service I");
		String res = messageService.uppercase();
		System.out.println(res);
		return res;
	}

	@Bean
	public String lowercaseMessage(MessageService messageService) {
		System.out.println("Start service II");
		String res = messageService.lowercase();
		System.out.println(res);
		return res;
	}

}
