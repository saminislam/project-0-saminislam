package com.project0;

public class Account extends Customer {

	String AccountName;
	public double amount;
	
	
	public Account() {
		super();
	}
	
	
	public Account(String AccountName, double amount) {
		this.AccountName = AccountName;
		this.amount = amount;
	}
	
	public String toString() {
		return ("Account Name: " + this.AccountName + '\n' + "Ammount: " + this.amount);
		
	}

	
	


	

}
