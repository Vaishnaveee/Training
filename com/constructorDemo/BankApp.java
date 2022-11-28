package com.constructorDemo;

public class BankApp {
	public static void main(String[] args) {
		Customer c1=new Customer("Harry Potter", 5000);
		
		B b=new B();
		b.deposit(c1, 1000);
		b.withdraw(c1, 2000);
		
		System.out.println(c1);
		
		
		Customer c2=new Customer("Ronald Weasley", 5000);
		
		b.deposit(c2, 4000);
		b.withdraw(c2, 2000);
		
		System.out.println(c2);
		
		
		 
	}
}
