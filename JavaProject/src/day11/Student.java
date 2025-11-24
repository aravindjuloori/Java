package day11;

public class Student {
	
	int sid;
	String sname;
	char grad;
	
	
	public void printStudentData() {
		System.out.println(sid+" "+sname+" "+grad);
	}
	
	public void setStudentData(int id,String name,char gr) {
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
