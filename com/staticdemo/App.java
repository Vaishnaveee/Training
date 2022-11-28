package com.staticdemo;

public class App {
	public static void main(String[] args) {
		A a=new B(); 
		a.display(); //
	}
}


class A{ //super
	static void display() {
		System.out.println("display in A");
	}
}

class B extends A{ //sub
	static void display() {
		System.out.println("display in B");
	}
}