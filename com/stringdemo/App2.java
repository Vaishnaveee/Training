package com.stringdemo;

public class App2 {
	public static void main(String[] args) {
		//StringBuilder sb1="hello"; -CF
		/*
		 * Cannot create a literal with SB. it is only for String 
		 */
		StringBuilder sb1=new StringBuilder("abc");
		StringBuilder sb2=new StringBuilder("abc");
		
		System.out.println(sb1.equals(sb2)); //false
		System.out.println(sb1 == sb2); //false
	 	
		/*
		 * StringBuilder uses equals method of Object class which compares locations
		 * whereas String has its own overrided equals() method which compares values
		 * == for both classes compares locations
		 */
		sb1.append("pqr"); //abcpqr
		System.out.println(sb1);
		
		sb1.delete(1, 3);//apqr
		System.out.println(sb1);
		
		sb1.insert(1, "bc");
		System.out.println(sb1);
		
		sb1.reverse();
		System.out.println(sb1);
		
		/*
		 * Reverse the String
		 */
		String str="harry";
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println(sb);
		//abcpqr
		String s = sb1.reverse().substring(3);//pqr
		System.out.println(s);
		String s1 = sb1.substring(1,3);//bc
		System.out.println(s1);

	}
}
 
/*
	Object: equals() - (==) - compares locations
*/