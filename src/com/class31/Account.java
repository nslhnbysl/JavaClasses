package com.class31;

public class Account {

	private long accountNumber;//when we create a  private variables we can use them just in the same class 
	                           //to achieve to use these variables to another class we will create a public methods
	private double balance;
	
	//getters 
	public long getAccountNumber() { //we created a method to contains account number and we returned it 
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	//setters
	
	public void setBalance(int amount) { //we can provide additional verification 
		                                 //we can set the security 
		                                 //we can have more control on the data
		if(amount>0) {
			balance=balance+amount;
		}
		
	}
	
	public void setAccountNumber(long accountNumber) {
	if	(String.valueOf(accountNumber).length()==9){
			this.accountNumber=accountNumber;}
	}
	
}
