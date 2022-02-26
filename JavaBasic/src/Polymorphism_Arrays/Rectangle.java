package Polymorphism_Arrays;

public class Rectangle extends Shape {
	private int length;
	private int borderwidth;

	public Rectangle() {

	}

	public Rectangle(int L, int w) {
		this.length = L;
		this.borderwidth = w;
	}


	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBorderwidth() {
		return borderwidth;
	}

	public void setBorderwidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}

	public double area() {
		return length * borderwidth;

	}
}
