package day14;

class A{
	int a;
	void display() {
		System.out.println("Value of the variable a is " +a);
	}
}

class B extends A{
	int b;
	void show() {
		System.out.println("Value of the variable b is :" +b);
	}
}

	
class C extends B{
	int c;
	
	void print() {
		System.out.println("Value of the variable c is :" +c);
	}
}

	

public class InheritanceTypes {

	public static void main(String[] args) {
		
		
		/*
		 * B obj=new B(); 
		 * System.out.println(obj.a); 
		 * System.out.println(obj.b);
		 * obj.display(); 
		 * obj.show();
		 */

		C obj1=new C();
		obj1.a=100;
		obj1.b=200;
		obj1.c=300;
		
		obj1.display();
		obj1.show();
		obj1.print();
		
	}

}
