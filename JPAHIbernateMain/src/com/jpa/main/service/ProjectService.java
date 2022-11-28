package com.jpa.main.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.jpa.main.model.Employee;
import com.jpa.main.model.Project;

public class ProjectService {

	private EntityManager entityManager;
	
	public ProjectService(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public void populate() {
		 Project p1 = new Project();
		 p1.setName("Banking Project");
		 p1.setCredits(1000);
		 entityManager.persist(p1);
		 Project p2 = new Project();
		 p2.setName("Ecom Project");
		 p2.setCredits(800);
		 entityManager.persist(p2);
	}

	public void assignProjectToEmployee(int eid, int pid) {
		Employee employeeObj=  entityManager.find(Employee.class, eid);
		Project projectObj = entityManager.find(Project.class, pid);
		
		List<Project> list = employeeObj.getProject();
		list.add(projectObj);
		
		employeeObj.setProject(list);
		
		entityManager.persist(employeeObj);
		
	}

	public List<Project> fetchProjectByEmployeeId(int eidVal) {
		Query query= entityManager
				.createQuery("select p from Project p join p.employee e where e.id=:eid", Project.class);
		query.setParameter("eid", eidVal);
		
		return query.getResultList();
	}
 

	
}
