package com.loops_arrays;
import java.util.Arrays;
public class Test {
	public static void main(String[] args) {
		
		//Type 1
		int[] x={2,5,1,3,7,4};
		System.out.println(x[2]);//1
		x[2] = 3;
		System.out.println(x[2]);//3
		 
		System.out.println(x.length); //6
		//x.length++; : length is a final field, cannot assign a value
		
		//System.out.println(x[6]); //ArrayIndexOutOfBoundsException: AIOOBE
		
		//Type 2 
		int[] arry = new int[5];
		
		arry[0] = 4; 
		arry[1] = 2; 
		
		System.out.println(arry[2]); //0
		
		//Type 3
		int[] arry1 = new int[] {4,3,6,2,7,1};
		System.out.println(arry1[2]);//6
		System.out.println("\n==========================\n");
		//Operations
		/*
		 * Iteration
		 */
		int[] ary = new int[] {5,3,7,8,1};
		System.out.println("\n*****Before Sorting*****");
		//for-each loop 
		for(int  temp:ary ) {
			System.out.print(temp + " ");
		}
		
		/*
		 * Sorting
		 */
		Arrays.sort(ary); //Adv Quick Sort : merge
		System.out.println("\n*****After Sorting*****");
		for(int  temp:ary ) {
			System.out.print(temp + " ");
		}
		
		System.out.println("\n*****Binary Searching*****");
		/*
		 * Searching : Binary Search
		 * *****After Sorting*****
				1 3 5 7 8 
		 */
		int index = Arrays.binarySearch(ary, 7);
		System.out.println(index);//3
		
		int index1 = Arrays.binarySearch(ary, 6); //(-(insertion point) - 1)
		System.out.println(index1);//-4
		
		int[] arry2 = {3,5,1,7,8}; //BS does not work as expected on unsorted array. 
		System.out.println(Arrays.binarySearch(arry2, 7));//-4
	}
}












