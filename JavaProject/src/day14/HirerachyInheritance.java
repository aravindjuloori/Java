package day14;

//hirerachy inheritance - 1 parent class will have multiple child class
class parent{
	
	void display(int a) {
		System.out.println(a);
	}
	
}

class child1 extends parent{
	void show(int b) {
		System.out.println(b);  //show and display
	}
}

class child2 extends parent{
	
	void print(int c) {           //print and display
		System.out.println(c);
	}
}
public class HirerachyInheritance {

	public static void main(String[] args) {
	
		
		child1 c1=new child1();
		c1.show(200);
		c1.display(100);
		
		child2 c2=new child2();
		c2.display(2000);
		c2.print(1000);

	}

}
