package KesaHarkat;
//import java.util.ArrayList;

//import java.util.List;

abstract class Shape {
	private String name; // kuvion nimi
	double area;
	double arc;
	String algebra;

	public Shape() {
		this.name = "Shape";
		this.area = 0;
		this.arc = 0;
		this.algebra = "";
	}

//	public void tulostaPintaalat(List<Shape> shapes) {
//		for (int i = 0; i < shapes.size(); i++) {
//			System.out.println(shapes.get(i) + ", Kaava: " + shapes.get(i).algebra + ", Pinta-ala: " + shapes.get(i).area
//					+ ", kaari: " + shapes.get(i).arc);
//		}
//	}
//
//	public void tulostaPintaalatGener(List<Shape> shapes) {
//			for (int i = 0; i < shapes.size(); i++)
//				System.out.println(shapes.get(i));
//	}

	String toString(Shape shape) {
		return (shape.name + ", Kaava: " + shape.algebra + ", Pinta-ala: " + shape.area + ", kaari: " + shape.arc);
	}
}