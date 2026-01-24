package programs;

public class LinearSearch {

	public static void main(String[] args) {
	
		
		int a[]= {100,400,200,500,600};
		
		int searchElement=200;
		boolean status=false;
		
		for(int i=0;i<a.length;i++) {
			System.out.println("*************");
		if(a[i]==searchElement) {
			System.out.println("element found");
			status=true;
			break;
		}
			
		}
		
		if(status=false) {
			System.out.println("Element not found");
		}
	
		
	}

}
