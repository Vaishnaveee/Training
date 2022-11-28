package com.jpa.main;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jpa.main.model.Employee;
import com.jpa.main.model.Project;
import com.jpa.main.service.DepartmentService;
import com.jpa.main.service.EmployeeService;
import com.jpa.main.service.ProjectService;

public class App {
	public static void main(String[] args) {
		/*
		 * EntityManagerFactory will help us reach out to persistence.xml settings
		 */
		EntityManagerFactory entityFactory = null;
		/*
		 * EntityManager will help us manage and perform operations on our entities
		 */
		EntityManager entityManager = null;
		/*
		 * EntityTransaction is needed so that all operations in DB happen as atomic
		 */
		EntityTransaction transaction = null;
		try {
			entityFactory = Persistence.createEntityManagerFactory("mycompanydb");
			entityManager = entityFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			
			
			Scanner sc = new Scanner(System.in);
			EmployeeService employeeService = new EmployeeService(entityManager);
			DepartmentService departmentService = new DepartmentService(entityManager);
			ProjectService projectService = new ProjectService(entityManager);
			while(true) {
				transaction.begin();
				System.out.println("----Employee Operations----");
				System.out.println("1. Insert employee");
				System.out.println("2. Fetch all employees");
				System.out.println("3. Update Employee");
				System.out.println("4. Delete Employee");
				System.out.println("5. Set Up/Populate Department");
				System.out.println("6. Employees by Department");
				System.out.println("7. Set Up/Populate Project");
				System.out.println("8. Assign project to employee");
				System.out.println("9. Project Information");
				System.out.println("10. Employee Information");
				System.out.println("11. Employee Stats by city");
				System.out.println("0. exit");
				int input = sc.nextInt();
				if(input == 0) {
					transaction.commit();
					break;
				}
				switch(input) {
				case 1: 
					Employee employee = new Employee();
					employee = employeeService.readEmployeeInput(employee);
					entityManager.persist(employee);
					System.out.println("Employee inserted in DB.");
					transaction.commit();
					break;
				case 2:
					List<Employee> list = employeeService.fetchAllEmployees();
					System.out.println("------ All Employee Details ----\n");
					for(Employee e: list) {
						System.out.print("Emplyee ID: " + e.getId());
						System.out.print(" ||  Emplyee Name: " + e.getName());
						System.out.print(" ||  Emplyee Salary: " +e.getSalary());
						System.out.print(" ||  Emplyee City: " + e.getCity());
						System.out.print(" ||  Department Name: " + e.getDepartment().getName());
						System.out.println();
					}
					transaction.commit();
					break;
				case 3:
					System.out.println("Enter ID of employee you want to update:");
					int eid = sc.nextInt();
					Employee e = employeeService.getEmployeeById(eid);
					if(e == null)
						throw new RuntimeException("Invalid ID");
					
					e =employeeService.readEmployeeInput(e);
					employeeService.updateEmployee(e);
					System.out.println("Employee Info updated...");
					transaction.commit();
					break;
				case 4:
					System.out.println("Enter ID of employee you want to delete:");
					eid = sc.nextInt();
					e = employeeService.getEmployeeById(eid);
					if(e == null)
						throw new RuntimeException("Invalid ID");
					employeeService.deleteEmployee(e);
					System.out.println("Employee deleted from DB...");
					transaction.commit();
					break;
				case 5: 
					departmentService.populate();
					System.out.println("departments added..");
					transaction.commit();
					break;
				case 6:
					System.out.println("Enter department ID:");
					int did=sc.nextInt();
					list =departmentService.fetchEmployeeByDepartment(did);
					System.out.println("------ All Employee Details ----\n");
					for(Employee emp: list) {
						System.out.print("Emplyee ID: " + emp.getId());
						System.out.print(" ||  Emplyee Name: " + emp.getName());
						System.out.print(" ||  Emplyee Salary: " +emp.getSalary());
						System.out.print(" ||  Emplyee City: " + emp.getCity());
						System.out.print(" ||  Department Name: " + emp.getDepartment().getName());
						System.out.println();
					}
					transaction.commit();
					break;
					
				case 7:
					projectService.populate();
					System.out.println("projects added..");
					transaction.commit();
					break;
				case 8:
					System.out.println("Enter Employee ID: ");
					eid = sc.nextInt();
					System.out.println("Enter Project ID: ");
					int pid = sc.nextInt();
					
					projectService.assignProjectToEmployee(eid,pid);
					System.out.println("Employee assigned to project..");
					transaction.commit();
					break;
				case 9:
					System.out.println("Enter Employee ID: ");
					eid = sc.nextInt();
					List<Project> listProj = projectService.fetchProjectByEmployeeId(eid);
					System.out.println("------List of Projects------");
					listProj.stream().forEach(p->{
						System.out.print(" Project Name: " + p.getName());
						System.out.print(" ||  Project Credits: " +p.getCredits());
						System.out.println("");
					});
					transaction.commit();
					break;
				case 10: 
					System.out.println("Enter Project ID: ");
					pid = sc.nextInt();
					
					//display the list of students working on the project.
					List<Employee> listEmp =employeeService.fetchEmployeeByProjectId(pid);
					System.out.println("------ All Employee Details ----\n");
					listEmp.stream().forEach(emp->{
						System.out.print("Emplyee ID: " + emp.getId());
						System.out.print(" ||  Emplyee Name: " + emp.getName());
						System.out.print(" ||  Emplyee Salary: " +emp.getSalary());
						System.out.print(" ||  Emplyee City: " + emp.getCity());
						System.out.print(" ||  Department Name: " + emp.getDepartment().getName());
						System.out.println();
					});
					transaction.commit();
					break;
					
				default:
					transaction.commit();
					break;
				}
				
			}
		} catch (Exception e) {
 			System.out.println(e);
 			transaction.rollback();
		}
		finally {
			entityManager.close();
			entityFactory.close();
		}
	}
}
