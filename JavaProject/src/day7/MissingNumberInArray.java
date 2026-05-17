package day7;

public class MissingNumberInArray {

	public static void main(String[] args) {
	
		
		//Array should not have duplicates
		//Array no need to be in sorted order
		//Values should be in a range
		
		int a[]= {1,2,3,4,5,7,8,9,10};
		
		int sum1=0;
		
		for(int num:a) {
			sum1=sum1+num;
		}
		
		System.out.println("sum of elements in an array is :"+sum1);
		
		int sum2=0;
		for(int i=1;i<=10;i++) {
			
			sum2=sum2+i;
		}
		System.out.println("Sum of range of elements is:" +sum2);
		
		System.out.println("Missing number is : " +(sum2-sum1));

	}

}
