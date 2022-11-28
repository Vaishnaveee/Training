package com.loops_arrays;

public class App2 {
	public static void main(String[] args) {
		int[] arry = new int[] {1,2,3,4,5,6,7};
		
		/*
		 * Traditional For loop 
		 */
	 
		for(int i=0;i<arry.length ; i++ ) { //0---->5  //0 1 2 3 4 5
			System.out.print(arry[i] + " "); //0, 
		}
		
		//reverse of array
		System.out.println("\n***************\n");
		for(int i=arry.length-1 ; i>=0 ; i--) {  //5 ----> 0 
			System.out.print(arry[i] + " ");
		}
		
		/*
		 * for-each : cannot print reverse
		 */
		System.out.println("\n***************\n");
		for(int temp : arry) {
			System.out.print(temp + " ");
		}
		
		/*
		 * break & continue
		 * break: terminates the loop
		 * continue: goes to the loop statement again
		 */
		System.out.println("\n***************\n");
		 for( int i=0;i<arry.length ;i++) { //0-->5
			 
			 if(arry[i] % 2 == 0) {
				 System.out.print(arry[i] + " ");
				 continue;
			 }
			 
			 if(arry[i] == 5) 
				 break;
		 }
		 
		 /*
		  * while loop 
		  */
		 System.out.println("\n***************\n");
		 int i=0;
		 while(i<arry.length) { //0--->5
			 System.out.print(arry[i] + " ");
			 i++;
		 }
		 
		 
		
	}
}








