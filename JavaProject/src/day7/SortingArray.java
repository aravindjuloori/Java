package day7;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
	
		int a[]= {100,300,200,500,600};
		
		System.out.println("Before sorting....");
		
		/*
		 * for(int value:a) { System.out.println(value); }
		 */
		
		
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));

	}

}
