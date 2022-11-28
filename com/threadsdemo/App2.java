package com.threadsdemo;

class AAA extends Thread{
	 void display() {
		 System.out.println(Thread.currentThread().getName());
	 }
	 @Override
	 public void run() {
		 display();
	 }
}

public class App2 {
	public static void main(String[] args) {
		AAA a=new AAA(); 
		a.setName("MyThread");
		a.start();
	}
}
