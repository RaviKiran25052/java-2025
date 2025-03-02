public class Frog implements Prey, Predator {

	@Override
	public void flee() {
		System.out.println("Frog flees from snakes");
	}

	@Override
	public void hunt() {
		System.out.println("Frog hunts insects");
	}

	@Override
	public void eat() {
		System.out.println("Frog eats insects");
	}	
}
