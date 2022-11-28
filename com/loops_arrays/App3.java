package com.loops_arrays;

public class App3 {
	public static void main(String[] args) {
		A a=new A(); 
		a.m1(1,2,4);
		a.m1();
		a.m1(1,2,4,5,6,7);
		a.m1(3);
	}
}


class A{

	public void m1(int... arry) { //var-args 
		
		for(int temp : arry) {
			System.out.print(temp + " ");
		}
		System.out.print("\n*****************\n");
	}
	
}