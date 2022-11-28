package com.jpa.main.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
 

@Entity
@Table(name = "emp")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "empId")
	private Integer id;
	
	@Column(name = "ename", nullable = false)
	private String name;
	
	private double salary;
	
	private String city;
	 
	@OneToOne
	private Department department;
	
	@ManyToMany
	@JoinTable(
			name = "employee_project", 
			joinColumns = @JoinColumn(name="employee_id"),
			inverseJoinColumns = @JoinColumn(name="project_id") )
	private List<Project> project; 
	
	public Employee(Integer id, String name, double salary, String city) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.city = city;
	}

	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}


	public Department getDepartment() {
		return department;
	}


	public void setDepartment(Department department) {
		this.department = department;
	}


	public List<Project> getProject() {
		return project;
	}


	public void setProject(List<Project> project) {
		this.project = project;
	}

	
}
