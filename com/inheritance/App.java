package com.inheritance;

public class App {
	public static void main(String[] args) {
		 Cat c = new Cat();
		 Dog d=new Dog(); 
		 c.traits();
		 d.traits();
		 c.sound();
		 d.sound();
	}
}
class Animal{
	
	public void traits() {
		System.out.println("Animal traits");
	}
}
class Cat extends Animal{
	
	public void traits(){
		System.out.println("Cat Traits");
	}
	
	public void sound() {
		System.out.println("Meow");
	}
}
class Dog extends Animal{
	
	public void sound() {
		System.out.println("Bhao");
	}
}