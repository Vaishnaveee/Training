package com.constructorDemo;

public class App {
	public static void main(String[] args) {
		 AA a=new AA();
		 System.out.println(a.getX());
		 System.out.println(a.getY());
		 
		 a.setX(10);
		 a.setY(20);
		 a.m1();
		 
		 AA a2=new AA(10,15);
		 a2.m1();
		 
		 System.out.println(a);
		 System.out.println(a2);
	}
} 

class AA extends Object{

	private int x=5;
	private int y=10;
	
	AA(){
		
	}
	
	AA(int x, int y){
		this.x = x;
		this.y=y;
	}
	
	public void m1() {
		 System.out.println(x+y);
	}
	
	//getters
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	//setters
	public void setX(int x){
		this.x=x;
	}
	
	public void setY(int y){
		this.y=y;
	}
	
	@Override
	public String toString(){
		return "[x= "+ x + " y=" + y + "]";
	}
}






 