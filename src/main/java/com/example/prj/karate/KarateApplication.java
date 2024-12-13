package com.example.prj.karate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.prj")
public class KarateApplication {

	public static void main(String[] args) {
		SpringApplication.run(KarateApplication.class, args);
	}

}
