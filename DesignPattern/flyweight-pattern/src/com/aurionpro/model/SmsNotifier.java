package com.aurionpro.model;

public class SmsNotifier  implements  INotifier {

	@Override
	public void notifyUser(Account account, double transactionAmount, Transaction transactionType) {
		// TODO Auto-generated method stub
		System.out.println("-------- SMS Notification ---------");
		System.out.println("Account Type :"+account.getAccountNumber());
		System.out.println( "Trtansaction type"+ transactionType);
		System.out.println( "Trtansaction Amount"+ transactionAmount);
		System.out.println("Account Balacne :"+account.getBalance());
		
		
	}

//	@Override
//	public void notifyUser( Account account ) {
////		  System.out.println( "  your account info send  via sms"+account);
//		
//	}
	@Override
	public String toString() {
		return "SMSNotifier ";
	}

}
