package com.abstractdemo;

public class App {
	public static void main(String[] args) {
		 C c=new C(); 
		 c.validate();
		 c.debit();
		 c.credit();
	}
}
abstract class A{
	void validate() {
		System.out.println("validate");
	}
	
	abstract void debit();  
	
	abstract void credit();  
}
abstract class B extends A{
	
	void debit() {
		System.out.println("debit");
	}
}
class C extends B{
	void credit() {
		System.out.println("credit");
	}
}