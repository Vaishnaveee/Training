package com.exceptiondemo;

public class App5 {
	public static void main(String[] args) {
			D d=new D(); 
			try {
				d.m1();
			}
			catch(ArithmeticException e) { 
				System.out.println("AE");
			}
			catch(RuntimeException e) { //RuntimeException e = new ArithmeticException();
				System.out.println("RE");
			}
			catch(Exception e) { //Exception e = new ArithmeticException();
				System.out.println("Ex");
			}
			
			System.out.println("Thanx");
	}
}

class D{
	void m1() {
		throw new ArithmeticException(); 
	}
}
/*
	In multiple catch blocks, follow the hierarchy small-->>large
*/