import java.util.ArrayList;
import java.util.Collections;

public class _8_ArrayLists {
	public static void main(String[] args) {

		// ArrayList - A resizable array that stores objects (autoboxing).
		// <> - diamond operator
		// no need of ArrayList<String> fruits = new ArrayList<Integer>();
		ArrayList<String> fruits = new ArrayList<>();

		fruits.add("Mango");
		fruits.add("Guava");
		fruits.add("Banana");
		fruits.add("Lemon");
		fruits.add("Apple");
		fruits.add("Lemon");

		fruits.remove(5);
		fruits.set(3, "Orange");
		System.out.println(fruits.get(2));
		System.out.println(fruits);
		System.out.println(fruits.size());

		Collections.sort(fruits);
		System.out.println(fruits);
	}
}