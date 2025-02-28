
public class _1_Classes {
	public static void main(String[] args) {
		
		// Object - instance of a class
		Car myCar = new Car();
		System.out.println("\nBrand: " + myCar.brand);
		System.out.println("Model: " + myCar.model);
		System.out.println("Year: " + myCar.year);
		System.out.println("Color: " + myCar.color);
		System.out.println("Price: " + myCar.price);
		myCar.start();
		myCar.stop();

		// Object - instance of a class
		Car yourCar = new Car();
		yourCar.brand = "Honda";
		yourCar.model = "Civic";
		yourCar.year = 2020;
		yourCar.color = "Black";
		yourCar.price = 25000.00;
		System.out.println("\nBrand: " + yourCar.brand);
		System.out.println("Model: " + yourCar.model);
		System.out.println("Year: " + yourCar.year);
		System.out.println("Color: " + yourCar.color);
		System.out.println("Price: " + yourCar.price);
		yourCar.start();
		yourCar.stop();
		
		// Constructor
		Student student = new Student("Gopika Manasa", 24, 7.46, true);
		System.out.println("\nName: " + student.name);
		System.out.println("Age: " + student.age);
		System.out.println("CGPA: " + student.cgpa);
		System.out.println("Is Enrolled: " + student.isEnrolled);
		student.study();

		// Constructor
		Student student2 = new Student("Ravi Kiran", 22, 8.98, false);
		System.out.println("\nName: " + student2.name);
		System.out.println("Age: " + student2.age);
		System.out.println("CGPA: " + student2.cgpa);
		System.out.println("Is Enrolled: " + student2.isEnrolled);
		student2.study();

		// Constructor
		User user = new User("gopika", "gopikamanasa9@gmail.com", "gopika123");
		System.out.println("\nUsername: " + user.username);
		System.out.println("Email: " + user.email);
		System.out.println("Password: " + user.password);
		user.login();
		user.logout();

		// Constructor
		User user2 = new User("ravi", "ravivarma25@gmail.com");
		System.out.println("\nUsername: " + user2.username);
		System.out.println("Email: " + user2.email);
		System.out.println("Password: " + user2.password);
		user2.login();
		user2.logout();
	}
}
