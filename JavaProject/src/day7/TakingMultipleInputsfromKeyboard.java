package day7;

import java.util.Scanner;

public class TakingMultipleInputsfromKeyboard {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		/*Ex1:
		 * System.out.println("Please Enter first number:"); 
		 * int num1=sc.nextInt();
		 * 
		 * System.out.println("Please Enter second number:"); 
		 * int num2=sc.nextInt();
		 * 
		 * System.out.println("Addition of two numbers is: " +(num1+num2));
		 * 
		 * sc.close();
		 */
		
		System.out.println("Enter name:");
		String name=sc.next();
		
		System.out.println("Your name is : "+name);
		
		System.out.println("Enter your  age:");
		int age=sc.nextInt();
		
		System.out.println("Your age is : "+age);
		
		System.out.println("Enter unknown value");
		Object value=sc.next();
		
		System.out.println(value);
		
		sc.close();
	}

}
