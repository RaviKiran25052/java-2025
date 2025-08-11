
import java.util.Timer;
import java.util.TimerTask;

public class _14_TimerTasks {

	// Timer - a class that schedules tasks at specific times or periodically
	// TimerTask - represents a task that can be scheduled for execution by a Timer

	public static void main(String[] args) {
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {

			int count = 3;

			@Override
			public void run() {
				System.out.println("Hello");
				count--;
				if (count == 0) {
					System.out.println("Task completed.");
					timer.cancel();
				}
			}
		};

		timer.schedule(task, 0, 1000); // Schedule task to run every second
	}
}