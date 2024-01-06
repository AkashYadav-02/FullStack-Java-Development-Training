package com.aurionpro.model;

public class Account {

	
	private int accountNumber;
	private String accountType;
	private int user_id;
	private int balance;
	
	public Account(int accountNumber, String accountType, int user_id, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.user_id = user_id;
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Account(String accountType, int user_id) {
		super();
		this.accountType = accountType;
		this.user_id = user_id;
	}

	
	public Account(String accountType, int user_id, int balance) {
		super();
		this.accountType = accountType;
		this.user_id = user_id;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountType=" + accountType + ", user_id=" + user_id
				+ ", balance=" + balance + "]";
	}
	
}
