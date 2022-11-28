package com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
	public static void main(String[] args) {
		Product p1=new Product(1,"Oppo A13", 23000, "ABC Electronics");
		Product p2=new Product(2,"Samsung A13", 19000, "XYZ Electronics");
		Product p3=new Product(3,"Apple A13", 27000, "ABC Electronics");
		Product p4=new Product(4,"Nokia A13", 20000, "XYZ Electronics");
		List<Product> list = new ArrayList<>(Arrays.asList(p1,p2,p3,p4));
		
		/*
		 * Generate the list having only price of the product
		 * List<Double> - all prices
		 */
		
		List<Double> list1 =list.stream()
								.map(p->p.getPrice())
								.collect(Collectors.toList());
		
		System.out.println(list1);
		
		List<String> list2 =list.stream()
				.map(p->p.getName())
				.collect(Collectors.toList());

		System.out.println(list2);
		
		List<String> list3 =list.stream()
				.map(p->p.getVendorName())
				.distinct()
				.collect(Collectors.toList());

		System.out.println(list3);
	}
}
