	package day12;

public class Adder {

	int a = 10;
	int b = 20;

	void sum() { // 1
		System.out.println(a + b);
	}
	
	

	int sum(int x, int y) { // 2  no. of parameters

		System.out.println(x + y);
		
		return x*y;
	}

	double sum(int x, double y) { // 3

		System.out.println(x + y);
		return x*y;
	}

	void sum(double x, int y) { // 4

		System.out.println(x + y);
		
	}

	void sum(int a, int b, int c) {
		System.out.println(a + b + c);
	}

}
