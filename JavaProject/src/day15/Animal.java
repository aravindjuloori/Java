package day15;

public class Animal {

	String color="white";
	
	void eat() {
		System.out.println("Eating nothing");
	}
	
}

class Dog extends Animal{
	
	String color="Black";
	
	void displayColor() {
		System.out.println(super.color);
	}
	
	
	void eat() {
		//System.out.println("Eating bread");
		super.eat();
	}
	
}
