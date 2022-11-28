package com.collectionsframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class App3 {
	public static void main(String[] args) {
		Employee e1=new Employee(1,"harry potter",75000, "MAGIC");
		Employee e2=new Employee(2,"ronald weasley",65000, "STUDY");
		Employee e3=new Employee(3,"hermione granger",125000, "MAGIC");
		Employee e4=new Employee(4,"draco malfoy",110000, "STUDY");
		
		List<Employee> list = new ArrayList<>();
		list.add(e1);list.add(e2);list.add(e3);list.add(e4);
		
		System.out.println("\n========Collections Sorting==========");
		 
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("\n----------DATASET------------");
			for(Employee e: list) {
				System.out.println(e);
			}
		System.out.println("Press 1 for Ascending sort");
		System.out.println("Press 2 for Descending Sort");
		System.out.println("Press 0 to Exit");
		int input = sc.nextInt();
		if(input == 0) {
			System.out.println("Exiting... Bye");
			break;
		}
		switch(input) {
		case 1: 
			Collections.sort(list,  new A()); //Ascending sort
			for(Employee e: list) {
				System.out.println(e);
			}
			System.out.println("---------------------------------");
			break;
		case 2: 
			Collections.sort(list,  new B()); //Ascending sort
			for(Employee e: list) {
				System.out.println(e);
			}
			System.out.println("---------------------------------");
			break;
		default: 
			System.out.println("\n Invalid Input.. \n ");
		}
		
		}
		
	}
}

class A implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		 
		if(e1.getSalary() > e2.getSalary()) { //75000 > 65000
			return 1;
		}
		else
		if(e1.getSalary() == e2.getSalary()) {
			return 0;
		}
		 
		return -1;
		 
		
		/*
		 * +ve: swap
		 * 0: similar: do nothing
		 * -ve: not do anything 
		 */
	}
	
}


class B implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.getSalary() > e2.getSalary()) { //75000 > 65000
			return -1;
		}
		if(e1.getSalary() < e2.getSalary()) { //65000 < 75000
			return 1;
		}
		
		return 0;
	}
	
}
