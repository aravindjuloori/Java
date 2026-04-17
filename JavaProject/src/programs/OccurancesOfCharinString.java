package programs;

public class OccurancesOfCharinString {

	public static void main(String[] args) {
	
		String str="abcaabcaabbcc";
		//String s="";
		int a_count=0;
		int b_count=0;
		int c_count=0;
		
		
		for(int i=0;i<str.length();i++) {
			
//			s=s+str.charAt(i);
			/* System.out.println(s); */
		
			if(str.charAt(i)=='a'){
				//System.out.println(str);
				a_count++;
			}
			else if(str.charAt(i)=='b') {
				b_count++;
			}
			else if (str.charAt(i)=='c') {
				c_count++;
			}
					
		}
		
		System.out.println("No of occurances of a: "+a_count);
		System.out.println("No of occurances of b: "+b_count);
		System.out.println("No of occurances of c: "+c_count);

	}

	

}
