package day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
	
		
		//Declaration of hashmap
		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		//Map hm=new HashMap();
		
		//Adding pairs to hashmap
		
		hm.put(101, "Aravind");
		hm.put(102,"Bhavani");
		hm.put(103, "Maanvitha");
		hm.put(104,"Mokshith");
		//hm.put(102, "AAA");  // it will replace the old value with the new values
		
		
		System.out.println(hm);
		
		//size of hashmap
		System.out.println("Total pairs in the hashmap is : "+hm.size());
		
		
		//remove the pairs
		hm.remove(103);
		System.out.println(hm);
		
		
		//access the value of a specific key
		System.out.println(hm.get(102));
		
		
		//get all the keys from hashmap
		System.out.println(hm.keySet());
		
		//Get all the values from the hashmap
		System.out.println(hm.values());
		
		//Get keys along with the values
		System.out.println(hm.entrySet());
		
		//Reading data from hashmap using for each loop
		
		for(int k:hm.keySet()) {
			
			System.out.println(k+"       "+hm.get(k));
		}
		
		
		
		//Reading data from hashmap using iterator
		
		Iterator<Entry<Integer,String>>it=hm.entrySet().iterator();
		while(it.hasNext()) {
			Entry<Integer,String> entry=it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		hm.clear();
		System.out.println(hm.isEmpty());
	}

}
