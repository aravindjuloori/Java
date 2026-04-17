package day11;

public class Student {

	//Class Variables
	int sid;
	String sname;
	char grad;
	
	
	public void printStudentdata() {
		System.out.println(sid+" "+sname+" "+grad);
	}
	
	//vairables declared inside the method are called local variables
	/*
	 * public void setStudentdata(int id,String name,char gr) { 
	 * sid=id; 
	 * sname=name;
	 * grad=gr;
	 * 
	 * }
	 */
	
	
	//3.Using constructor
	Student(int id,String name,char gr){
		sid=id; 
		sname=name;
		grad=gr;
	}
	
		
	
}
