package day19;


//upcasting -- Converting data/value from the smaller to higher

//downcasting --Converting data/value from the higher to smaller

public class TypeCastingConcept {

	public static void main(String[] args) {
		
		
		//upcasting --Automatic -- smaller to larger
		
		
		/*
		 * int intvalue=100;
		 * 
		 * long longvalue=intvalue;
		 * 
		 * System.out.println(longvalue);
		 */
		
		
		/*
		 * float floatvalue=10.5f; 
		 * 
		 * double doublevalue=floatvalue;
		 * 
		 * System.out.println(doublevalue);
		 */
		 
		
		//Downcasting--manually-larger to smaller
		
		/*
		 * long longValue=100000; 
		 * int intvalue=(int)longValue;
		 */
		
		/*
		 * double doubleValue=125.5534234324; 
		 * float floatvalue=(float)doubleValue;
		 * System.out.println(floatvalue);
		 */
		
		
		  //ex1: 
			/*
			 * int i=100; 
			 * double d=i; 
			 * System.out.println(d);
			 */
		  
		  
			
			  //ex2:
			  double d1=10.5; 
			  int i1=(int)d1;
			  
			  System.out.println(i1);
			 
		
		
	}

}
