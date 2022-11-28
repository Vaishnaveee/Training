package com.jpa.main.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.jpa.main.model.Department;
import com.jpa.main.model.Employee;

public class DepartmentService {

	private EntityManager entityManager; 
	
	public DepartmentService(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public void populate() {
		Department d1 = new Department();
		d1.setName("IT");
		entityManager.persist(d1);
		Department d2 = new Department();
		d2.setName("SALES");
		entityManager.persist(d2);
	}

	public List<Employee> fetchEmployeeByDepartment(int didValue) {
		Query query = entityManager
					.createQuery("select e from Employee e where e.department.id=:did",Employee.class);
		query.setParameter("did", didValue);
		List<Employee> list = query.getResultList();
		return list;
	}
}






