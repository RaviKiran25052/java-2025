public class Student {
	String name;
	int age;
	double cgpa;
	boolean isEnrolled;

	// Constructor
	Student(String n, int a, double c, boolean i) {
		name = n;
		age = a;
		cgpa = c;
		isEnrolled = i;
	}
	
	// Student(String name, int age, double cgpa, boolean isEnrolled) {
	// 	this.name = name;
	// 	this.age = age;
	// 	this.cgpa = cgpa;
	// 	this.isEnrolled = isEnrolled;
	// }
	
	void study() {
		System.out.println(name + " is studying!");
	}
}
