package KouluTunti;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

	public static void main(String args[]){
		
		// Dynaaminen taulukko
		//ArrayList taulu = new ArrayList(); // Javassa "vanha tapa"
		ArrayList<String> taulu = new ArrayList<String>(10);
//		ArrayList<Henkilo> taulu2 = new ArrayList<Henkilo>();
//		ArrayList<Henkilo> taulu2 = new ArrayList<>();
		//taulu2.add(new Henkilo("Aku", "Ankka", "4535345345", 44));
		taulu.add(new String("Yksi " + 1 + " jatkuu"));
		taulu.add("Kaksi");
		taulu.add("Kolme");
		taulu.add("NeljÃ¤");
		taulu.add("Kuusi");
		taulu.add("Kuusi");
		taulu.add("Kuusi");
		
		System.out.println("1: " +taulu);
		
		taulu.add(2, "two");
		taulu.add(5, "four");
		
		System.out.println("2. " +taulu);
		
		taulu.remove(2); // Poistaa indeksikohdasta kaksi
		taulu.remove(2); // laskee uudelleen
		taulu.remove(2);
		taulu.remove(2);
		taulu.remove("Kuusi");
		taulu.remove("Kuusi");
		//taulu.remove("Kuusi");
		//taulu.remove("Kuusi");
		taulu.clear(); // Poistaa kaikki taulun alkiot
		
		System.out.println("2.5: " + taulu);
		
		//ArrayList<String> poistettavat = new ArrayList<>();
		ArrayList<String> lisattavat = new ArrayList<>();
		lisattavat.add("Eka Uusi");
		lisattavat.add("Toinen Kuusi");
		taulu.addAll(lisattavat);
		System.out.println("SisÃ¤ltÃ¤Ã¤kÃ¶ ? " + taulu.contains("Eka Uusi"));
		System.out.println("Koko: " + taulu.size());
		System.out.println("2.8: " + taulu);
		taulu.removeAll(lisattavat);
		taulu.trimToSize();
		
		// ArrayList voidaan palauttaa "tavalliseksi taulukoksi"
		String[] t = new String[taulu.size()];
		t = taulu.toArray(t);
		System.out.println("3: " +Arrays.toString(t));
		
		System.out.println("SisÃ¤ltÃ¤Ã¤kÃ¶ ? " + taulu.contains("Eka Uusi"));
		System.out.println("4: " +taulu);
		
				
	}
}
