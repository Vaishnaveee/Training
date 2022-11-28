package com.lambdaDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

interface Res{
	int compute(int marks, int total);
}

interface Predicate <T>{
	boolean test(T t) ;
}
public class App4 {
	public static void main(String[] args) {
		F f=new F();
		f.displayResult( (k,v)  -> {
			return (k*100) / v;
		});
		
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(2);
		list.add(4);
		 
		list = list.stream().filter(  i ->i>3  )
		.collect(Collectors.toList());
		
		
		System.out.println(list);
	}
}


class F{
	void displayResult(Res r) {
		int percent = r.compute(170,200);
		System.out.println("You got " + percent);
	}
}

 