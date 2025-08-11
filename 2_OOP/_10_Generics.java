public class _10_Generics {
	
	// Generics allow classes, interfaces, and methods to operate on types specified by the user
	// <T> is a type parameter that can be replaced with any class type
	// <T extends Number> restricts T to be a subclass of Number
	// <T extends Comparable<T>> restricts T to be a subclass of Comparable of T
	// <T extends Number & Comparable<T>> combines both restrictions
	// <T extends Number & Comparable<? super T>> allows T to be compared with its superclasses
	// <String, Integer> specifies that the method works with String and Integer types

	public static void main(String[] args) {

		Box<String> fruits = new Box<>(new String[]{"Apple", "Banana", "Cherry"});
		System.out.println("First fruit: " + fruits.getItem(0));
		fruits.addItem("Date");
		System.out.println("Added a new fruit: " + fruits.getItem(3));
	}
}
