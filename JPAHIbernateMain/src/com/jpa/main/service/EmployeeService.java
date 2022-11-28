package com.jpa.main.service;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.jpa.main.model.Department;
import com.jpa.main.model.Employee;

public class EmployeeService {
	Scanner sc;
	EntityManager entityManager = null;

	public EmployeeService(EntityManager entityManager) {
		this.entityManager = entityManager;
		sc = new Scanner(System.in);
	}

	public Employee readEmployeeInput(Employee employee) {

		System.out.println("Enter Employee Name: ");
		String name = sc.next();
		employee.setName(name);

		System.out.println("Enter Employee Salary: ");
		double salary = sc.nextDouble();
		employee.setSalary(salary);

		System.out.println("Enter Employee City: ");
		String city = sc.next();
		employee.setCity(city);

		System.out.println("Enter Department ID: ");
		int deptId = sc.nextInt();
		Department d = entityManager.find(Department.class, deptId);
		employee.setDepartment(d);
		return employee;
	}

	public List<Employee> fetchAllEmployees() {
		List<Employee> list = entityManager.createQuery("select e from Employee e", Employee.class).getResultList();
		return list;
	}

	public Employee getEmployeeById(int eid) {
		return entityManager.find(Employee.class, eid);
	}

	public void updateEmployee(Employee e) {
		entityManager.persist(e);
	}

	public void deleteEmployee(Employee e) {
		entityManager.remove(e);
	}

	public List<Employee> fetchEmployeeByProjectId(int pidVal) {
		Query query = entityManager
				.createQuery("select e from Employee e join e.project p where p.id=:pid", Employee.class);
		query.setParameter("pid", pidVal);
		
		return query.getResultList();
	}

}
