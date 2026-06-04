package day18;

public class FinallyBlock {

	public static void main(String[] args) {
		
		String s=null;
		
		try {
			System.out.println(s.length());
		}
		catch(NumberFormatException e) {
			System.out.println("Catch block Handled Exception");
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("You entered in to finally block");
			
		}
		
		System.out.println("Program Finished.....");
	}

}
