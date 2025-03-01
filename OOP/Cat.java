public class Cat extends Animal {
	
	int lives;
	
	Cat(int lives) {
		this.lives = lives;
	}
	
	void speak() {
		System.out.println("This animal goes *meow*");
	}
}
