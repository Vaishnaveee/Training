package com.practiceQuestions1;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class EncapCaseStudy {

}
class Implementation{
	static Map<String, Long> getCount(List<Candidate> list){
		/*
		 * get the count of male and female employees from the list, 
		 * put it into a Map and return the Map
		 */
		return null; 
	}
	
	static Map<String, Double> getAverageAge(List<Candidate> list){
		/*
		 * return the average age of male and female employees
		 */
		return null; 
	}
	
	static Map<String, Long> countCandidatesDepartmentWise(List<Candidate> list){
		/*
		 * count and return the number of employees in each department
		 */
		return null;
	}
	
	static Optional<Candidate> getYoungestCandidateDetails(List<Candidate> list){
		/*
		 * Get the details of youngest male employee in the product development department
		 */
		return null;
	}
	}

class Candidate{
    String name;
    int id; 
    int age;
    String gender; 
    String department; 
    int yearOfJoining; 
    double salary; 

    Candidate(){

    }
    Candidate(int id, String name, int age, String gender, String department, int yearOfJoining, double salary ){
      this.id = id; 
      this.name = name;
      this.age = age; 
      this.gender = gender;
      this.department = department;
      this.yearOfJoining = yearOfJoining;
      this.salary = salary;
    }
    
    
     public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
                + department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
    }
}
/*
{Male=1, Female=1}
--------------------------------
{Male=28.0, Female=32.0}
--------------------------------
{Product Development=1, HR=1}
--------------------------------
Optional[Employee [id=144, name=Scarlet Jhonson, age=28, gender=Male, department=Product Development, yearOfJoining=2014, salary=32500.0]]
*/