package com.exceptiondemo;

public class App {
	public static void main(String[] args) {
		A a=new A(); 
		try {
			int ans = a.m1(10,0); // new ArithmeticException();
			System.out.println("Ans is " + ans);
		}
		catch(NullPointerException e) { //NullPointerException e =  new ArithmeticException(); - POJO
			System.out.println("/ by Zero is not allowed.. ");
		}
		
		System.out.println("Thanx");
	}
}

class A{
    public int m1(int n1,int n2) {
		 return n1/n2;
	}
}
/*
 * task 1
 * task 2
 * task 3 
*/

/*
	Thread(main) - Handle the Exception
*/