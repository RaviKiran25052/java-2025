public class Person {
	
	String firstName;
	String lastName;

	Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	void showName() {
		System.out.println("My name is " + this.firstName + " " + this.lastName);
	}
}
