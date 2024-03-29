package com.example.webservice.controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.webservice.services"})
@ComponentScan({"com.example.webservice.dao"})
public class App {

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);

	}

}
