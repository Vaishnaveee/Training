package com.exceptiondemo;

public class App4 {
	public static void main(String[] args) {
		AA a=new AA(); 
		try {
			float f=3.5f;  //scope of f will only be in try block
			a.m1();
		}
		catch(NullPointerException npe) {
			//System.out.println(f); -CF
			System.out.println("String cannot be null");
		}
		finally {
			//System.out.println(f); --CF 
			a=null;
		}
		
	}
}

class AA{
	void m1() {
		String str= null;
		System.out.println(str.length());  
	}
}
/*
 * type 1: works
try{

}
catch(){

}

type 2: works
try{

}
finally{

}

type 3: works
try{

}
catch(){

}
finally{

}

type 4: 
try{

}
sysout(); //CF : catch block/ finally block should immediately be after try block. 
catch(){

}
 */
 