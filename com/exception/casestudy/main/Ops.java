package com.exception.casestudy.main;

import com.exception.casestudy.beans.Customer;
import com.exception.casestudy.exceptions.InsufficientFundsException;
import com.exception.casestudy.exceptions.OverTheLimitAmountException;

public interface Ops {
	int limit = 50000;
	void deposit(Customer c, double amount);
	void withdraw(Customer c, double amount) throws InsufficientFundsException,OverTheLimitAmountException;
}
