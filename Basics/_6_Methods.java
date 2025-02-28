public class _6_Methods {
	public static void main(String[] args) {

		// methods in Built-in Java classes - Math, String, System, etc.
		System.out.println("\nMath.abs(-65): " + Math.abs(-65));
		System.out.println("Math.max(65, 75): " + Math.max(65, 75));
		System.out.println("Math.min(65, 75): " + Math.min(65, 75));
		System.out.println("Math.pow(2, 3): " + Math.pow(2, 3));
		System.out.println("Math.sqrt(25): " + Math.sqrt(25));
		System.out.println("Math.cbrt(27): " + Math.cbrt(27));
		System.out.println("Math.round(3.143): " + Math.round(3.143));
		System.out.println("Math.floor(3.143): " + Math.floor(3.143));
		System.out.println("Math.ceil(3.143): " + Math.ceil(3.143));
		System.out.println("Math.random(): " + Math.random());

		// User-defined methods
		greet();

		// method overloading
		add("Ravi", "Kiran");
		add(4, 6);
		add(4, 6, 10);

		// variable arguments
		System.out.println("\nAverage: "+avg(1, 2, 3, 4));
	}

	static void greet() {
		System.out.println("\nWelcome to Java Methods!");
	}

	static void add(String str1, String str2) {
		System.out.println("\nFull Name: " + str1 + " " + str2);
	}

	static void add(int a, int b) {
		System.out.println("Sum of 2 integers: " + (a + b));
	}

	static void add(int a, int b, int c) {
		System.out.println("Sum of 3 integers: " + (a + b + c));
	}

	// variable arguments
	static double avg(double... numbers) {
		if (numbers.length == 0)
			return 0;

		double sum = 0;
		for (double num : numbers) {
			sum += num;
		}

		return sum;
	}
}
