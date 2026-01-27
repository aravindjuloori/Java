package programs;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		
		
		String s="@#!#! latimStringv 1222132313";
		
		String replacedText=s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(replacedText);

	}

}
