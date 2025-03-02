public class Library {

	String name;
	int year;
	Book[] books;

	Library(String name, int year, Book[] books) {
		this.name = name;
		this.year = year;
		this.books = books;
	}

	void displayInfo() {
		System.out.printf("\nThe %s Library was established on %d.\n", this.name, this.year);
		for(Book book : this.books) {
			book.displayInfo();
		}
	}
}
