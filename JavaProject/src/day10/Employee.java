package day10;

public class Employee {

	// Variables
	int empId;
	String eName;
	String job;
	int salary;

	// Methods

	public void display() {
		System.out.println(empId);
		System.out.println(eName);
		System.out.println(job);
		System.out.println(salary);
	}

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		emp1.empId = 101;
		emp1.eName = "aravind Juloori";
		emp1.job = "Software";
		emp1.salary = 50000;

		emp1.display();

	}

}
