package day9;

public class StringvsStringBuffervsStringBuilder {

	public static void main(String[] args) {

		// String-immutable

		String s = "welcome";
		s.concat("to java");
		System.out.println(s); // immutable cannot change the original value of s

		// StringBuffer--mutable object
		StringBuffer sbf = new StringBuffer("welcome");
		sbf.append(" to java");
		System.out.println(sbf); // muttable we can change the original value of s

		// StringBuilder-muttable object

		StringBuilder sbd = new StringBuilder("Welcome");
		sbd.append(" to java");
		System.out.println(sbd); // muttable we can change the original value of s

	}

}
