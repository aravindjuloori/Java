package programs;

public class DuplicatesInArray {

	public static void main(String[] args) {
	
		
		int a[]= {10,20,10,40,20,10,30};
		int num=10;
		int count=0;
		
		for(int value:a) {
			if(value==num) {
				count++;
			}
		}
		System.out.println("Duplicates elements in array :" +count);
		
		
		
	}

}
