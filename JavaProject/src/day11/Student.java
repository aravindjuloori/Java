package day11;

public class Student {

	//Class variables
	int sid;
	String sname;
	char grad;

	public void printStudentdata() {
		
		System.out.println(sid+" "+sname+" "+grad);
	}
	
	//vairables declared inside the method are called local variables
	void setStudentdata(int id,String name,char gr) {
		sid=id;
		sname=name;
		grad=gr;
		
	}
	
	Student(int id,String name,char gr){
		sid=id;
		sname=name;
		grad=gr;
	}
	
	
}
