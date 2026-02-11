package day13;

public class StaticKeyword {
	
	
	static int a=10;
	int b=20;
	
	
	
	static void m1() {
		System.out.println("This is a static method");
	}
	
	void m2() {
		System.out.println("This is a non static method");
	}

	void m() {
		System.out.println(a);
		System.out.println(b);
		m1();
	}
	
	public static void main(String args[]) {
		
		System.out.println(a);
		m1();
		
		StaticKeyword sd=new StaticKeyword();
		
		
		
		System.out.println(sd.b);
		sd.m2();
		
		
		sd.m();
		
		
	}
}
