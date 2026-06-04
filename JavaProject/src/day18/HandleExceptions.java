package day18;

import java.util.Scanner;

public class HandleExceptions {

	public static void main(String[] args) {
		System.out.println("Program is started...");
		Scanner sc=new Scanner(System.in); 
		//Example 1:
		
		  
		  System.out.println("Enter a number: ");
		  int num=sc.nextInt();
		  try {
			  System.out.println(100/num); //Arithemation Exception
		  }
		  catch(ArithmeticException e) {
			  System.out.println("Invalid data");
			  e.getStackTrace();
		  }
		  
		 	
		  
		  System.out.println("program is Completed...");
		  System.out.println("Program is exited...");
	}

}
