package com.collectionsframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class App2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(5);
		list.add(1);
		list.add(4);
		//[3,5,1,2]
		System.out.println(list);
		
		System.out.println("=====Iteration using for loop=====");
		
		for(int i : list) {
			System.out.print(i + "  ");
		}
		
		System.out.println("\n=======Iteration using Iterator Interface======");
		Iterator<Integer> itr = list.iterator();//itr=[3,5,1,2]
		
		while(itr.hasNext()) {
			System.out.print(itr.next() + "  "); //3 5 1 2
		}
		
		System.out.println("\n====Sorting the list======");
		Collections.sort(list);
		
		for(int i : list) {
			System.out.print(i + "  ");
		}
		System.out.println("\n");
		//Notable methods 
		/*
		 * If we go beyond the available index it will throw: IndexOutOfBoundsException
		 */
		int ele = list.get(2); //[1,2,3,5]
		System.out.println(ele); //3
		
		//remove method
		list.remove(2);
		System.out.println("\n" +list); //[1,2,5]
		
		//sublist
		List list1 = list.subList(1, 3);
		System.out.println("\n" +list1);//[2,5]
		
		//searching
		System.out.println();
		int e = 4;
		boolean status = list.contains(e);
		System.out.println(status?"element present" : "not present");
	}
}







