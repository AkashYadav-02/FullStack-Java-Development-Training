package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
	
	private  int accountNumber;
	
	private String name;
	private double  balance;
	
	private List<INotifier> notifiers ;

	public Account(int accountNumber, String name, double balance) {
       
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	 this.notifiers=new ArrayList<>();
		
	}
	
//	public Account() {
//		
//	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public List<INotifier> getNotifiers() {
		return notifiers;
	}

	public void setNotifiers(List<INotifier> notifiers) {
		this.notifiers = notifiers;
	}
	
	
	public void deposit(double amount) {
		this.balance+=amount;
		notifiers.stream().forEach(val->val.notifyUser(this, amount, Transaction.DEPOSITE));
		
	}
	
	
	public void withdraw(double amount) {
		this.balance-=amount;
		notifiers.stream().forEach(val->val.notifyUser(this, amount, Transaction.WITHDRAW));

	}
	 
	
	public void registerNotifier(INotifier notifier){
		System.out.println(notifier.toString()+"is register");
		this.notifiers.add(notifier);
		
		
		
		 
	}
	public void deregisterNotifier(INotifier notifier){
		System.out.println(notifier+"is deregister");
		this.notifiers.remove(notifier);
		
		
		
		 
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + 
				 "]";
	}
	
	
	


}
