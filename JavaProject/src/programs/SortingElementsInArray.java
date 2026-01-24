package programs;

import java.util.Arrays;

public class SortingElementsInArray {

	public static void main(String[] args) {

		int a[]= {100,600,200,400,500};
		
		System.out.println("***Before sorting the array******");
		
		/*
		 * for(int value:a) { System.out.println(value); }
		 
		 */
		
		System.out.println(Arrays.toString(a));  //It is used to print all the strings in array 
		
		Arrays.sort(a);
		System.out.println("***After sorting the array******");
		System.out.println(Arrays.toString(a));
		
	}

}
