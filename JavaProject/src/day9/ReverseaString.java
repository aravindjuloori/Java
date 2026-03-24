package day9;

public class ReverseaString {

	public static void main(String[] args) {
		
		//Approach 1- using the length() and CharAt() methods
		
		/*
		 * String s="Welcome"; String rev="";
		 * 
		 * for(int i=s.length()-1;i>=0;i--) { 
		 * rev=rev+s.charAt(i); 
		 * }
		 * 
		 * System.out.println("Reverse value of a string is :" +rev);
		 */
		
		//Approach 2 -- Without using the string methods
		/*
		 * String s="Welcome";
		 *  String rev="";
		 *   char a[]=s.toCharArray(); 
		 *   for(int i=a.length-1;i>=0;i--) {
		 * 
		 * rev=rev+a[i];
		 * 
		 * } System.out.println("Reverse value of a string is :" +rev);
		 */
		
		//Approach 3: Using the string Buffer class
		
		/*
		 * StringBuffer s=new StringBuffer("Welcome"); 
		 * System.out.println(s.reverse());
		 */
		
		//Approach 4:Using the String builder class
		
		StringBuilder s=new StringBuilder("Welcome");
		System.out.println(s.reverse());
	}
	
	
	

}
