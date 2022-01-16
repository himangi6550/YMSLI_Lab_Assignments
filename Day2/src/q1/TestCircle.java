package q1;

class Circle {
	private double radius;
	private String color;

	public Circle() {
		radius = 1.0;
		color = "Red";
	}

	public Circle(double r) {
		radius = r;
	}

	public double getRadius() {
		// TODO Auto-generated method stub
		return radius;
	}

	public double getArea() {
		// TODO Auto-generated method stub
		return (3.14 * radius * radius);

	}
}

public class TestCircle {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println(c1.getRadius());
		System.out.println(c1.getArea());
		Circle c2 = new Circle(8.4);
		System.out.println(c2.getRadius());
		System.out.println(c2.getArea());
	}

}
