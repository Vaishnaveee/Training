package com.threadsdemo;

class AA implements Runnable{
	
	void display() {
		 System.out.println(Thread.currentThread().getName());
	 }
	
	@Override
	 public void run() {
		 display();
	 }
}
public class App1 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new AA(), "MyThread");
		t1.start();
	}
}
