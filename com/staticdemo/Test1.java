package com.staticdemo;

public class Test1 {
	 
	static{
		System.out.println("static block");
	}
	
	{  
		System.out.println("anonymous block");
	}
	
	public static void main(String[] args) {
		Test1 t = new Test1();
		Test1 t1 = new Test1();
		 
	}
}
/*
 * NOTE: For every Object, anonymous block is called.
 */

/*
 * Static blocks are called whenever the class is loaded in the memory
 */
