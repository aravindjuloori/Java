package day11;

public class Greetings {
	
	//No params and no return value
	public void m1() {
		System.out.println("Hello world");
	}
	
	//No params and return value
	public String m2() {
		return "Hello";
		
	}
	
	//Takes params and no return value
	
	public void m3(String name) {
		System.out.println("Hello " +name);
		
		
	}
	
	//Takes param and return value
	public String m4(String name) {
		return("Hello "+name);
	}
	
	
	
	
	

}
