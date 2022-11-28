package com.main.model;

public class Student {
	private int id;
	private String name;
	private String city;
	private int age;
	private int departmentId;
	
	public Student() {
		super();
	}

	public Student(int id, String name, String city, int age, int departmentId) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.age = age;
		this.departmentId = departmentId;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", age=" + age + ", departmentId="
				+ departmentId + "]";
	}
	
	
}
