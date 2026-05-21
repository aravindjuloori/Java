package day14;

//hirerachy inheritance - 1 parent class will have multiple child class


	
class parent{
	
void display(int a) {
	System.out.println("The value of a is :" +a);
}
}

class child1 extends parent{
	void show(int b) {
		System.out.println("The value of b is :"+b);
	}
}

class child2 extends parent{
	void print(int c) {
		System.out.println("The value of c is:"+c);
	}
}

public class HirerachyInheritance {
	
	public static void main(String[] args) {
		
		child1 ch1=new child1();
		ch1.show(100);
		ch1.display(200);
		

		child2 c2=new child2();
		c2.display(2000);
		c2.print(1000);
		
	
	
	}

}
