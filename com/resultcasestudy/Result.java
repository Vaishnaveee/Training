package com.resultcasestudy;

public interface Result {
	double total=300;
	double computeResult(Student s) throws IllegalMarksException, InvalidMarksException;
}
