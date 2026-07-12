package collectionsDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
	
		
		ArrayList al=new ArrayList();
		
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");
		
		
		
		ArrayList al1=new ArrayList();
		al1.addAll(al);    //Copy the elements in the al arraylist to al1 arraylist
		
		System.out.println(al1);
		al1.removeAll(al);
		System.out.println("After removing elements from array list : " + al1);
		
		System.out.println(al1.isEmpty());
		
		//sort an arraylist   --collections.sort()
		System.out.println("Elements in the arraylist before sorting :" +al);
		Collections.sort(al);
		System.out.println("Elements in the arraylist after sorting :" +al);
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("Elements in after sorting in the reverse order :" +al);
		
		//shuffle -collections.shuffle
		
		Collections.shuffle(al);
		System.out.println("Collections after shuffling the order is  :" +al);
	}

}
