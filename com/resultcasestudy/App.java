package com.resultcasestudy;

public class App {
	public static void main(String[] args) {
		Student s1 = new Student("harry potter", 250);
		
		A a=new A();
		try {
			double percent = a.computeResult(s1);
			System.out.println("Your result is " + percent);
		}
		catch(IllegalMarksException e) {
			System.out.println("Marks should be less than 300");
		}
		catch(InvalidMarksException e) {
			System.out.println("Marks cannot less than 0");
		}
	}
}
