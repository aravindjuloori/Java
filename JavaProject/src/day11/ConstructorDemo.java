package day11;

public class ConstructorDemo {
	
	int x;
	int y;
	
	ConstructorDemo(){   //default Constructor
		x=100;
		y=200;
	}
	
	ConstructorDemo(int a,int b){  //Parameterized constructor
		x=a;
		y=b;
		
	}
	
	void sum(){
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		
		//ConstructorDemo cd=new ConstructorDemo();  //invoke default constructor
		ConstructorDemo cd=new ConstructorDemo(100,200); //parameterized constructor
		cd.sum();
	}

}
