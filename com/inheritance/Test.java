package com.inheritance;

public class Test {
	public static void main(String[] args) {
			AA a=new AA(); 
			System.out.println(a.x); //5
			a.m1();
			
			BB bb = new BB();
			System.out.println(bb.x); //10
			bb.m1();
			
			AA aa = new BB(); //polymorphic 
			System.out.println(aa.x);//5
			aa.m1();
			
			aa.display(); //display in A
			//aa.display(5); //CF
			
			System.out.println(aa.compute());//10
	}
}
class AA{ //super
	int x=5;
	
	void m1() {
		System.out.println("M1 in A");
	}
	
	protected void display() {
		System.out.println("display in A");
	}
	
	public int compute() {
		return 10;
	}
}
class BB extends AA{ //sub
	int x=10;
	
	void m1() {
		System.out.println("M1 in B");
	}
	
	public void display(int x) {
		System.out.println("display in B");
	}
	
	public int compute(int x) {
		return 20;
	}
}