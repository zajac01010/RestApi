package com.example.webservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.webservice.services.AccountService;

@RestController
@RequestMapping("/balance")
public class BalanceController {
	
	@Autowired
	private AccountService accountService;
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String getBalance(@RequestParam int accountId) {
		accountService.getBalance(accountId);
		return null;
	}
}
