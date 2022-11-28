package com.resultcasestudy;

public class A implements Result{

	@Override
	public double computeResult(Student s) throws IllegalMarksException, InvalidMarksException{
		
		if(s.getMarks() > 300)
			throw new IllegalMarksException();
		
		if(s.getMarks() < 0)
			throw new InvalidMarksException();
		
		
		double percent = (s.getMarks() * 100) / Result.total; 
		return percent;
	}

}
