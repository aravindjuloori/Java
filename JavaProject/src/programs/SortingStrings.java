package programs;

import java.util.Arrays;

public class SortingStrings {

	public static void main(String[] args) {
		
		String str[]= {"Volvo","Ertiga","Maruthi","Baleno","Creata","Audi"};
		
	System.out.println("******Before Sorting*******");
	System.out.println(Arrays.toString(str));
	
	Arrays.sort(str);
	System.out.println("******After Sorting*******");
	System.out.println(Arrays.toString(str));
	

	}

}
