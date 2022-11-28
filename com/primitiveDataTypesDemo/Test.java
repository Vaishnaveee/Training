package com.primitiveDataTypesDemo;

public class Test {
	public static void main(String[] args) {
		//primitive casting
		
		int i = (int)5.6f; 
		System.out.println(i);
		
		float f = (float)5.6; 
		
		float f1 = (int)3.6;
		System.out.println(f1); //3.0 
		
		double d = (long)4; //4.0 
		
		/*
		 * 32 <= 64 : does not work
		 */
		//float f2 = (double)4.5F; //CF 
		
		/*
		 *  4 <= 4.0 : loss of precision
		 */
		//int i1 = (float)4; //CF
		
		char c = 100; //48-57: 0-9   65-91: A-Z   97-122: a-z
		System.out.println(c);
		
	}
}





