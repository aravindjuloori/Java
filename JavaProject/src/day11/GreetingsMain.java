package day11;

public class GreetingsMain {

	public static void main(String[] args) {
		
		
		Greetings gr=new Greetings();
		
		gr.m1();
		
		String variable=gr.m2();
		System.out.println(variable);
		
		gr.m3("Aravind");
		
		String name=gr.m4("Aravind");
		System.out.println(name);
	}

}
