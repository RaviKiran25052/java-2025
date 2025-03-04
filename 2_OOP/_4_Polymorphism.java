public class _4_Polymorphism {
	public static void main(String[] args) {

		// poly - many, morph - shape / behaviour
		// Polymorphism is the ability of an object to take on many forms.
		// objects can be treated as instances of their parent class

		// compile time polymorphism - early binding
		Truck truck = new Truck(); // Truck is a Vehicle
		Bike bike = new Bike(); // Bike is a Vehicle
		Boat boat = new Boat(); // Boat is a Vehicle

		Vehicle[] vehicles = { truck, bike, boat };
		for (Vehicle vehicle : vehicles) {
			vehicle.go();
		}

		System.out.println();

		// Dyanmic Polymorphism - runtime polymorphism - late binding
		// type of object is determined at runtime
		Vehicle vehicle = new Truck(); // Truck is a Vehicle
		vehicle.go(); // Truck is going

		vehicle = new Bike(); // Bike is a Vehicle
		vehicle.go(); // Bike is going

		vehicle = new Boat(); // Boat is a Vehicle
		vehicle.go();
	}
}
