package programs;

public class SwapNumbers {

	public static void main(String[] args) {

		int a=100 ,b=200;
		
		// swapping of 2 numbers without using  3rd variable
		/*
		 * a=a+b; //a=300; b=a-b; //a=100 a=a-b; //b=200
		 * 
		 * System.out.println("the value of a is :" +a);
		 * System.out.println("the value of b is :" +b);
		 
		 */
		
		
		//swapping values using temp variable
		System.out.println("Before swapping: a = " + a + ", b = " + b);
		
		int temp=a;    // temp=100;
		 a=b;      //a=200
		 b=temp;   //100
			System.out.println("After swapping: a = " + a + ", b = " + b);
	}

}
