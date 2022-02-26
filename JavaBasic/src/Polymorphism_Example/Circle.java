package Polymorphism_Example;

public class Circle extends Shape {

	private int radius = 11;
	private double PI = 3.14;

	public int area() {
		return (int)(PI*radius *radius);
		
	}
}
