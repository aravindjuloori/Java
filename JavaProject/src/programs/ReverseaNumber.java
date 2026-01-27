package programs;

import java.util.Scanner;

public class ReverseaNumber {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number");
		int num=sc.nextInt();
	
		
		//Approach 1
		/*
		 * 
		 * int num=sc.nextInt(); 
		 * int rev=0;
		 * 
		 * 
		 * while(num!=0) { 
		 * rev=rev*10+num%10;
		 *  num=num/10; 
		 *  }
		 * 
		 * System.out.println("reverse of an number is " +rev);
		 */
		
		
		//Approach 2  --using string buffer
		
		/*
		 * StringBuffer rev;
		 *  StringBuffer sb=new StringBuffer(String.valueOf(num));
		 * //convert no. in to string format 
		 * rev=sb.reverse();
		 * System.out.println("Reverse of a number is :" +rev);
		 */
		
		
		//Approach 3  -- using string builder
		StringBuilder rev;
		StringBuilder sbl=new StringBuilder();
		sbl.append(num);
		rev=sbl.reverse();
		System.out.println("Reverse of a number is : " +rev);
		
		
	}

}
