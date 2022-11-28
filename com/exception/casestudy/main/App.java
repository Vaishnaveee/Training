package com.exception.casestudy.main;

import com.exception.casestudy.beans.Customer;
import com.exception.casestudy.exceptions.InsufficientFundsException;
import com.exception.casestudy.exceptions.OverTheLimitAmountException;
import com.exception.casestudy.service.B;

public class App {
	public static void main(String[] args) {
		Customer c1 = new Customer("harry potter", 40000);
		Customer c2 = new Customer("ronald weasley", 35000);
		
		B b=new B();
		b.deposit(c1, 20000);
		b.deposit(c2, 10000);
		
		try {
			b.withdraw(c1, 53000);
			b.withdraw(c2, 15000);
		}
		catch(OverTheLimitAmountException e) { //OverTheLimitAmountException e = new OverTheLimitAmountException();
			System.out.println(e.getMessage());
		}
		catch(InsufficientFundsException e) { //InsufficientFundsException e= new InsufficientFundsException();
			System.out.println(e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Operation could not be performed at this time");
		}
		finally {
			b=null;
		}
		 
	 
	}
}
