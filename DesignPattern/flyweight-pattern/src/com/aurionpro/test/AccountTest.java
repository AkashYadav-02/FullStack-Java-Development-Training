package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;

import com.aurionpro.model.Account;
import com.aurionpro.model.EmailNotifier;
import com.aurionpro.model.INotifier;
import com.aurionpro.model.SmsNotifier;
import com.aurionpro.model.WhatsappNotifier;

public class AccountTest {
//observer  pattern 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		new EmailNotifier();

		  INotifier i1=new EmailNotifier();
		  INotifier i2=new SmsNotifier();
		  INotifier i3=new WhatsappNotifier();

		Account obj = new Account(101, "akash ", 20000);
		Account obj2 = new Account(102, "yash", 200000);
		obj.registerNotifier(i1);
		obj.registerNotifier(i2);
		obj2.registerNotifier(i1);
		//obj.registerNotifier(i2);
		System.out.println("Before deposite  " + "\n" + obj+ "\n*******************************************  \n" );
		System.out.println("after deposite  " +"\n"+ "*******************************************  \n" );
		obj.deposit(200);
		System.out.println("*******************************************  ");

		System.out.println("Before withdraw   " + "\n" + obj+ "\n*******************************************  \n" );
		System.out.println("after withdraw  " +"\n"+ "*******************************************  \n" );

		obj.withdraw(2000);

		System.out.println("*******************************************  ");
		obj.deregisterNotifier(i1);
//		obj.registerNotifier(i2);
		
		obj2.deregisterNotifier(i1);
	}

}
