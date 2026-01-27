package programs;

import java.util.Scanner;

public class PolindromeString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string value");
		
		String str=sc.next();
		String org_str=str;
		
		String rev="";
		
		for(int i=org_str.length()-1;i>=0;i--) {
			
			rev=rev+org_str.charAt(i);
		}
		
		/* System.out.println("Reverse of a string is :" +rev); */
		if(org_str.equals(rev)) {
			System.out.println(org_str+"     its a polindrome string");
		}
		else {
			System.out.println(org_str+"     its not a polindrome string");
		}
		
		

	}

}
