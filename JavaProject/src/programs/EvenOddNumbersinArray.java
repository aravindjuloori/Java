package programs;

public class EvenOddNumbersinArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6};
		
		int evenCount = 0;
        int oddCount = 0;
		
		System.out.println("Even numbers in the array:");
		for(int number:a) {
			if(number%2==0) {
				System.out.println(number);
				evenCount++;
			}
		}
		
		System.out.println("odd numbers in the array:");
		for(int number:a) {
			if(number%2!=0) {
				System.out.println(number);
				oddCount++;
			}
		}
		
		  System.out.println("Even = " + evenCount);
	        System.out.println("Odd = " + oddCount);

	}

}
