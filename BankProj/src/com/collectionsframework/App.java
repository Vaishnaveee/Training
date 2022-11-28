package com.collectionsframework;
import java.util.ArrayList;
import java.util.List;
public class App {
	public static void main(String[] args) {
		 /*
		  * ArrayList : alternative to Arrays
		  */
		
		//Type 1 : pure
		ArrayList list1 = new ArrayList(); 
		
		//List list1 = new List(); //CF- List is an Interface, cannot instantiate
		
		//Type 2: polymorphic 
		List list = new ArrayList(); //preferred -- Raw
		
		/*
		 * Note: Always make list restricted to a particular type
		 */
		
		list.add(1);
		list.add(1.0F);
		list.add(1.0);
		list.add("abc");
		
		list.stream().forEach(e-> {
			 
		});
		System.out.println(list);
		
		List<Integer> lst = new ArrayList<>(); //generic Implementation 
		lst.add(1);
		lst.add(2);
		// lst.add(""); -- CF: cannot add anything other than int in the list as list is of type Integer
		System.out.println(lst);
	}
}






