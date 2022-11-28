package com.lambdaDemo;

interface Inter1{
	void m1();
}
interface Result{
	public void compute(int marks);
}

public class App1 {
	 
	public static void main(String[] args) {
		Inter1 i = new Inter1() {
			@Override
			public void m1() {
				System.out.println("M1 overrided anonymously");
				
			}
		}; 
		
		i.m1();
		
		Result r = new Result() {
			public void compute(int marks) {
				System.out.println((marks*100) / 200);
			}
		};
		
		r.compute(170);
	}
}
