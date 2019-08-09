package com.example.webservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webservice.dao.AccountServiceDAO;
import com.example.webservice.domain.Account;


@Service
public class AccountService {
	
	@Autowired
	AccountServiceDAO accountServiceDAO;

	public String createNew() {
		return accountServiceDAO.createNew(); 
	}
	
	public void setAmount(int amount, int accountId) {
		accountServiceDAO.setAmount(amount, accountId);
	}
	
	public String getBalance(int accountId) {
		return accountServiceDAO.getBalance(accountId);
	}
	
}
