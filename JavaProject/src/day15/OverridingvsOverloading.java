package day15;


class ABC{
	
	void m1(int a) {
		System.out.println(a);
	}
	
	void m2(int b) {
		System.out.println(b);
	}
}

class XYZ extends ABC{
	void m1(int a) {
		System.out.println(a*a);  //Method overriding
	}
	
	void m2(int a,int b) {
		System.out.println(a*b);  //Method overloading
		
	}
}
public class OverridingvsOverloading {

	public static void main(String[] args) {
		
		XYZ xyzobj=new XYZ();
		xyzobj.m1(10);
		xyzobj.m2(20);
		xyzobj.m2(10, 5);
		

	}

}
