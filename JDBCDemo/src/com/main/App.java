package com.main;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.main.model.Student;
import com.main.service.StudentService;

public class App {
	public static void main(String[] args) {
		DBConfig db = new DBConfig();
		Scanner sc = new Scanner(System.in);  
		System.out.println("Welcome to the Project");
		Student s=new Student();
		StudentService studentService = new StudentService();
		while(true){
			System.out.println("****MAIN MENU******");
			System.out.println("Press 1. for insertion");
			System.out.println("Press 2. for deletion");
			System.out.println("Press 3. for updation");
			System.out.println("Press 4. for fetching the data");
			System.out.println("Press 0. to exit");
			System.out.println("*******************");
			int input = sc.nextInt();
			if(input == 0) { //termination condition- to come out of while
				System.out.println("Exiting... Bye!!");
				break;
			}	
			switch(input) {
			case 1:
				
				System.out.println("Enter Student Details");
				System.out.println("Enter student name");
				s.setName(sc.next()); //take input and save it in object
				System.out.println("Enter city");
				s.setCity(sc.next());
				System.out.println("Enter Age");
				s.setAge(sc.nextInt());
				System.out.println("Enter Department ID");
				s.setDepartmentId(sc.nextInt());
				db.insertStudent(s); //pass object to DB class
				System.out.println("Record Inserted...");
				break;
			case 2: 
				System.out.println("Deletion Operation");
				System.out.println("Enter Student ID to delete");
				int id = sc.nextInt();
				db.deleteStudent(id);
				System.out.println("Student Record Deleted...");
				break;
			case 3:
				System.out.println("Update Operation");
				System.out.println("Enter the ID of student to update");
				id = sc.nextInt();
				Student student = db.fetchStudentById(id);
				System.out.println("Existing details for student with ID "+ id + " are:");
				System.out.println(student.getName() + "   " + student.getCity() + "   " 
								   + student.getAge() + "  " + student.getDepartmentId());
				System.out.println("Please provide new details to update");
				System.out.println("Enter Student Details");
				System.out.println("Enter student name");
				s.setName(sc.next()); //take input and save it in object
				System.out.println("Enter city");
				s.setCity(sc.next());
				System.out.println("Enter Age");
				s.setAge(sc.nextInt());
				System.out.println("Enter Department ID");
				s.setDepartmentId(sc.nextInt());
				db.updateStudent(s,id);
				System.out.println("Student Info Updated...");
				break;
			case 4:
				System.out.println("All Student Records");
				System.out.println("**********************************************");
				System.out.println("ID\tNAME\t\tCITY\tAGE\tDEPT_ID");
				System.out.println("-----------------------------------------------");
				List<Student> list= db.fetchAllStudents();
				for(Student stud : list) {
					System.out.println(stud.getId() + "\t" + stud.getName() + "\t" 
							+ stud.getCity() + "   " + stud.getAge() + "\t" + stud.getDepartmentId());
				}
				System.out.println("**********************************************");
				while(true) {
					System.out.println("****Operations Menu****");
					System.out.println("Press 1 to sort the records as per age");
					System.out.println("Press 2 to group the records as per city");
					System.out.println("Press 3 to group the records as per departmentId");
					System.out.println("Press 11 to go back to main menu");
					int opInput = sc.nextInt();
					if(opInput == 11) {
						break;
					}
					switch(opInput) {
						case 1:
							System.out.println("*******Sorted List as per Age*****");
							System.out.println("ID\tNAME\t\tCITY\tAGE\tDEPT_ID");
							System.out.println("-----------------------------------------------");
							List<Student> sortedList = studentService.sortByAge(list);
							for(Student stud : sortedList) {
								System.out.println(stud.getId() + "\t" + stud.getName() + "\t" 
										+ stud.getCity() + "   " + stud.getAge() + "\t" + stud.getDepartmentId());
							}
							System.out.println("**********************************************");
							break;
						case 2:
							System.out.println("******Number of Students per city******");
							System.out.println("City\t\tNumber of Students");
							System.out.println("----------------------------");
							LinkedHashMap<String,Integer> map =db.fetchStudentsGroupByCity();
							for( Map.Entry<String, Integer> entry : map.entrySet()) {
								System.out.println(entry.getKey() + "                    " + entry.getValue());
							}
							System.out.println("----------------------------");
							break;
						case 3:
							break;
						default:
							
					}
					
				}
 				break;
			default:
				
			}
		}
	}
}
