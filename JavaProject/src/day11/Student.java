package day11;

public class Student {

	//Class variables
	int sid;
	String sname;  
	char grad;

	public void printStudentData() {

		System.out.println(sid + " " + sname + " " + grad);
	}

	/*//id,name and gr and local variables
	 * 
	 * public void setStudentData(int id,String name,char gr) { 
	 * sid=id;
	 * sname=name;
	 * grad=gr;
	 * 
	 * }
	 */

	Student(int id, String name, char gr) {
		sid = id;
		sname = name;
		grad = gr;

	}

	/*
	 * static void myMethod(String fname,int age) {
	 * System.out.println(fname+" is "+age);
	 * 
	 * }
	 */

	/*
	 * static void myage(int age) { // If age is less than 18, print "access denied"
	 * if(age<18) { System.out.println("Access denied - You are not old enough!"); }
	 * else { System.out.println("Access granted - You are old enough!"); } }
	 */

	/*
	 * public static void main(String args[]) { myage(11);
	 * 
	 * 
	 * }
	 */
}
