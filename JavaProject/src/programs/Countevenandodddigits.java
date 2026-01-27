package programs;

public class Countevenandodddigits {

	public static void main(String[] args) {
		
		int num=12343242;
		
		int evencount=0;
		int oddcount=0;
		int count=0;
		
		while(num>0){
			
			int rem=num%10;
			
			if(rem%2==0) {
				evencount++;
				
			}
			else
			{
				oddcount++;
			}
			num=num/10;
			count++;
			
		}
		
		System.out.println("no. of even numbers "+evencount);
		System.out.println("no. of odd numbers:" +oddcount);
		System.out.println("total no. of digits "+count);
		
		

	}

}
