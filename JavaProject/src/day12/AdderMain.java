package day12;

public class AdderMain {

	public static void main(String[] args) {

		Adder addobj = new Adder();
		addobj.sum(); // 1

		addobj.sum(100, 200); // 2

		addobj.sum(100, 201.2); // 3

		addobj.sum(0.5, 100); // 4

		addobj.sum(10, 10, 20); // 5

	}

}
