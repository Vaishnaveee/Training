package com.constructorDemo;

public class Customer {
	private String name;
	private int balance;
	
	public Customer(){
		
	}
	
	Customer(String name, int balance){
		this.name = name;
		this.balance = balance;
	}
	
	//Getters
	public String getName(){
		return name; 
	}
	
	public int getBalance(){
		return balance;
	}
	
	//Setters
	public void setName(String name){
		this.name = name;
	}
	
	public void setBalance(int balance){
		this.balance = balance;
	}
	
	//toString
	@Override
	public String toString(){
		return "[name= "+ name + " balance= " + balance + "]";
	}
}





