package com.collectionsframework;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo1 {
	public static void main(String[] args) {
		Employee e1=new Employee(1,"harry potter",75000, "MAGIC");
		Employee e4=new Employee(4,"draco malfoy",110000, "STUDY");
		Employee e3=new Employee(3,"hermione granger",125000, "MAGIC");
		Employee e2=new Employee(2,"ronald weasley",65000, "STUDY");
		
		Set<Employee> set = new TreeSet<>();
		set.add(e3);set.add(e2);set.add(e1);set.add(e4);
		
		for(Employee e : set) {
			System.out.println(e);
		}
	}
}
