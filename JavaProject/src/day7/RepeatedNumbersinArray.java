package day7;

public class RepeatedNumbersinArray {

	public static void main(String[] args) {
		
		int a[]= {10,30,40,10,60,90,10};
		int number=10;
		
		int count=0;
		for(int value:a) {
			
			if(value==number) {
				count++;
			}
		}
		System.out.println(count);

	}

}
