package com.exceptiondemo;
import java.io.IOException;
public class App3 {
	public static void main(String[] args) {
		C c=new C(); 
		try {
			c.m1(99);
		}
		catch(IOException e) { //handling
			System.out.println("IO Exception thrown");
		}
		
		System.out.println("Thanx");
	}
}
class C{
    public void m1(int marks) throws IOException{ //warning 
    	if(marks>100)
		   throw new IOException(); //checked exception 
    	
    	System.out.println("Processed");
	}
}
/*
	When a checked Exception is thrown, the programmer has to 
	i.  warn about the exception
	ii. handle the exception in main
*/

/*
	In Unchecked exception, it is a choice of a programmer weather to warn/handle
	about the exception or not. 
*/