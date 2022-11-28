package com.interfaceDemo;

public class B extends A{

	@Override
	public int withdraw(int balance, int amount) {
		balance = balance - amount;
		return balance;
	}

}
