package com.example.webservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.webservice.services.AccountService;

public class TransferController {
	
	@Autowired
	private AccountService accountService;
	
	@RequestMapping(value="/", method = RequestMethod.PUT)
	public String transfer(@RequestParam int accountFrom, int amountFrom, int accountTo, int amountTo) {
		return accountService.transfer(accountFrom, amountFrom, accountTo, amountTo);
	}

}
