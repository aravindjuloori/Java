package programs;

public class EvenOddNumbersinArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6};
		
		int even_count=0;
		int odd_count=0;
		
		 System.out.println("Even numbers in an array");
		
		for(int num:a) {
			if(num%2==0) {
				System.out.println(num);
				even_count++;
			}
		}
		
		System.out.println("Odd numbers in an array");
		for(int num:a) {
			if(num%2!=0) {
				System.out.println(num);
				odd_count++;
			}
		}
		
		 System.out.println("Even = " + even_count);
	        System.out.println("Odd = " + odd_count);
		
	}
	
}

