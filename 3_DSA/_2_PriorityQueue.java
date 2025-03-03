import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class _2_PriorityQueue {
	public static void main(String[] args) {

		// Queue<Double> cgpas = new PriorityQueue<>();
		// by default the priority was from low to high
		// to reverse the order we pass a reverse function to the constructor
		Queue<Double> cgpas = new PriorityQueue<>(Collections.reverseOrder());

		cgpas.offer(9.25);
		cgpas.offer(9.72);
		cgpas.offer(8.75);
		cgpas.offer(8.64);
		cgpas.offer(8.96);
		cgpas.offer(9.45);
		cgpas.offer(8.00);
		cgpas.offer(9.36);

		System.out.println("\nHighest CGPA: " + cgpas.peek());
		while (!cgpas.isEmpty()) {
			System.out.println(cgpas.poll());
		}
	}
}
