package com.exception.casestudy.service;

import com.exception.casestudy.beans.Customer;
import com.exception.casestudy.exceptions.InsufficientFundsException;
import com.exception.casestudy.exceptions.OverTheLimitAmountException;
import com.exception.casestudy.main.Ops;

public class B extends A{

	@Override
	public void withdraw(Customer c, double amount) throws InsufficientFundsException,OverTheLimitAmountException{
		if(amount > c.getBalance())
			throw new InsufficientFundsException(amount,c.getBalance());
		
		if(amount > Ops.limit)
			throw new OverTheLimitAmountException(amount,c.getBalance());
			
		 double temp = c.getBalance() - amount;
		 c.setBalance(temp);
	}

}
