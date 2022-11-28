package com.loops_arrays;

public class App1 {
	public static void main(String[] args) {
		//Type 1 : Fixed size 2D 
		
		int[][] arry = new int[2][3];
		System.out.println(arry); //mem loc
		System.out.println(arry[0]);//mem loc
		System.out.println(arry[1]);//mem loc
		
		arry[0][0] =4;
		//arry[0][1]
		arry[0][2]=2;		   
		//arry[1][0]
		arry[1][1]=1;
		//arry[1][2]		  
		
		for(int[] a : arry) { //1D[0] / 2D[1]
			for(int temp : a) { //values of 1D[0] - 2D[1]
				System.out.print(temp + " ");
			}
			System.out.println();
		}
		
		System.out.println("\n********************\n");
		
		//Type 2 Variable Size 2D
		int[][] arr = new int[2][];
		
		arr[0] = new int[] {1,2,3}; 
		arr[1] = new int[] {1,2};	
		
		for(int[] a : arr) { //1D[0] / 2D[1]
			for(int temp : a) { //values of 1D[0] - 2D[1]
				System.out.print(temp + " ");
			}
			System.out.println();
		}
		
		//Type 3: Anonymous
		int[][] arr1 = new int[][] {{1,2},{3,4},{5,6} };
		
		System.out.println(arr1[1][1]); //4
		
		
	}
}











