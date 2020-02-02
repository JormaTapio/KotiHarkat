package KouluTunti;

import java.util.HashSet;

//import vk9.Henkilo;

/* 
* Harjoitus 8-1: HashSet
* 
* LisÃ¤tÃ¤Ã¤n Henkilo-olioita HashSet-rakenteeseen.
* TÃ¤mÃ¤n jÃ¤lkeen tulostetaan rakenteessa olevat tiedot.
* LisÃ¤tÃ¤Ã¤n jokin HashSet-rakenteessa olio toiseen kertaan (esim. h5).
* LisÃ¤tÃ¤Ã¤n jokin uusi olio samoilla tiedoilla HashSet-rakenteeseen.

// Luodaan muutamia henkilÃ¶itÃ¤
Henkilo h1 = new Henkilo("Matti", "Meikalainen","111131-123A", 84);
Henkilo h2 = new Henkilo("Teija", "TeikalÃ¤inen","220242-234B", 73);
Henkilo h3 = new Henkilo("Pekko", "Peloton",    "050363-345A", 52);
Henkilo h4 = new Henkilo("Ulla", "Untamoinen",  "010175-543B", 40);
Henkilo h5 = new Henkilo("Aku", "Avainheimo",   "020286-432C", 29);

*/

public class h1_HashSetTesti {
	public static void main(String args[]) {
		// Luodaan muutamia henkilÃ¶itÃ¤
		Henkilo h1 = new Henkilo("Matti", "Meikalainen", "111131-123A", 84);
		Henkilo h2 = new Henkilo("Teija", "TeikalÃ¤inen", "220242-234B", 73);
		Henkilo h3 = new Henkilo("Pekko", "Peloton", "050363-345A", 52);
		Henkilo h4 = new Henkilo("Ulla", "Untamoinen", "010175-543B", 40);
		Henkilo h5 = new Henkilo("Aku", "Avainheimo", "020286-432C", 29);
		h4.hashCode();

		HashSet<Henkilo> henkilot = new HashSet<>();
		henkilot.add(h1);
		henkilot.add(h2);
		henkilot.add(h3);
		henkilot.add(h4);
		henkilot.add(h5);

		// Tulostetaan rakenteessa olevien henkiloiden tiedot
		for (Henkilo h : henkilot) {
			System.out.println(h);
		}

		// YritetÃ¤Ã¤n lisata sama olio toisen kerran
		// lisataan uudelleen ==> ei onnistu
		System.out.println("\nLisataan sama olio uudelleen : " + h5 + "\n");
		henkilot.add(h5);
		henkilot.add(new Henkilo("Aku", "Avainheimo", "020286-432C", 29));
		henkilot.add(new Henkilo("Aku", "Avainheimo", "020286-432C", 29+1));
		

		// tulostetaan rakenne
		for (Henkilo h : henkilot) {
			System.out.println(h);
		}

		Henkilo h6 = new Henkilo("Aku", "Avainheimo", "020286-432C", 29);
		Henkilo h7 = new Henkilo("Aku", "Avainheimo", "020286-432C", 29);
		System.out.println("\nLisataan uusi uudelleen : " + h6 + "\n");
		henkilot.add(h6);
		henkilot.add(h7);

		// tulostetaan rakenne
		for (Henkilo h : henkilot) {
			System.out.println(h);
		}

	}
}

