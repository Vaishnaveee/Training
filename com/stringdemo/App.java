package com.stringdemo;

public class App {
	public static void main(String[] args) {
		/*
		 * String can be created in 2 possible ways 
		 * 1. Literal : Goes in String Pool(Special memory) 
		 * 2. Object : goes in Heap
		 */
		//String Literal 
		String s1 ="hello java";
		
		//String Object
		String s2=new String("hello java");
		
		//Literal
		String s3 = "hello java";
		
		//String Object
		String s4=new String("hello java");
		
		/*
		 * Note: String-pool does not accept duplicates
		 */
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		/*
		 * Comparision
		 * equals() & == operator
		 */
		
		/*
		 * RULE: equals() in String compares values. 
		 * == operator compares locations
		 */
		
		System.out.println(s1.equals(s2)); //true  
		System.out.println(s1 == s2);//false
		
		System.out.println(s1.equals(s3)); //true
		System.out.println(s1 == s3); //true
		
		System.out.println(s2.equals(s4));//true
		System.out.println(s2==s4);//false
	}
}
