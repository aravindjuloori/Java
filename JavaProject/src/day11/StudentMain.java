package day11;

public class StudentMain {

	public static void main(String[] args) {
		
		//Student stu=new Student();
	
		//1. Store data using the object reference variable
		
		/*
		 * stu.sid=100; 
		 * stu.sname="aravind"; 
		 * stu.grad='A';
		 */
		
		//2. using the method local method
		/*
		 * stu.setStudentData(1001, "Arvind", 'A'); 
		 * stu.printStudentData();
		 */
		
		//3. using constructor
		Student stu=new Student(1001,"Aravind",'A');
		stu.printStudentData();

	}

}
