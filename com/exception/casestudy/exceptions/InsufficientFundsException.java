package com.exception.casestudy.exceptions;

public class InsufficientFundsException extends Exception{

	private double amount; 
	private double balance; 
	
	public InsufficientFundsException(double amount, double balance){
		this.amount = amount;
		this.balance =balance;
	}
	
	public String getMessage(){
		String msg ="Withdrawal cannot be processed \n" 
				+"Current Balance: INR."+balance + "\n"
				+"Requested Amount: INR."+amount + "\n"
				+"Funds Needed: INR."+ (amount-balance);
		return msg;
	}
}
