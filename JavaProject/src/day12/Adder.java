package day12;

public class Adder {

	int a=10;
	int b=20;
	
	
	public void sum() { // 1
		System.out.println(a + b);
	}
	
	public int sum(int x,int y) { //2
		System.out.println(x+y);
		return (x+y);
	}
	
	public double sum(int x,double y) {//3
		System.out.println(x+y);
		return (x+y);
	}
	
	public void sum(double x,int y) { //4
		System.out.println(x+y);
	}
	
	public void sum(int a,int b,int c) {//5
		System.out.println(a+b+c);
	}
}
