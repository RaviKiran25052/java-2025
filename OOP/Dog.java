public class Dog extends Animal {
	
	int lives;
	
	Dog(int lives) {
		this.lives = lives;
	}
	
	void speak() {
		System.out.println("This animal goes *woof*");
	}
}
