package com.interfaceDemo;

public class App {
	public static void main(String[] args) {
		 
		 Customer c = new Customer(); 
		 c.name="harry potter";
		 c.balance =5000; 
		 
		 B b=new B(); 
		 c.balance = b.deposit(c.balance, 1000);
		 System.out.println(c.balance); //6000
		 
		 c.balance = b.withdraw(c.balance, 2000);
		 System.out.println(c.balance); //4000
	}
}
 