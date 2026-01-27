package programs;

import java.util.Scanner;

public class PolindromeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter the number");
		
		
		int num=sc.nextInt();
		int rev=0;
		int org_num=num;

		while(num!=0) {
			
			rev=rev*10+num%10;
			num=num/10;
			
		}
		if(org_num==rev) {
			System.out.println(org_num+" polindrome number");
		}
		else
		{
			System.out.println(org_num+"   not polindrome number");
		}
		//System.out.println("Reverse of a number is: "+rev);

	}

}
