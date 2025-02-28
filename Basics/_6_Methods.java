public class _6_Methods {
	public static void main(String[] args) {
		
		// Method syntax
		// <access-modifier> <return-type> <method-name>(<parameter-list>) {
		// 	// method body
		// }
		
		// Access modifier specifies the visibility of the method.
		// Access modifier can be public, private, protected, or default.
		// Access modifier is optional.

		// Built-in methods in Java classes - Math, String, System, etc.
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
	}
	
	static void greet() {
		System.out.println("\nWelcome to Java Methods!");
	}
}
