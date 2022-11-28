package com.loops_arrays;

/*
 * enumerated types : enum
 */
enum College{
	ABC,XYZ,PQR;
}
public class App4 {
	public static void main(String[] args) {
		College col =  College.ABC;
		System.out.println(col);
		
		System.out.println("\n********************");
		String colVal = College.XYZ.toString();
		System.out.println(colVal);
		
		System.out.println("\n********************");
		String str= "PQR";
		
		College c = College.valueOf(str);
		System.out.println(c);
		
		/*
		 * Note: If JVM could not convert string value to enum, it will
		 * throw IllegaArgumentException.
		 */
				
	}
}
