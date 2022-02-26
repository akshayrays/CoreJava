package Polymorphism;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Circle();
		Shape s1 = new Rect();
		Shape s2 = new Triangle();

		s.area();
		s1.area();
		s2.area();

	}

}
/*Method overriding*/