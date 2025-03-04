import java.util.Scanner;

public class _9_Inputs {

	// to stop scanner class warning (optional)
   @SuppressWarnings("ConvertToTryWithResources")
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1. Read an integer
		System.out.print("Enter an integer: ");
		int num = sc.nextInt();

		// 2. Read a double
		System.out.print("Enter a decimal number: ");
		double decimal = sc.nextDouble();

		// 3. Read a single word
		System.out.print("Enter a single word: ");
		String word = sc.next();

		// 4. Read a full line
		sc.nextLine(); // Consume leftover newline
		System.out.print("Enter a full sentence: ");
		String sentence = sc.nextLine();

		// 5. Read a boolean
		System.out.print("Are you enjoying Java? (true/false): ");
		boolean isEnjoying = sc.nextBoolean();

		// 6. Using hasNextInt() to check input
		System.out.print("Enter an integer to check: ");
		if (sc.hasNextInt()) {
			int checkedNum = sc.nextInt();
			System.out.println("You entered a valid integer: " + checkedNum);
		} else {
			System.out.println("That's not a valid integer!");
		}

		// Displaying the collected input
		System.out.println("\nCollected Inputs:");
		System.out.println("Integer: " + num);
		System.out.println("Double: " + decimal);
		System.out.println("Word: " + word);
		System.out.println("Sentence: " + sentence);
		System.out.println("Enjoying Java? " + isEnjoying);

		// To avoid memory leaks, always close the scanner when done
		sc.close();
	}
}
