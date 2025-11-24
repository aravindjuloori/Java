package day7;

import java.util.Arrays;

public class SortingStrings {

	public static void main(String[] args) {
		
		
		String c[]= {"Aravind","Maanvitha","Mokshith","Bhavani"};
		
		//char c[]= {'A','C','D','E','B'};
			
		System.out.println("Before sorting: "+Arrays.toString(c));
		
		Arrays.sort(c);
		System.out.println("After sorting: "+Arrays.toString(c));

	}

}
