package com.finaldemo;

public class Test {
	public static void main(String[] args) {
			A a=new B();
			a.m1(); //m1 in B
			a.m2(); //M2 in A
	}
}
class A{
	void m1() {
		System.out.println("M1 in A");
	}
	
	final void m2() {
		System.out.println("M2 in A");
	}
}

class B extends A{  
	//2 - m1 and m2 
	
	void m1() {
		System.out.println("m1 in B");
	}
	
	/*
	 * void m2() { System.out.println(""); } CF
	 */
}