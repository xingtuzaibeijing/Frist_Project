package org.qhs.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;
@ComponentScan(basePackages="org.qhs.controller")
@EnableAutoConfiguration
@RestController
public class app {
	public static void main(String[] args) {
		// TODO Auto-generated method stub4
		System.out.println("112");
		SpringApplication.run(app.class, args);
	}
}
