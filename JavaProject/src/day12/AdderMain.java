package day12;

public class AdderMain {

	public static void main(String[] args) {

		Adder addobj = new Adder();
		addobj.sum(); // 1 method

		addobj.sum(100, 200); // 2 both the int variables

		addobj.sum(100, 201.2); // 3

		addobj.sum(0.5, 100); // 4

		addobj.sum(10, 10, 20); // 5
		
		//addobj.sum(10.5,20.5,15.5);  //invalid

	}

}	
