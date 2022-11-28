package com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App1 {
	public static void main(String[] args) {
		Product p1=new Product(1,"Oppo A13", 23000, "ABC Electronics");
		Product p2=new Product(2,"Samsung A13", 19000, "XYZ Electronics");
		Product p3=new Product(3,"Apple A13", 27000, "ABC Electronics");
		Product p4=new Product(4,"Nokia A13", 20000, "XYZ Electronics");
		List<Product> list = new ArrayList<>(Arrays.asList(p1,p2,p3,p4));
		
		/*
		 * count number of elements 
		 */
		long count = list.stream().count();
		System.out.println("Number of elements in the list: " + count);

		/*
		 * give the list of products having price greater than 20000
		 */
		
		List<Product> list1 = list.stream()
				.filter(p->p.getPrice()>=20000)
				.collect(Collectors.toList());
		
		System.out.println(list1);
		/*
		 * count no of products having price greater than 20000
		 */
		count = list.stream().filter(p->p.getPrice()>=20000).count();
		System.out.println("no of products having price greater than 20000: " + count);
		
		/*
		 * give the list of products having price greater than 20000 & sold by ABC Electronics
		 */
		
		List<Product> list2 = list.stream()
				.filter(p->p.getPrice() >= 20000)
				.filter(p->p.getVendorName().toLowerCase().equals("abc electronics"))
				.collect(Collectors.toList());
		
		System.out.println(list2);
	}
}





