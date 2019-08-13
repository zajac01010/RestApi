package com.example.webservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webservice.dao.AccountServiceDAO;
import com.example.webservice.domain.Account;


@Service
public class AccountService {
	
	public static final String INSUFFICIENT_FUNDS = "Insufficient funds";
	
	@Autowired
	AccountServiceDAO accountServiceDAO;

	public String createNew() {
		return accountServiceDAO.createNew(); 
	}
	
	public void setAmount(int amount, int accountId) {
		accountServiceDAO.setAmount(amount, accountId);
	}
	
	public Integer getBalance(int accountId) {
		return accountServiceDAO.getBalance(accountId);
	}
	
	public String withdraw(int accountId, int amount) {
		if(getBalance(accountId) < amount) {
			return "Insufficient funds";
		} else {
			accountServiceDAO.withdraw(accountId, amount);
			return "Withdraw done, account State =" + getBalance(accountId);
		}
	}
	
	public String transfer(int accountFrom, int amountFrom, int accountTo, int amountTo) {
		if(withdraw(accountFrom, amountFrom).equals(INSUFFICIENT_FUNDS)) return INSUFFICIENT_FUNDS;
		else {
			setAmount(amountTo + amountFrom, accountTo);
			return "Transfer finished";
		}
	}
	
}
