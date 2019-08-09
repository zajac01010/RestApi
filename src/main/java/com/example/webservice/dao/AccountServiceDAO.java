package com.example.webservice.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.example.webservice.domain.Account;

@Repository
public class AccountServiceDAO {
	
	//Set to prevent duplicates
	Set<Account> accountList = new HashSet<Account>();
	
	public String createNew() {
		Account newAccount = new Account();
		accountList.add(newAccount);
		return newAccount.getId().toString();
	}
	
	public void setAmount(int amount, int accountId) {
		Account updatedAccount = (Account) accountList.stream().filter(c -> c.getId().equals(accountId));
		updatedAccount.addAmount(amount);
		accountList.add(updatedAccount);
	}
	
	public String getBalance(int accountId) {
		Account checkedAccount  = (Account) accountList.stream().filter(c -> c.getId().equals(accountId));
		return checkedAccount.getAmount().toString();
	}
	
}
