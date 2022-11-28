package com.collectionsframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App4 {
	public static void main(String[] args) {
		Employee e1=new Employee(1,"harry potter",75000, "MAGIC");
		Employee e2=new Employee(2,"ronald weasley",65000, "STUDY");
		Employee e3=new Employee(3,"hermione granger",125000, "MAGIC");
		Employee e4=new Employee(4,"draco malfoy",110000, "STUDY");
		
		List<Employee> list = new ArrayList<>();
		list.add(e1);list.add(e2);list.add(e3);list.add(e4);
		
		Collections.sort(list);
		
		for(Employee e: list) {
			System.out.println(e);
		}
	}
}
