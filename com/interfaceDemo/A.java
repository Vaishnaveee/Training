package com.interfaceDemo;

abstract public class A implements Ops{

	@Override
	public int deposit(int balance, int amount) {
		balance = balance + amount;  
		return balance;
	}

}
