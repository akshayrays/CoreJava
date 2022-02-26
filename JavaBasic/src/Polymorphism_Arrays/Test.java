package Polymorphism_Arrays;

//import Polymorphism_Example.Shape;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape[] s;
		s = new Shape[2];

		s[0] = new Rectangle(3,4);
		s[1] = new Circle(10);
		// s[2] = new Triangle();

		double totalArea = calArea(s);
		System.out.println(totalArea);
	}

	private static double calArea(Shape[] s) {
		int totalArea = 0;
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].area());
			totalArea += s[i].area();
		}
		return totalArea;

	}

	}

