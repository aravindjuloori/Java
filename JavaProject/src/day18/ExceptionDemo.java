package day18;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
	
		
		System.out.println("Program is started...");
		Scanner sc=new Scanner(System.in); 
		//Example 1:
		
		  
		  System.out.println("Enter a number: ");
		  int num=sc.nextInt();
		  
		  System.out.println(100/num); //Arithemation Exception
		 		
		
		//Eaxmple 2:
		
		/*
		 * int a[]=new int[5]; 
		 * System.out.println("Enter the position(0-4):"); 
		 * int pos=sc.nextInt();
		 * 
		 * System.out.println("Enter a value:"); 
		 * int value=sc.nextInt();
		 * 
		 * a[pos]=value; //ArrayIndexOutOfBoundsException
		 * 
		 * 
		 * System.out.println(a[pos]);
		 */
		
		
		//Example 3:
		
		/*
		 * String s="welcome";
		 * 
		 * int number=Integer.parseInt(s); //NumberFormatException
		 * System.out.println(number);
		 */
		
		
		//Example 4:
		/*
		 * String s=null; //NullPointerException 
		 * System.out.println(s.length());
		 */
		
		System.out.println("program is Completed...");
		System.out.println("Program is exited...");

	}

}
