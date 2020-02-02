package KesaHarkat;

public class Rectangle extends Shape {
	
	private int x, y;
	private String name;
	
	public Rectangle() {
	}

	public Rectangle(int wide, int high) {
		//super(name = "Rectangle", area = wide * high, arc = 2*(wide+high), algebra = wide+"*"+high+"=");
		name = "Rectangle";
		area = wide * high;
		arc = 2*(wide+high);
		algebra = wide+"*"+high+"=";
		this.x = wide;
		this.y = high;
	}
	
	public String toString() {
		return name + ": " + algebra + area;
	}
}