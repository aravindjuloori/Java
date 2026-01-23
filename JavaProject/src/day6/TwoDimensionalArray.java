package day6;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		//Declaring an Array
		//Approach 1-size of array is fixed and no plans to increase
		int a[][]=new int[3][2];
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;	
		
		a[2][0]=500;
		a[2][1]=600;
		
		
		//Approach 1
		
		int a1[][]= { {100,200},
					  {300,400},
					  {500,600}
					 };
		//find the length of rows
		
		System.out.println("The number of rows: "+a.length);
		System.out.println("Then number of columns: "+a[0].length);
		
		//Reading a single value from array
		System.out.println(a[2][1]);
		
		
		//Reading all rows and all columns
		//normal for loop
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a[i].length;j++) {
				
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			
			
		}
		
		//enhanced for loop
		
		for(int arr[]:a) {
			
			for(int x:arr) {
				System.out.print(x+" ");
			}
			System.out.println();
			
		}
		

		
	}

}
