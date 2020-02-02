package KesaHarkat;
// Harjoitus K-15 Shape-, Rectangle- ja Circle- luokkahierrarkioista
import java.util.List;
import java.util.ArrayList;

public class K15_ShapeTest {

	public static void tulostaPintaalat(List<Shape> shapes) {
		for (int i = 0; i < shapes.size(); i++) {
			System.out.println(shapes.get(i) + ", Kaava: " + shapes.get(i).algebra + ", Pinta-ala: " + shapes.get(i).area
					+ ", kaari: " + shapes.get(i).arc);
		}
	}

	public static void tulostaPintaalatGener(List<Shape> shapes) {
			for (int i = 0; i < shapes.size(); i++)
				System.out.println(shapes.get(i));
	}

////// Miksi en voi laittaa try-catch rakennetta?
//////
//	public void tulostaPintaalatGener(List<Shape> shapes) {
////		try {
//			for (int i = 0; i < shapes.size(); i++)
//				System.out.println(shapes.get(i));
////		} catch (exception e) {
////			System.out.println("Something went wrong, but what it is?");
////		}
//	}

	public static void main(String args[]) {
		List<Shape> s = new ArrayList<Shape>(); 
		s.add(new Circle(6));
		s.add(new Rectangle(4, 5));
		tulostaPintaalat(s);
		tulostaPintaalatGener(s);
	}
}