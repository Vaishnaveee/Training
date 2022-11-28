package com.primitiveDataTypesDemo;

public class App {
	public static void main(String[] args) {
		int x=5; 
		
		/*
		 * 32  <= 32 -works    
		 * 5.0 <= 5 : gaining of precision
		 */
		float f = x;   //5.0
		System.out.println(f);
		
		/*
		 * 32 <= 64 : dows not work
		 */
		// float f1= 3.4; //CF
		
		/*
		 * 32 <= 32 - works
		 * 4.0 <= 4 : gain of precision 
		 */
		float f2 = 4; //4.0
		
		/*
		 * 64 <= 32 - works
		 * 5 <= 5
		 */
		long l = 5; 
		
		/*
		 * 64 <= 32 : works
		 * 5.0 <= 5 : gain the precision
		 */
		double d = 5; 
		
		/*
		 * 64 <= 64 : works
		 * 5 <= 5.0 : loss of precision 
		 */
		//long l1 = 5.0; 
		
		/*
		 * 56 is not an int. 
		 */
		short s = 56; 
		
		/*
		 * 34 is not an int
		 */
		byte b = 34; 
		
	}
}



