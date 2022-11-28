package com.exception.casestudy.service;

import com.exception.casestudy.beans.Customer;
import com.exception.casestudy.main.Ops;

public abstract class A implements Ops{

	@Override
	public void deposit(Customer c, double amount) {
		double temp = c.getBalance() + amount;
		c.setBalance(temp);
	}
}
