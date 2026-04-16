package programs;

public class DuplicatesInArray {

	public static void main(String[] args) {
	
		
		int a[]= {10,20,10,40,20,10,30};
		int searchElement=10;
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==searchElement) {
				count++;
			}
		}
		System.out.println("Duplicates elements in array :" +count);
		
		
	}

}
