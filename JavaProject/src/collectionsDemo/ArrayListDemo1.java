package collectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		
		//Declaring ArrayList
		
//			ArrayList al=new ArrayList();
		/*
		 * ArrayList<Integer> alint=new ArrayList<Integer>();
		 *  ArrayList<String> astring=new ArrayList<String>();
		 */
			List al=new ArrayList();
			//Adding elements to arraylist
			al.add(100);
			al.add("aravind");
			al.add(15.5);
			al.add('A');
			al.add(true);
			
			System.out.println(al);
			
			
			//size of an array
			System.out.println("No. of elements in arraylist :"+al.size());
			
		
			//Remove an element from array
			
			al.remove(0);
			al.remove("aravind");
			System.out.println("After removing the elements:"+al);
			
			//insert a new element
			
			al.add("Welcome");
			al.add(2, "python");
			System.out.println(al);
			System.out.println("No. of elements in arraylist :" +al.size());
		
			//retrieve a specific element in an arraylist
			System.out.println(al.get(2));
			
			//	
			//to replace or update
			al.set(2,"Java");
			System.out.println(al);
		
			
			ArrayList al1=new ArrayList();
			System.out.println(al1.isEmpty());
			al1.addAll(al);
			System.out.println(al1);
		
			
			//search an element contains()
			System.out.println(al.contains("Java"));
			System.out.println(al.contains("C++"));
		
			System.out.println(al.isEmpty());
			
			
			
			System.out.println("**************Using normal for loop******************");
			
		//for loop
			
			for(int i=0;i<al.size();i++) {
				
				System.out.println(al.get(i));
			}
			
			
			//for each
			
			System.out.println("************using for each****************");
			for(Object value:al) {
				System.out.println(value);
			}
			
			
			//using iterator
			
			System.out.println("************Reading values through iterator****************");
			Iterator it=al.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
				
			}
	}

}
