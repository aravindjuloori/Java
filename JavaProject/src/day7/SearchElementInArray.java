package day7;

public class SearchElementInArray {

	public static void main(String[] args) {


		int a[]= {50,20,30,10,90};
		int searchElement=10;
		
		boolean status=false;
		
		for(int i=0;i<a.length;i++) {
			//System.out.println("********");
			if(a[i]==searchElement) {
				System.out.println("element found");
				status=true;
				break;
			}
		}
		
		if(status==false) {
			System.out.println("Element not found");
		}
		

	}

}
