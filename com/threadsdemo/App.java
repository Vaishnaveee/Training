package com.threadsdemo;

class A extends Thread{
	 void display() {
		 System.out.println(Thread.currentThread().getName());
	 }
	 @Override
	 public void run() {
		 display();
	 }
}

public class App {
	public static void main(String[] args) {
		 A a=new A();
		 Thread t1 = new Thread(a,"MyThread"); 
		 t1.start();
		 /*
		  * from start(), run() gets called. 
		  */
	}
}
