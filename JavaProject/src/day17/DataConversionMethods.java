package day17;

public class DataConversionMethods {

	public static void main(String[] args) {
		
		//String to integer
		/*
		String s1="12";
		String s2="24";
		
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		*/
		
		//String -->Double
		
		/*
		 * String s1="10.5";
		 *  String s2="11.5";
		 * 
		 * System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));
		 */
		
		
		/*
		 * String s="false"; 
		 * System.out.println(Boolean.parseBoolean(s));
		 */
		
		
		//int,double,char,boolean ---->String
		
		int a=10;
		double d=10.5;
		char ch='a';
		boolean bool=true;
		
		String s=String.valueOf(a);
		System.out.println(s);
		
		s=String.valueOf(d);
		System.out.println(s);
		
		s=String.valueOf(ch);
		System.out.println(s);
		
		s=String.valueOf(bool);
		System.out.println(s);
	}
	
}
