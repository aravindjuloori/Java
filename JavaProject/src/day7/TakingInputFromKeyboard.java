package day7;

import java.util.Scanner;

public class TakingInputFromKeyboard {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		/*//integer
		 * System.out.println("Enter a number :"); int num=sc.nextInt();
		 * System.out.println("Given number is :" +num);
		 * 
		 */
		/*//enter decimal number
		 * System.out.println("Enter a Decimal number"); double num=sc.nextDouble();
		 * 
		 * System.out.println("Given decimal number is :" +num);
		 * 
		 * 
		 */
		
		System.out.println("Please enter city");
		
		String city=sc.next();
		System.out.println("Your city is : "+city);
		sc.close();

	}

}
