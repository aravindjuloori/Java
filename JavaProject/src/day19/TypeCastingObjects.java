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
		 * System.out.println(c.name); 
		 * c.m1();
		 * System.out.println(c.id); 
		 * c.m2();
		 */
		
		Parent p=new Child();   //upcasting
		System.out.println(p.name);
		p.m1();
	

	}

}
