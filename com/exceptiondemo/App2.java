package com.exceptiondemo;

public class App2 {
	public static void main(String[] args) {
		B b=new B(); 
		try {
			int ans = b.m1(10,0); // new ArithmeticException();
			System.out.println("Ans is " + ans);
		}
		catch(ArithmeticException e) {
			System.out.println("/ by Zero not allowed");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Check the index of the Array");
		}
		System.out.println("Thanx");
	}
}

class B{

	public int m1(int n1, int n2) throws ArithmeticException,ArrayIndexOutOfBoundsException {
		if(n2 == 0)
			throw new ArithmeticException(); //manually throwing an exception
		
		return n1/n2;
	}
	
}