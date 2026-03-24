package day9;

public class StringvsStringBuffervsStringBuilder {

	public static void main(String[] args) {

		//String-immutable
		
		
		  String s="welcome"; 
		  s.concat("to java"); 
		  System.out.println(s);      //immutable cannot change the original value of s
		  
		 
		
		
		//StringBuffer--mutable object
		StringBuffer s1=new StringBuffer("welcome");
		s1.append(" to java");
		System.out.println(s1);  //muttable we can change the original value of s
	
		
		//StringBuilder-muttable object
		
		StringBuilder s2=new StringBuilder("Welcome");
		s2.append(" to java");
		System.out.println(s2);  //muttable we can change the original value of s
		
	}

}
