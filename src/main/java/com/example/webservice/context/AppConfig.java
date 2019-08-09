package com.example.webservice.context;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.webservice.services.AccountService;

@Configuration
@ComponentScan({"com.example.webservice.services"})
@ComponentScan({"com.example.webservice.dao"})
public class AppConfig {

		@Bean
		public AccountService accountService( ) {
			return new AccountService();}
}