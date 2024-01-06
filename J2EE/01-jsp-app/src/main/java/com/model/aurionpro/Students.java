package com.model.aurionpro;

public class Students {


	private String  firstName;
	private String lastName;
	private boolean sportsPersom;
	private double percentage;
	public Students(String firstName, String lastName, boolean sportsPersom, double percentage) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.sportsPersom = sportsPersom;
		this.percentage = percentage;
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
	public boolean isSportsPersom() {
		return sportsPersom;
	}
	public void setSportsPersom(boolean sportsPersom) {
		this.sportsPersom = sportsPersom;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
}