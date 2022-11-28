package com.constructorDemo;

public class B extends A{

	@Override
	public void withdraw(Customer c, int amount) {
		int temp = c.getBalance() - amount; 
		c.setBalance(temp);
	}
}
