
import java.util.LinkedList;

public class _3_LinkedList {
	public static void main(String[] args) {
		
		LinkedList<String> fruits = new LinkedList<>();
		// this was a double linked list
		// linked list can be used as a stack or a queue
		// so we can use the methods of both stack and queue
		// but we can't use the methods of priority queue

		fruits.add("Banana"); // 1. add
		fruits.add("Orange");
		fruits.add("Mango");
		fruits.add("Apple");

		System.out.println("\nThe fruits in the list are: " + fruits);

		fruits.add(2, "Pineapple"); // 2. add at index
		System.out.println("After adding pineapple: " + fruits);
		fruits.addFirst("Grapes"); // 3. addFirst
		System.out.println("After adding grapes from first: " + fruits);
		fruits.addLast("Papaya"); // 4. addLast
		System.out.println("After adding papaya from last: " + fruits);
		System.out.println("fruit in the top of the list: " + fruits.peekFirst()); // 5. peekFirst
		System.out.println("fruit in the bottom of the list: " + fruits.peekLast()); // 6. peekLast
		fruits.remove("Mango"); // 7. remove
		System.out.println("fruits list after removing Mango: " + fruits);
		String removedItem = fruits.removeFirst(); // 8. removeFirst
		System.out.println(removedItem + " removed from the list.");
		System.out.println("The fruits in the list are: " + fruits);
		removedItem = fruits.removeLast(); // 9. removeLast
		System.out.println(removedItem + " removed from the list.");
		System.out.println("The fruits in the list are: " + fruits);
	}
}