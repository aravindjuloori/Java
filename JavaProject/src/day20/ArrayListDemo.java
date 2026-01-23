package day20;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//Declaring ArrayList 
		ArrayList mylist=new ArrayList();
		
	//	List mylist=new ArrayList();
		
	//	ArrayList<String> mylist=new ArrayList<String>();
		
		
		//How to add data to the ArrayList
		
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("Welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(100);
		mylist.add(null);
		mylist.add(null);
		
		//printing data from the arraylist
		System.out.println("printing data from the arraylist is :" +mylist);
		
		
		//size of an arraylist
		System.out.println("Size of an arraylist: " +mylist.size());
		
		
		//remove an element from arraylist
		mylist.remove(5);

		System.out.println("printing data from the arraylist is :" +mylist);
		
		
		//insert the element at specific index
		mylist.add(5,"java");
		System.out.println("printing data from the arraylist is :" +mylist);
		
		//change the value or replace the value
		mylist.set(5, "python");
		System.out.println("printing data from the arraylist is :" +mylist);
		
		//Access specific element from arraylist
		System.out.println(mylist.get(2));
		
		
		//Reading all the elements from the arraylist using for loop
		
		/*for(int i=0;i<mylist.size();i++) {
			
			System.out.println(mylist.get(i));
		}*/
		
		
		//System.out.println("********printing data using for each loop**************");
		
		//Reading data from the arraylist using for each loop
		
		/*for(Object x:mylist) {
			System.out.println(x);
		}*/
		
		System.out.println("********printing data using Iterator each loop**************");
		//Reading data from the arraylist using iterator
		
		Iterator it=mylist.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		//checking arraylist is empty	
		System.out.println("Is arraylist empty? "+mylist.isEmpty());
		
		//remove all the elements in the arraylist
		
		ArrayList mylist2=new ArrayList();
		mylist2.add(100);
		mylist2.add("Welcome");
		
		mylist.removeAll(mylist2);
		
		System.out.println(mylist);
		
		mylist.clear();
		System.out.println("Is arraylist empty? "+mylist.isEmpty());
		
		
		

	}

}
