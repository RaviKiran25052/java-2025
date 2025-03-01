public class Animal {
	
	boolean isAlive;

	Animal() {
		this.isAlive = true;
	}

	void move() {
		System.out.println("This animal is running.");
	}
	void die() {
		this.isAlive = false;
		System.out.println("This animal has died.");
	}
}
