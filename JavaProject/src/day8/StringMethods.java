package day8;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		
		String s="Welcome";
		
		//String s=new String("Welcome");
		System.out.println(s);
		
	
			//1.Length()- to find the no. of characters in string
			System.out.println(s.length());
			System.out.println("Aravind Juloori".length());
			
			//2.concat-Joining strings(At a time 2 strings can be combined)
			
			String s1="Welcome";
			String s2=" to java";
			String s3=" Automation";
			
			System.out.println(s1+s2);
			System.out.println(s1.concat(s2));
			System.out.println(s1+s2+s3);
			System.out.println(s1.concat(s2).concat(s3));
			System.out.println(s1.concat(s2+s3));
			
			System.out.println("Welcome"+" to java");
			System.out.println("Welcome".concat("to java"));
			
			
			//3.trim()---It will remove the spaces left and right of string
			String str="   Welcome   ";
			System.out.println(str);  //print string along with spaces
			System.out.println("Before trimming:"+str.length()); //gets the length of the string with spaces
			System.out.println(str.trim());// it will print the string by trimming the spaces
			System.out.println("After trimming: "+str.trim().length()); //gets the length of the string with spaces
			
			
			//4.CharAt()-- It returns the character from a string based on the index
			
			String st="Welcome";
			System.out.println(st.charAt(1));  //e
			System.out.println(st.charAt(5));  //e
			
			
			//5.contains()--Checks particular string is present in the main string or not. It returns the boolean value(True/False) and case sensitive
			
			
			String str1="Welcome";
			System.out.println(str1.contains("Come"));
			
			//6.equals(),equalsIngnoreCase() -- It is used for comparing strings
			
			String s4="welcome";
			String s5="welcome";
			
			System.out.println(s4==s5);
			System.out.println(s4.equals(s5));
			System.out.println(s4.equals("Welcome"));
			System.out.println(s4.equalsIgnoreCase("Welcome"));
			
			
			//7.replace()- replace single/multiple characters in a string
			
			s="Welcome to selenium java selenium python selenium c#";
			
			System.out.println(s.replace('e','x'));
			
			System.out.println(s.replace("selenium","playwright"));
			
			
			//8.substring() --It will extract substring from main string
			s="Selenium";
			
			System.out.println(s.substring(0,3));
			System.out.println(s.substring(3,7));
			System.out.println(s.substring(1,4));
			System.out.println(s.substring(0,1));
			
			
			//9.touppercase(),tolowercase()-- converting the string to upper and lower case
			s="Welcome";
			System.out.println(s.toUpperCase());
			System.out.println(s.toLowerCase());
			
			
			//10.split() -- It will split the string in to multiple parts based on the delimeter
			s="abc@gmail.com";
			String a[]=s.split("@");
			System.out.println(Arrays.toString(a));
			/*
			 * System.out.println(a[0]); System.out.println(a[1]);
			 */
			
			//Ex1:
			String amount="$15,20,55";
			
			System.out.println(amount.replace("$",""));
		System.out.println(amount.replace("$","").replace(",",""));
		
		
		//Ex2:
		 s="abc,123@xyz";
		
		String arr[]=s.split(",");
		System.out.println(Arrays.toString(arr));
		
		
		String arr1[]=arr[1].split("@");
		System.out.println(Arrays.toString(arr1));
		
		System.out.println(arr[0]);
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
			
		
		// * % & ^ ()  -- we cannot use this as delimiter
		
		//Ex: 4
		
		String name="John Keneddy";
		System.out.println(s.contains("john"));
		
		System.out.println(name.replace("J","j").contains("john"));
		System.out.println(name.toLowerCase().contains("john"));

	}

}
