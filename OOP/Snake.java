public class Snake implements Predator {

	@Override
	public void hunt() {
		System.out.println("Snake hunts frog");
	}
	
	@Override
	public void eat() {
		System.out.println("Snake eats frog");
	}
	
}
