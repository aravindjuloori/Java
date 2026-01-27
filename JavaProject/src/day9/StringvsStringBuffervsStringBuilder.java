package day9;

public class StringvsStringBuffervsStringBuilder {

	public static void main(String[] args) {

		//String-immutable
		
		/*
		 * String s="welcome"; s.concat("to java"); System.out.println(s); //immutable
		 * cannot change the original value of s
		 */
		
		
		//StringBuffer--mutable object
		/*StringBuffer s=new StringBuffer("welcome");
		s.append(" to java");
		System.out.println(s); */ //muttable we can change the original value of s
	
		
		//StringBuilder-muttable object
		
		StringBuilder s=new StringBuilder("Welcome");
		s.append(" to java");
		System.out.println(s);  //muttable we can change the original value of s
		
	}

}
