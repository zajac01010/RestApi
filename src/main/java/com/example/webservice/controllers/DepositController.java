package com.example.webservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.webservice.services.AccountService;



@RestController
@RequestMapping("/deposit")
public class DepositController {
	
	@Autowired
	private AccountService accountService;
	
	@RequestMapping(value="/", method = RequestMethod.POST)
	public String makeDeposit(@RequestParam int amount, int accountId) {
		accountService.setAmount(amount, accountId);
		return null;
	}

}
