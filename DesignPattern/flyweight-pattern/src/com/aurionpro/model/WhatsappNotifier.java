package com.aurionpro.model;

public class WhatsappNotifier implements INotifier {

	@Override
	public void notifyUser(Account account, double transactionAmount, Transaction transactionType) {
		// TODO Auto-generated method stub
		System.out.println("-------- Whats app NOtification---------");
		System.out.println("Account Type :"+account.getAccountNumber());
		System.out.println( "Trtansaction type"+ transactionType);
		System.out.println( "Trtansaction Amount"+ transactionAmount);
		System.out.println("Account Balacne :"+account.getBalance());
		
		
	}

	@Override
	public String toString() {
		return "WhatsappNotifier ";
	}

//	@Override
//	public void notifyUser( Account account ) {
//		  System.out.println( "  your account info  send on whats app  "+account );
//		
//	}
	
	
}
