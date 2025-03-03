public class _2_Inheritance {
	
	public static void main(String[] args) {
		
		// inheritance - inherited from Animal
		Dog dog = new Dog(4);
		Cat cat = new Cat(9);
		Fish fish = new Fish(1);
		
		System.out.println("\nIs the dog alive? " + dog.isAlive);
		System.out.println("Is the cat alive? " + cat.isAlive);
		System.out.println("Is the fish alive? " + fish.isAlive);
		System.out.println("The dog has " + dog.lives + " lives left.");
		System.out.println("The cat has " + cat.lives + " lives left.");
		System.out.println("The fish has " + fish.lives + " lives left.");
		dog.speak();
		cat.speak();
		fish.speak();

		dog.move(); // running
		cat.move(); // running
		// method overriding
		fish.move(); // swimming

		dog.die();
		cat.die();
		fish.die();

		// super keyword
		Person person = new Person("Ravi", "Kiran");
		person.showName();

		// super() is used to call the constructor of the parent class.
		// using super() we pass arguments to the constructor of the parent class.(Employee => Person)
		Employee employee = new Employee("Harry", "Potter", 1000);
		employee.showName();
		employee.showSalary();
	}
}
