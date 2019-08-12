package com.example.webservice.dao;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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
	
	public void setAmount(int accountId, int amount) {
		Account updatedAccount = (Account) accountList.stream().filter(c -> c.getId().equals(accountId));
		updatedAccount.addAmount(amount);
		accountList.add(updatedAccount);
	}
	
	public Integer getBalance(int accountId) {
		Account checkedAccount  = (Account) accountList.stream().filter(c -> c.getId().equals(accountId));
		return checkedAccount.getAmount();
	}
	
	public void withdraw(int accountId, int amount) {
		Account updatedAccount = (Account) accountList.stream().filter(c -> c.getId().equals(accountId));
		updatedAccount.removeAmount(amount);
	}
	
}
