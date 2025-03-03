import java.util.LinkedList;
import java.util.Queue;

public class _1_Queue {
	public static void main(String[] args) {

		// Queue<String> queue = new Queue<>();
		// Queue was an interface, so we use LinkedList

		// enqueue - offer() - adding
		// dequeue - poll() - removing
		Queue<String> queue = new LinkedList<>();

		queue.offer("Ravi");
		queue.offer("Bharath");
		queue.offer("Partha");
		queue.offer("Vinay");

		System.out.println("\nThere are " + queue.size() + " members in the queue.");
		System.out.println("Members in the queue are: " + queue);
		System.out.println("First person in the queue: " + queue.peek());
		queue.poll();
		System.out.println("Members in the queue are: " + queue);
		queue.poll();
		System.out.println("Members in the queue are: " + queue);
		queue.poll();
		System.out.println("Members in the queue are: " + queue);
		queue.poll();
		System.out.println("Members in the queue are: " + queue);
		System.out.println("Are there any people in the queue: " + queue.isEmpty());
		System.out.println("was Akash there in the queue: " + queue.contains("Akash"));
	}
}