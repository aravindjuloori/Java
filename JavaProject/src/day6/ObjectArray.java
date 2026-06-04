package day6;

public class ObjectArray {

	public static void main(String[] args) {
		
		//object is a predefined class in java
		 Object a[]= {100,10.5,'A',"Welcome",true};
		
		 System.out.println("**********Enchanced for loop**********");
		
		for(Object x:a) {
			System.out.println(x);
			
		}
		System.out.println("***********Classic for loop***********");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
