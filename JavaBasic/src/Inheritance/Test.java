package Inheritance;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r = new Rectangle();
		r.setLength(5);
		r.setBorderwidth(3);
		r.setArea(10);
		r.setColor("Red");

		System.out.println("this is length = " +r.getLength() + "....this is color = " +r.getColor() + "...this is area = " + r.getArea() + ".......this is bw = " + r.getBorderwidth());

		Circle c = new Circle();
		c.setRadius(22);
		c.setArea(10);
		c.setColor("blue");
		System.out.println("this is Circle Radius = " + c.getRadius() + " Area= " + c.getArea());
		System.out.println(c.getColor());
		
		Triangle t = new Triangle();
		t.setBase(22);
		t.setHeight(11);
		t.setArea(33);
		
		System.out.println("This is Base = " + t.getBase() + " this is triangle = " + t.getHeight() + " this is Area= " + t.getArea());

		
	}

}
