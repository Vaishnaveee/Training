package com.collectionsframework;

public class TypeParamDemo {
	public static void main(String[] args) {
		X x = new X(); 
		Integer[] i = new Integer[]{4,5,2,1,3,7};
		Float[] f = new Float[]{1F,2F,3F};
		String[] str = new String[]{"harry","ron"};
		
		x.display(i);
		x.display(f);
		x.display(str);
		
		/*
		 * Type parameter <T> does not work with primitive data types. 
		 * hence int[] i = new int[]{}; won't work. 
		 * we have to use class arrays so that JVM during runtime, can attach
		 * this class directly to <T>
		 */
	}
}

class X{
	/*
	 * Type Parameter
	 */
	<T> void display(T[] t){
		 for(T temp : t) {
			 System.out.print(temp + " ");
		 }
		System.out.println(""); 
	}
}
