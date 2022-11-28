package com.main;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
	public static void main(String[] args) {
		
	}
}

class Employee{
	String name;
	int salary;
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}

class EmployeeInfo{
	enum SortMethod{
		BYNAME,BYSALARY
	}
	
	public List<Employee> sort(List<Employee> list, final SortMethod method ){
		if(method.equals(SortMethod.BYNAME)) {
			
			 list= list.stream()
					.sorted(new A())
					.collect(Collectors.toList());
			
			list = list.stream()
						.sorted(Comparator.comparing(Employee :: getName))
						.collect(Collectors.toList());
			
		 
		}
		else {
			list = list.stream()
					.sorted(Comparator.comparingInt(Employee :: getSalary))
					.collect(Collectors.toList());
		 
		}
		 return list;
	}
	
	public boolean isCharacterPresentInAllNames(Collection<Employee> list, String character){
		boolean match = list.stream()
							.allMatch(e->e.getName().startsWith(character));
		 return match; 
	}
}
  
class A implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getName().compareTo(e2.getName());
	}
}








