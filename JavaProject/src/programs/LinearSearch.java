	package programs;

public class LinearSearch {

	public static void main(String[] args) {
	
		
	int a[]= {200,300,500,100,600};
	int search_element=200;
	boolean status=false;
	
	/*
	 * for(int i=0;i<a.length;i++) { // System.out.println("*************");
	 * if(a[i]==search_element) { System.out.println("Element Found"); status=true;
	 * break; } }
	 */
	
	//using enhanced for loop
	for(int x:a) {
		
		if(x==search_element) {
			System.out.println("element found");
			status=true;
			break;
		}
	}
	if(status==false) {
		System.out.println("Element Not Found");
	}
	
			
	}

}
