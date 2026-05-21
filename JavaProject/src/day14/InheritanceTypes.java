package day14;

class A{
	int a;
	void display() {
		System.out.println("The value of a is :" +a);
	}
}

class B extends A{
	int b;
	 void show() {
		 System.out.println("The value of b is :"+b);
	 }
}

class C extends B{
	int c;
	void print() {
		System.out.println("The value of c is :" +c);
	}
}

	

public class InheritanceTypes {

	public static void main(String[] args) {
		
		/*
		 * A obj=new A(); 
		 * System.out.println(obj.a); 
		 * obj.display();
		 */
		
		/*
		 * B obj1=new B(); 
		 * System.out.println(obj1.a); 
		 * System.out.println(obj1.b);
		 * obj1.display(); 
		 * obj1.show();
		 */
		
		C obj2=new C();
		obj2.a=100;
		obj2.b=200;
		obj2.c=300;
		
		
		/*
		 * System.out.println(obj2.a); 
		 * System.out.println(obj2.b);
		 * System.out.println(obj2.c);
		 */
		obj2.display();
		obj2.show();
		obj2.print();
		
		

	}

}
