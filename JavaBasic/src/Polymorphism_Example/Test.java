package Polymorphism_Example;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] s;
		s = new Shape[3];

		s[0] = new Rectangle();
		s[1] = new Circle();
		s[2] = new Triangle();
		int totalArea=calcArea(s);
		System.out.println(totalArea);

	}
public static int calcArea(Shape[] s) {
	int totalArea =0;
	 for (int i = 0; i < s.length; i++) {
		totalArea +=s[i].area();
	}
	 return totalArea;
}
	
}
