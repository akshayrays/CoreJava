package Polymorphism_Arrays;

public class Circle extends Shape {

	private double radius;

	public Circle() {
	}

	public Circle(double r) {
		this.radius = r;
	}

	public double getRadius() {
		return radius;
	}

	public double area() {
		return 3.14 * radius * radius;

	}

}
