package day19;

class Parent{
	String name="john";
	
	void m1() {
		System.out.println("This is m1 from Parent");
	}
}
class Child extends Parent{
	int id=101;
	
	void m2() {
		System.out.println("This is m2 from the chid class");
	}
}

public class TypeCastingObjects {

	public static void main(String[] args) {
		
		/*
		 * Child c=new Child(); 
		 * System.out.println(c.name);   //parent
		 * c.m1();
		 * System.out.println(c.id);  //child
		 * c.m2();
		 */
		
		
		/*
		 * Parent p=new Child(); //upcasting 
		 * System.out.println(p.name); //Here we cannot access the child class variables and methods
		 *  p.m1();
		 */
		 
		
		Parent p=new Parent();  //Downcasting 
		Child c=(Child)p;
		
		System.out.println(c.name);
		System.out.println(c.id);
		c.m1();
		c.m2();
		 

	}

}
