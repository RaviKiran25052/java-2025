public abstract  class Shape {
	
	// abstract method – method need overided by child class
	abstract double getArea();
	abstract double getPerimeter();

	void show() { // concrete method - normal method
		System.out.println("This is a shape.");
	}
}
