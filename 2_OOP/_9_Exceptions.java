public class _9_Exceptions {
	
	// Exception = An event that disrupts the normal flow of the program.
	// Exception handling = Mechanism to handle runtime errors, allowing the program to continue running.
	// try{}, catch{}, finally{}, throw, throws

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		try {
			System.out.println(arr[5]); // This will throw an ArrayIndexOutOfBoundsException
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is out of bounds: " + e.getMessage());
		}
		finally {
			System.out.println("This block always executes, regardless of an exception.");
		}
		System.out.println("Program continues after exception handling.");

		// Example of throwing an exception
		try {
			throw new Exception("This is a custom exception message.");
		} catch (Exception e) {
			System.out.println("Caught an exception: " + e.getMessage());
		}
		System.out.println("End of exception handling example.");
	}
}
