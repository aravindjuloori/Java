package day12;

public class AdderMain {

	public static void main(String[] args) {

		
		Adder ad=new Adder();
		
		ad.sum();
		ad.sum(14,15);
		ad.sum(100,100.5);
		ad.sum(100.5,1000);
		ad.sum(10,20,30);
//		ad.sum(10.5,20.5,15.5); //invalid
	}

}	