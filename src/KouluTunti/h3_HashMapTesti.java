package KouluTunti;

import java.util.*;


/* Harjoitus 8-3: HashMap-rakenne 
* 
* LisÃ¤Ã¤ henkilÃ¶-olioita HashMap-rakenteeseen.
* avainarvoksi voit antaa jonkin kokonaisluvun. 
* Etsi henkilÃ¶itÃ¤ avaimen perusteella
* Tulosta kaikki rakenteessa olevat henkilÃ¶t.
*/

public class h3_HashMapTesti {
	@SuppressWarnings("rawtypes")
	public static void main(String args[]) {
		Henkilo h1 = new Henkilo("Matti", "Meikalainen", "111131-123A", 84);
		Henkilo h2 = new Henkilo("Teija", "TeikalÃ¤inen", "220242-234B", 73);
		Henkilo h3 = new Henkilo("Pekko", "Peloton", "050363-345A", 52);
		Henkilo h4 = new Henkilo("Ulla", "Untamoinen", "010175-543B", 40);
		Henkilo h5 = new Henkilo("Aku", "Avainheimo", "020286-432C", 29);

		// tai Map henkilot = new HashMap();
		Map<Integer, Henkilo> henkilot = new HashMap<Integer, Henkilo>();
		henkilot.put(2, h1);
		henkilot.put(3, h2);
		henkilot.put(4, h3);
		henkilot.put(10, h4);
		henkilot.put(20, h5);
		henkilot.put(21, h5);

		// Tulostetaan kaikki
		System.out.println(henkilot);

		// Etsi arvoa avaimen perusteella
		System.out.println("Haku 10:" + henkilot.get(10));
		System.out.println("Haku 21:" + henkilot.get(21));

		Iterator iter = henkilot.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry alkio = (Map.Entry) iter.next();
			Integer avain = (Integer) alkio.getKey();
			Henkilo arvo = (Henkilo) alkio.getValue();
			System.out.println("Avain =" + avain + " ja arvo = " + arvo);
		}
	}
}

