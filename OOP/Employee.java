public class Employee extends Person {
	
	double salary;

	Employee(String firstName, String lastName, double salary) {
		super(firstName, lastName);
		this.salary = salary;
	}

	void showSalary() {
		System.out.println(this.firstName + " " + this.lastName + " earns " + this.salary + " per month.");
	}
}
