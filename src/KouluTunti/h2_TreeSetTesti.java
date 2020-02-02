package KouluTunti;

import java.util.Iterator;
import java.util.TreeSet;

//import vk9.Henkilo;

/* 
* Harjoitus 8-2: TreeSet
* Jatketaan HashSet-harjoitusta
* Nyt LisÃ¤tÃ¤Ã¤n Henkilo-olioita TreeSet-rakenteeseen HashSetin sijasta.
* Molemmat ovat Set-rajapinnan toteuttavia luokkia ja niiden metodit ovat yhteensopivia
* toistensa kanssa.
* MitÃ¤ eroa havaitset rakenteiden vÃ¤lillÃ¤?
*/

public class h2_TreeSetTesti {
	public static void main(String[] args) {
		// Luodaan muutamia henkilÃ¶itÃ¤
		Henkilo h1 = new Henkilo("Matti", "Meikalainen", "111131-123A", 84);
		Henkilo h2 = new Henkilo("Teija", "TeikalÃ¤inen", "220242-234B", 73);
		Henkilo h3 = new Henkilo("Pekko", "Peloton", "330363-345A", 52);
		Henkilo h4 = new Henkilo("Ulla", "Untamoinen", "010175-543B", 40);
		Henkilo h5 = new Henkilo("Aku", "Avainheimo", "020286-432C", 29);

		// luodaan TreeSet-olio
		TreeSet<Henkilo> t = new TreeSet<>();
		// lisataan henkilo-oliot TreeSet:iin
		t.add(h1);
		t.add(h2);
		t.add(h3);
		t.add(h4);
		t.add(h5);

		Henkilo h6 = new Henkilo("Aku", "Ankkalampi", "020386-456D", 29);
		Henkilo h7 = new Henkilo("Simo", "Avainheimo", "020486-478E", 29);
		Henkilo h8 = new Henkilo("Suvi", "Avainheimo", "121486-543A", 29);
		t.add(h6);
		t.add(h7);
		t.add(h8);

		// tulostetaan TreeSet-tietorakenne
		Iterator<Henkilo> iter = t.iterator();
		while (iter.hasNext()) {
			Henkilo henkilo = iter.next();
			System.out.println(henkilo);
		}

	}
}
