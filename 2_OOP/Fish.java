public class Fish extends Animal {
	
	int lives;

	Fish(int lives) {
		super();
		this.lives = lives;
	}
	
   @Override // method overriding - overriding the move() method of the parent class
	void move() {
		System.out.println("This fish is swimming.");
	}

	void speak() {
		System.out.println("This animal goes *blub*");
	}
	
}
