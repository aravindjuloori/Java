package day16;

interface Shape{
	
	int length=10;   //final & static
	int width=20;	//final & static
	
	void circle();  //Abstract method
	
	default void square() {   	//default method
		System.out.println("This is a square");
	}
	
	static void rectangle() {  	 //static method 
		System.out.println("this is rectangle");
	}
	
}

public class InterfaceDemo implements Shape {
	
	int x=100;
	int y=200;
	 public void circle() {
		System.out.println("This is circle-Abstract Method");
		
	}
	
	void triangle() {   //default method
		System.out.println("This an triangle");
	}
	
	
	public static void main(String[] args) {
		
		//Scenario 1
		InterfaceDemo id=new InterfaceDemo();
		id.circle();  //Abstract method
		id.square(); //default method
		Shape.rectangle();   //static method can directly access from interface
		id.triangle();
		
		//Scenario 2
		Shape sh=new InterfaceDemo();
		sh.circle();
		sh.square();
		Shape.rectangle();  //static method can directly access from interface
		//sh.triangle();  // we cannot access 
		System.out.println(Shape.length*Shape.width);
		id.triangle();
		System.out.println(id.x+id.y);
		
	
		
		
		
		
		
	}

}
