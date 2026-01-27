package programs;

public class RemoveSpacesinString {

	public static void main(String[] args) {
		
		
		String s="Java    programming    selenium    automation";
		
		String afterreplace=s.replaceAll("\\s","");
		System.out.println(afterreplace);
	}

}
