package day11;

public class StudentMain {

	public static void main(String[] args) {

		 //Student stu=new Student();

		// 1. Store data using the object reference variable

		/*
		 * stu.sid=100; 
		 * stu.sname="Aravind"; 
		 * stu.grad='A'; 
		 * stu.printStudentdata();
		 */
		
		//2.using the method specific variable
		 
		/*
		 * stu.setStudentdata(101, "Aravind",'A'); 
		 * stu.printStudentdata();
		 */
		 
		 //3.using constructor
		 
		Student st=new Student(101,"Aravind",'A');
		st.printStudentdata();
		
	}

}
