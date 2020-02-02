package KesaHarkat;

//Ratkaisu K_14: Piste, pikseli ja kolmio
//a) Piste b) Pikseli c) Object clone() d) Kolmio

public class K14_PisteSovellus {

	public static void main(String[] a) {
		tulostaPisteet();
		tulostaPisteetPoikkeukset();
	}

	static void tulostaPisteet() {
		Piste piste = new Piste();
		System.out.println(piste);
		piste.setPoint(21, 7);
		System.out.println(piste);

		Pikseli pikseli = new Pikseli(12, 5, 9);
		System.out.println(pikseli);
	}

	static void tulostaPisteetPoikkeukset() {
		Piste p1 = new Piste(4, 2);
		Piste p2 = null;

		try {
			p2 = (Piste) p1.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("** P1: **");
		System.out.println(p1);
		System.out.println("** P2: **");
		System.out.println(p2);
		System.out.println("\np1==p2: " + p1.equals(p2));

		// Omat lisätestaukset:
		System.out.println("\n\n*******************************************************************");
		System.out.println("** Pikseli **");
		Pikseli pi1 = new Pikseli(1, 2, 3);
		System.out.println(pi1);
		System.out.println("\n\n** KOLMIO **");
		Piste p3 = new Piste(41, 21);
		System.out.println(p3);
		Kulmio k1 = new Kulmio(p1, new Piste(200, 100), p3);
		System.out.println(k1);
		System.out.println("\n\n** Lisätestaus clone()-methodille **");
		Piste p4 = (Piste) p1.clone();
		System.out.println("\np1==p2: " + p1.equals(p2) + "\nLisätesti1: " + "\np1==p4: " + p1.equals(p4)
				+ "\nLisätesti2: " + "\np2==p4: " + p2.equals(p4)); // Nice. It seems to work OK.
	}
}
