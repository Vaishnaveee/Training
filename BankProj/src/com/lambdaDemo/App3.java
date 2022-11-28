package com.lambdaDemo;

interface Animal { // Functional Interface: as it has only one anstract method
	void instinct();
}
public class App3 {
	public static void main(String[] args) {
		Pet pet = new Pet();
		Cat cat = new Cat();
		
		pet.display(() -> {
			System.out.println("Pet Instincts");
			
		});
		cat.display(() -> {
			System.out.println("Cat Instincts");
			
		});
	}
}
class Pet {
	void display(Animal a) {
		//you want to call instinct method
		a.instinct();
		 
	}
}
class Cat{
	void display(Animal a) {
		a.instinct();
	}
}



	 
	    
	
