package com.loops_arrays;

import java.util.Scanner;

public class App5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("***********MENU************");
			System.out.println("1. Compute Tax");
			System.out.println("2. Exit");
			int input = sc.nextInt();
			if(input == 2) {
				System.out.println("Thank you .. exit...");
				break;
				}
			System.out.println("Enter your city");
			String city = sc.next();
			switch(city) {
			case "mumbai": 
				System.out.println("Your tax is 20%" );
				break;
			case "pune":
				System.out.println("Your tax is 18%" );
				break;
			case "jaipur":
				System.out.println("Your tax is 15%" );
				break;
			case "delhi":
				System.out.println("Your tax is 22%" );
				break;
			default:	
			
		}
			
			sc.close();
		}
	}
}
