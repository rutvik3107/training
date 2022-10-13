package com.rama.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class Application
{
	@GetMapping("/msg")
	public String getMessage(){
		return "Welcome Sivani!";
	}
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
