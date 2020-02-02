package KouluTunti;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String args[]){
		// Set toimii eritavalla kuin List
		// node, element 
		// Set on periaatteessa "jÃ¤rjestÃ¤mÃ¤tÃ¶n" joukko alkioita
		// Set ei voi lisÃ¤tÃ¤ samanarvoista alkiota uudelleen
		// Tiedon hakeminen erittÃ¤in paljon nopeampaa 
		HashSet<String> joukko = new HashSet<String>();
		joukko.add("Kolme");
		joukko.add("Kaksi");
		joukko.add("Yksi");		
		joukko.add("NeljÃ¤");
		joukko.add("NeljÃ¤");
		joukko.add("Kuusi");
		joukko.add("Kuusi");
		joukko.add("Kuusi");
		
		
		System.out.println(joukko);
		
		Set<String> uudet = new HashSet<>(Arrays.asList("two", "four", "1"));
		// LisÃ¤Ã¤ kaikki toisen kokoelman tiedot 
		joukko.addAll(uudet);
		System.out.println(joukko);
		
		System.out.println( "Kuusi? " + joukko.contains("Kuusi") );
		System.out.println( "kuusi? " + joukko.contains("kuusi") );
		
		HashSet<String> poistettavat = new HashSet<>();
		poistettavat.add("Kuusi");
		poistettavat.add("1"); poistettavat.add("2"); poistettavat.add("3");
		System.out.println("Joukko: " + joukko);
		System.out.println("Poistettavat: " + poistettavat);
		joukko.removeAll(poistettavat);
		System.out.println("Joukko: after" + joukko);
		System.out.println("Poistettavat: after" + poistettavat);
		poistettavat.add("Yksi");
		
		joukko.retainAll(poistettavat); // "KÃ¤Ã¤nteinen operaatio" removelle
		
		System.out.println(joukko);
		
	}
}
