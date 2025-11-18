package day1;

public class VariablesDemo {

	public static void main(String[] args) {
		
		//Declaring a variable
		
	//	int a;
		//a=5; //Assigning value to a variable
		
		int a1=5;  //Declaration+ assigning value
		
		System.out.println(a1);
		
		a1=200;
		System.out.println(a1);
		
		//Different approaches to create a variables
		
		//Approach 1  -- if all the variables belongs to different data types
		/*
		 * int a=100; int b=200; int c=300;
		 */
		
		
		
		//Approach 2-- if all the variables belongs to same data types
		/*
		 * int a,b,c; a=100; b=200; c=300;
		 */
		 
		 
		
		//Approach 3-- if all the variables belongs to same data types
		int a=100,b=200,c=300;
		System.out.println("The value of a is :" +a);
		System.out.println("The value of b is :" +b);
		System.out.println("The value of c is :" +c);
		
		System.out.println(a+" "+b+" "+c);

	}

}
