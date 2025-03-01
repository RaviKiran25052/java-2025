public class _6_Aggregation {
	public static void main(String[] args) {
		
		// Aggregation = has-a relation b/w objects
		// One obj contains another obj as its structure

		Book book1 = new Book("Harry Potter", "J K Rowling", 520);
		Book book2 = new Book("Tom Sawyer", "Mark Twain", 340);
		Book book3 = new Book("Alice in Wonderland", "Aldous Huxley", 670);
		
		Book[] books = {book1, book2, book3};

		Library lib = new Library("Manasa", 2000, books);
		lib.displayInfo();

		// Composition = part-of relation
		// one obj was part of another obj

		Van van = new Van("Nexon", 2025, "V8");

		System.out.printf("\nThe %s van was manufactured in %d with %s engine\n", van.model, van.year, van.engine.type);
		van.drive();
	}
}