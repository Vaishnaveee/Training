package com.lambdaDemo;
//Since 1.8 
interface Inter{ //abstract method -- functional interface 
	void m1();
	default void m2() {
		System.out.println("M2 in Inter");
	}
	static void m3() {
		System.out.println("static M3 in Inter");
	}
}

class A implements Inter{

	@Override
	public void m1() {
		System.out.println("M1 of Inter in A");
		
	}
	
}
public class App {
	public static void main(String[] args) {
		A a=new A();
		a.m1();
		a.m2();
		Inter.m3();
	}
}
