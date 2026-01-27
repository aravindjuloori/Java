package day9;

public class ReverseaString {

	public static void main(String[] args) {
		
		//Approach 1 --length(),charAt()
		/*
		 * String s="Welcome"; 
		 * String rev="";
		 * 
		 * 
		 * for(int i=s.length()-1;i>=0;i--) {
		 * 
		 * rev=rev+s.charAt(i);
		 *  }
		 * 
		 * System.out.println(rev);
		 */
		
		
		//Approach 2  -- with out using the String methods
		/*
		 * String s="Welcome"; 
		 * String rev="";
		 * 
		 * char a[]=s.toCharArray();
		 * 
		 * for(int i=a.length-1;i>=0;i--) {
		 * 
		 * rev=rev+a[i];
		 *  } 
		 *  System.out.println("Reverse of a string:"+rev);
		 */
		
		//Approach 3-using string buffer class
		
		/*
		 * StringBuffer s=new StringBuffer("welcome");
		 * System.out.println("Reverse of a string is :"+s.reverse());
		 */
		
		//Approach 4-Using the Sting builder class
		StringBuilder s=new StringBuilder("welcome");
		System.out.println("Reverse of a string is :" +s.reverse());
	}
	
	
	

}
