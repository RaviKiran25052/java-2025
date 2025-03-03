public class Book {
	
	String title;
	String author;
	int pages;

	Book(String title, String author, int pages) {
		this.title = title;
		this.author = author;
		this.pages = pages;
	}

	void displayInfo() {
		System.out.printf("The Book '%s', by %s has %d pages.\n", this.title, this.author, this.pages);
	}
}
