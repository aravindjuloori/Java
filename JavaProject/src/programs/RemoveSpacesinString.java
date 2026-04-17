package programs;

public class RemoveSpacesinString {

	public static void main(String[] args) {
		
		
		String s="Java    programming    selenium    automation";
		
		String afterreplace=s.replaceAll("\\s","");   //\\s means any whitespace character
		//String afterreplace=s.replace(" ","");
		System.out.println(afterreplace);
	}

}
