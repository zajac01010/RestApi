package com.example.webservice.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.webservice.services.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NewAccountController{
	
	@Autowired
	private AccountService accountService;
	
	@RequestMapping(value="/createNew")
	public String createNewAccount() {
		return accountService.createNew();
	}
}
