package com.aurionpro.model;

public class Admin {
  private int id;
  private String userName;
  private String passWord;
public Admin(String userName, String passWord) {
	super();
	this.userName = userName;
	this.passWord = passWord;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassWord() {
	return passWord;
}
public void setPassWord(String passWord) {
	this.passWord = passWord;
}
public Admin(int id, String userName, String passWord) {
	super();
	this.id = id;
	this.userName = userName;
	this.passWord = passWord;
}
@Override
public String toString() {
	return "Admin [id=" + id + ", userName=" + userName + ", passWord=" + passWord + "]";
}
  
}
