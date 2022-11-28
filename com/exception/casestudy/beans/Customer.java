package com.exception.casestudy.beans;

public class Customer {
	private String name; 
	private double balance; 
	
	public Customer(){ } //default constructor
	
	public Customer(String name, double balance){ //parameterized constructor
		this.name = name;
		this.balance = balance;
	}
	
	public String getName(){
		return name;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}
	
	@Override
	public String toString(){
		return "[name ="+name+",balance="+balance+"]";
	}
}




