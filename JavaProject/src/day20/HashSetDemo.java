package day20;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		
		HashSet myset=new HashSet();
		
		myset.add(100);
		myset.add(10.5);
		myset.add("Welcome");
		myset.add(true);
		myset.add('A');
		myset.add(100);
		myset.add(null);
		myset.add(null);
		
		System.out.println(myset);

		//removal of an element from the hashset
		myset.remove(10.5);   //10.5 is a value not the index
		
		System.out.println(myset);
		
		//inserting element in the hashset - not allowed
		//how to retrive specific element from hashset- not allowed
		
		
		
		//To access specific element or to insert element into hashset convert it into ArrayList
		
		ArrayList al=new ArrayList(myset);
		System.out.println(al);
		System.out.println(al.get(2));
		
		//size of the hashset
		System.out.println("The size of the Hashset is :"+myset.size());
		
		
		//clear all the elements in the hashset
		myset.clear();
		System.out.println(myset);
		
		
		//to check hashmap is empty 
		System.out.println("Is hashset empty? "+myset.isEmpty());
		
		
		

		
		
		
	}

}
