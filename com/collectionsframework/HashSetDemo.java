package com.collectionsframework;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(4);
		set.add(3);
		set.add(1);
		set.add(1); //ignores this
		set.add(null); //takes null
		System.out.println(set);
		
		Set<Employee> myset = new HashSet<>();
		Employee e1=new Employee(1,"harry potter",75000, "MAGIC");
		Employee e4=new Employee(4,"draco malfoy",110000, "STUDY");
		Employee e3=new Employee(3,"hermione granger",125000, "MAGIC");
		Employee e2=new Employee(1,"ronald weasley",65000, "STUDY");
		Employee e5=new Employee(4,"draco malfoy",110000, "STUDY");
		
		myset.add(e3); myset.add(e2); myset.add(e1); myset.add(e4);
		myset.add(e5);
		for(Employee e : myset) {
			System.out.println(e);
		}
		
	}
}
