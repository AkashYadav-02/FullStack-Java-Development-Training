package com.aurionpro.model;

public class User {
 private int id;
  private  String firstName;
  private String lastName;
  private String userName;
  private String PassWord;
  private int active;
  public User(int id, String firstName, String lastName, int active, String userName, String passWord) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.active = active;
	this.userName = userName;
	this.PassWord = passWord;
}
public int getActive() {
	return active;
}
public void setActive(int active) {
	this.active = active;
}

@Override
public String toString() {
	return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", active=" + active
			+ ", userName=" + userName + ", PassWord=" + PassWord + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassWord() {
	return PassWord;
}
public void setPassWord(String passWord) {
	PassWord = passWord;
}
public User(int id, String firstName, String lastName, String userName, String passWord) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.userName = userName;
	this.PassWord = passWord;
}
public User(int userId, String firstName, String userName, String passWord) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.userName = userName;
	PassWord = passWord;
}
  
}
