public class _9_Annonymous {
	// Anonymous class - a class without a name, not reusable

	public static void main(String[] args) {

		// Using an anonymous class to override
		// {} after the constructor call
		// creates an anonymous class that extends Dog
		// and overrides the speak method
		Dog dog = new Dog(3) {
			@Override
			void speak() {
				System.out.println("This dog goes *bar*");
			}
		};
		dog.speak();
	}
}