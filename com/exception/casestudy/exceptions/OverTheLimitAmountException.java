package com.exception.casestudy.exceptions;

import com.exception.casestudy.main.Ops;

public class OverTheLimitAmountException extends Exception{

	private double amount; 
	private double balance; 
	
	public OverTheLimitAmountException(double amount, double balance) {
		this.amount = amount;
		this.balance = balance;
	}
	
	public String getMessage(){
		String msg="Withdrawal cannot be processed \n"
				+"Current Balance: INR." +balance + "\n"
				+"Requested Amount: INR."+amount+ "\n"
				+"Max Limit allowed: INR."+Ops.limit+ "\n"
				+"Surplus amount requested: INR."+(amount-Ops.limit) ;
		
		return msg;
	}
}
