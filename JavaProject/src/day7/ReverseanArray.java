package day7;

import java.util.Arrays;

public class ReverseanArray {

	public static void main(String[] args) {
		
		int a[]= {100,200,400,500,600};
		
		System.out.println(Arrays.toString(a));
		
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}

		
	}

}
