package com.p3;

public class Customer {
	public int balance;

	public int deposit(int amount) {
		int temp = balance + amount;
		return temp;
	}
}
