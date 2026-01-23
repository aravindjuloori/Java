package day6;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		
		
		/*1.Declaring an array
		 * 2.add values in to array
		 * 3.finding the length of array
		 * 4.retrieve a single value from array
		 * 5.retriving multiple values from array
		*/
		
		//Approach 1  -- fixed in size  , memory will be wasted if we not give values for all the 5 locations
		/*int a[]=new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		*/
		
		//Approach 2 -size is not fixed ,no memory wastage 
		int a[]= {100,200,300,400,500};
		
		
		//find length of an array
		
		System.out.println("Length of an array: "+a.length);
		
		//Reading a value from array using index number
		
		//System.out.println(a[4]);
		
		//Reading multiple values from a array
		//normal for loop
		for(int i=0;i<a.length;i++) {       //a.length=5   i<5   or i<=4   or i<a.length  or i<=a.length-1
			System.out.println(a[i]);
		}
		
		
		System.out.println("************************");
		//Enhanced loop or for each loop
		
		for(int num:a) {
			System.out.println(num);
		}
	}

}
