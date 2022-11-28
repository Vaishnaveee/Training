package com.staticdemo;
import static com.staticdemo.C.x;
import static com.staticdemo.C.display;

public class Test {
	public static void main(String[] args) {
		//Way 1: using Object 
		C c=new C();
		 System.out.println(c.x); //10
		 c.display();
		 
		//Way-2 : Using class
		System.out.println(C.x); //10
		C.display();
		
		//Way-3 : directly
		System.out.println(x);
		display();
		
	}
}	
 
/*
C.java
public class C {

static int x=10;

static void display() {
	System.out.println("display in C");
}
}

*/