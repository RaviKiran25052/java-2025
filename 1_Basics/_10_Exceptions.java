import java.util.Scanner;

public class _10_Exceptions {

	// Exception = An event that disrupts the normal flow of the program.
	// Exception handling = Mechanism to handle runtime errors, allowing the program
	// to continue running.
	// try{}, catch{}, finally{}, throw, throws

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		try {
			System.out.println(arr[5]); // This will throw an ArrayIndexOutOfBoundsException
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is out of bounds: " + e.getMessage());
		}
		System.out.println("Program continues after exception handling.");

		// Example of handling multiple exceptions
		try {
			int result = 10 / 0; // This will throw an ArithmeticException
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic error: " + e.getMessage());
		} catch (Exception e) { // Catching any other exception
			// This will catch any exception that is not caught by the previous catch blocks
			System.out.println("An unexpected error occurred: " + e.getMessage());
		}
		System.out.println("Continuing after handling multiple exceptions.");

		// Example of using a custom exception
		try {
			int age = -5;
			if (age < 0) {
				throw new IllegalArgumentException("Age cannot be negative.");
			}
		} catch (IllegalArgumentException e) {
			System.out.println("Caught a custom exception: " + e.getMessage());
		}
		System.out.println("End of custom exception handling example.");

		// Example of using a finally block
		try {
			System.out.println("Trying to access an element in the array.");
			System.out.println(arr[2]); // This will not throw an exception
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught an exception: " + e.getMessage());
		} finally {
			System.out.println("This block always executes, even if no exception occurs.");
		}

		// try with resources (Java 7 and later)
		try (Scanner sc = new java.util.Scanner(System.in)) {
			System.out.println("Enter a number:");
			int number = sc.nextInt();
			System.out.println("You entered: " + number);
		} catch (java.util.InputMismatchException e) {
			System.out.println("Invalid input, please enter a valid number.");
		}

		// Example of throwing an exception
		try {
			throw new Exception("This is a custom exception message.");
		} catch (Exception e) {
			System.out.println("Caught an exception: " + e.getMessage());
		}
		System.out.println("End of exception handling example.");

		// Example of using throws in a method
		try {
			methodThatThrowsException();
		} catch (Exception e) {
			System.out.println("Caught an exception from method: " + e.getMessage());
		}
		System.out.println("End of main method.");

	}

	// Method that throws an exception
	public static void methodThatThrowsException() throws Exception {
		throw new Exception("Exception thrown from methodThatThrowsException.");
	}
}
