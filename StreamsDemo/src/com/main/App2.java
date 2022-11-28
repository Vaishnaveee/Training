package com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App2 {
	public static void main(String[] args) {
		Product p1=new Product(1,"Oppo A13", 23000, "ABC Electronics");
		Product p2=new Product(2,"Samsung A13", 19000, "XYZ Electronics");
		Product p3=new Product(3,"Apple A13", 27000, "ABC Electronics");
		Product p4=new Product(4,"Nokia A13", 20000, "XYZ Electronics");
		List<Product> list = new ArrayList<>(Arrays.asList(p1,p2,p3,p4));
		
		/*
		 * Calculate the sum of prices of all products. 
		 */
		double sumPrices = list.stream()
			.map(p->p.getPrice()) //[23,19,27,20]
			.reduce(0.0, Double :: sum);
		 
		System.out.println(sumPrices);
		
		/*
		 * Calculate the sum of prices of all products using Collectors 
		 */
		double sum1 =list.stream()
				.collect(Collectors.summingDouble(p->p.getPrice()));
		
		System.out.println(sum1);
	}
}
