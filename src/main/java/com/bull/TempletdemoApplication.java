package com.bull;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@SpringBootApplication
@RequestMapping
public class TempletdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TempletdemoApplication.class, args);
		System.out.println("templet demo started----" + new Date().toLocaleString());
	}

	@GetMapping(value = "/")
	public String index(){
		return "index.html";
	}

}

