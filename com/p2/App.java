package com.p2;
  
import com.p3.Customer;
import com.p3.D;
public class App {
	public static void main(String[] args) { //main <ctrl + space>
		/*
		A a=new A(); 
		 a.display();
		 
		 a.sum(12,5);
		 
		 int result = a.compute(5);
		 System.out.println("Result is " + result);
		 
		 a.m1(12,4);
		 int val = a.m2();
		 System.out.println("Sum is " + val);
		 
		 int percent = a.computeResult(120,200); //marks=83  , total=100 : (marks*100/total)
		 System.out.println("You secured " + percent);
		 */
		/*
		B b=new B(); 
		B b1=new B();
		
		System.out.println(b.i);//0
		b.i=10;
		System.out.println(b.i);//10 
		
		System.out.println(b1.i); //0
		b1=b; 
		System.out.println(b1.i);//10
		*/
		
		/*
		Customer c1 = new Customer(); 
		c1.balance=5000; 
		c1.balance = c1.deposit(1000);
		System.out.println(c1.balance); //6000
		
		Customer c2 = new Customer(); 
		c2.balance = c2.deposit(3000);
		System.out.println(c2.balance); //3000
		*/
		
		D d=new D(); 
		d.x=12; 
		D d1=new D(); 
		d1=d; 
		System.out.println(d.x); //?
		System.out.println(d1.x);//?
		d.x=16; 
		System.out.println(d1.x);//?
	}
}
















 