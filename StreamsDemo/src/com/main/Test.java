package com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>(
				Arrays.asList(new Student(1,"harry","EXTC"),new Student(2,"ron","MECH"),new Student(3,"draco","IT") ));
	
		
		System.out.println(countStudentgroupByDept(list));
	}
	
	static Map<String,Long> countStudentgroupByDept(List<Student> list){
		Map<String,List<Student>> map = list.stream()
					.collect(Collectors.groupingBy(Student :: getDept));
		
		HashMap<String,Long> map1=new LinkedHashMap<>(); 
		
		for(Map.Entry<String,List<Student>> entry: map.entrySet()) {
			String key = entry.getKey();
			long val = entry.getValue().size();
			map1.put(key, val);
		}
		return map1;
	}
}
/*
 * expected:<{[Female=2, Male=3]}> but was:<{[Male=3, Female=2]}

 */

class Student{
	int id;
	String name;
	String dept;
	public Student(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	
	
}