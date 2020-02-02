package KesaHarkat;

public class Circle extends Shape {

	private double radius;
	static double PI = 3.14;
	private String name;

	public Circle(double radius) {
		name = "Circle";
		area = PI * radius * radius;
		arc = 2 * PI * radius;
		algebra = "PI*" + radius + "^2=";
		this.radius = radius;
	}
	
	public String toString() {
		return name + ": " + algebra + area;
	}
}
