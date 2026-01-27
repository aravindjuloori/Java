package day9;

import java.util.Arrays;

public class Mutablevsimmutable {

	public static void main(String[] args) {
		
		
		//mutable can change
		int a[]= {20,10,40,50,30};
		
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		
		//immutable 
		String s=new String("welcome");
		String concatinatedString=s.concat(" to java");
		System.out.println(concatinatedString);
	}

}
