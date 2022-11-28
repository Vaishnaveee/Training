package com.constructorDemo;

abstract public class A implements Ops{

	@Override
	public void deposit(Customer c, int amount) { //c=100x, amount=1000
		 int balance = c.getBalance() + amount;  //6000
		 c.setBalance(balance);
	}

	

}
