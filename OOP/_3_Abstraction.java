public class _3_Abstraction {
	public static void main(String[] args) {
		
		// abstract classes - shape
		// Shape shp = new Shape(); // Error: Shape is abstract; cannot be instantiated

		// concrete classes - circle and rectangle (inherit from shape)
		Circle cir = new Circle(5);
		Rectangle rect = new Rectangle(5, 10);

		System.out.printf("\nCircle Area: %.3f", cir.getArea());
		System.out.printf("\nCircle Perimeter: %.3f", cir.getPerimeter());

		System.out.println("\nRectangle Area: " + rect.getArea());
		System.out.println("Rectangle Perimeter: " + rect.getPerimeter());

		// shp.show();
		cir.show();
		rect.show();

		System.out.println();

		// interfaces - predator and prey
		Snake snake = new Snake(); // inherits from single parent (Predator)
		Frog frog = new Frog(); // inherits from multiple parents (Prey, Predator)

		snake.hunt(); // Predator interface
		snake.eat();
		frog.flee(); // Prey interface
		frog.hunt(); // Predator interface
		frog.eat();
	}
}
