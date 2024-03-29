package com.aurionpro.model;

import java.time.LocalDateTime;

public class Transaction {
	int userId ;
	 int tid;
	int userAccount ;;
	String userAccountType;
	int userBalance;
	String transactionType;
	int baccount;
	int bamount ;
	String bname;
	public Transaction( int tid,int userId, int userAccount, String userAccountType, int userBalance, String transactionType,
			int baccount, int bamount, String bname) {
		super();
		this.tid=tid;
		this.userId = userId;
		this.userAccount = userAccount;
		this.userAccountType = userAccountType;
		this.userBalance = userBalance;
		this.transactionType = transactionType;
		this.baccount = baccount;
		this.bamount = bamount;
		this.bname = bname;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public Transaction(int tid,int userAccount, String userAccountType, int userBalance, String bname, int baccount,
			int bamount, String transactionType) {
		super();
		this.tid = tid;
		this.userAccount = userAccount;
		this.userAccountType = userAccountType;
		this.userBalance = userBalance;
		this.transactionType = transactionType;
		this.baccount = baccount;
		this.bamount = bamount;
		this.bname = bname;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(int userAccount) {
		this.userAccount = userAccount;
	}
	public String getUserAccountType() {
		return userAccountType;
	}
	public void setUserAccountType(String userAccountType) {
		this.userAccountType = userAccountType;
	}
	public int getUserBalance() {
		return userBalance;
	}
	public void setUserBalance(int userBalance) {
		this.userBalance = userBalance;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public int getBaccount() {
		return baccount;
	}
	public void setBaccount(int baccount) {
		this.baccount = baccount;
	}
	public int getBamount() {
		return bamount;
	}
	public void setBamount(int bamount) {
		this.bamount = bamount;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	@Override
	public String toString() {
		return "Transaction [userId=" + userId + ", tid=" + tid + ", userAccount=" + userAccount + ", userAccountType="
				+ userAccountType + ", userBalance=" + userBalance + ", transactionType=" + transactionType
				+ ", baccount=" + baccount + ", bamount=" + bamount + ", bname=" + bname + "]";
	}
	
}
