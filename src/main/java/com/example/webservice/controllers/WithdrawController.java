package com.example.webservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.webservice.services.AccountService;

@RestController
@RequestMapping(value = "/withdrawal")
public class WithdrawController {
	
	@Autowired
	private AccountService accountService;
	
	@RequestMapping(value="/", method = RequestMethod.PUT)
	public String withdraw(@RequestParam int amount, int accountId) {
		return accountService.withdraw(accountId, amount);
	}
}
