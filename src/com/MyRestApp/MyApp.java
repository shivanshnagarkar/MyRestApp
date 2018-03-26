package com.MyRestApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.MyRestApp"})
public class MyApp {

	public static void main(String[] args) {
		System.out.println("******************************************");
		SpringApplication.run(MyApp.class, args);
	}
}
