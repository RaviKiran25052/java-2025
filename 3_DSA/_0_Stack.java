import java.util.Stack;

public class _0_Stack {
	public static void main(String[] args) {

		Stack<String> fruits = new Stack<>();

		fruits.push("Banana"); // 1. push
		fruits.push("Orange");
		fruits.push("Mango");
		fruits.push("Apple");

		System.out.println("\nThe fruits in the stack are: " + fruits);
		System.out.println("fruit in the top of the stack: " + fruits.peek()); // 2. peek
		String removedItem = fruits.pop(); // 3. pop
		System.out.println(removedItem + " poped from the stack.");
		System.out.println("The fruits in the stack are: " + fruits);
		System.out.println("Orange was at: " + fruits.search("Orange")); // 4. search
		System.out.println("Pineapple was at: " + fruits.search("Pineapple"));
		
		fruits.pop();
		System.out.println("The fruits in the stack are: " + fruits);
		System.out.println("was the stack empty: " + fruits.isEmpty()); // 5. isEmpty
		fruits.pop();
		System.out.println("The fruits in the stack are: " + fruits);
		System.out.println("was the stack empty: " + fruits.isEmpty());
		fruits.pop();
		System.out.println("The fruits in the stack are: " + fruits);
		System.out.println("was the stack empty: " + fruits.isEmpty());
	}
}