package com.threadsdemo;

class B extends Thread{
	void display() {
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName());
	}
	
	@Override
	public void run() {
		 display();
	}
}
public class App4 {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(new B(),"T1"); 
		Thread t2 = new Thread(new B(),"T2"); 
		t1.start(); //T1
		t2.start(); //T2
		
		t1.join();
		t2.join();
		System.out.println("thanx"); //T1 T2 T1 thanx T2
	}
}
