public class Van {
	
	String model;
	int year;
	Engine engine;

	Van(String model, int year, String engine) {
		this.model = model;
		this.year = year;
		this.engine = new Engine(engine);
	}

	void drive() {
		this.engine.start();
		System.out.println("The car was running..!");
	}
}
