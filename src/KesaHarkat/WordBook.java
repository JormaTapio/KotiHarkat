package KesaHarkat;

import java.util.Scanner;
import java.util.HashMap;

public class WordBook extends HashMap {

	String English;
	String Finnish;
	// HashMap <String, String> HashWords = new HashMap <String, String>();

	public WordBook() {
	}

	public WordBook(String English, String Finnish) {
	//	super();	//?
	}

//	public void put(String English, String Finnish) {
//		//HashWords.add(this.index,this.English = English, this.Finnish= Finnish);
//		//HashWords.add(index, HashMap(English, Finnish));
//		HashWords.add(English, Finnish);
//		//HashWords.add(HashMap("English", "Finnish"));
////		this.English = English;
////		this.Finnish = Finnish;
//		index = +1;
//	}

//	public String get(String English) {
//		String tulostus = clone().toString();
//		int firstindex = tulostus.indexOf(English);
//		int lastindex = tulostus.substring(firstindex+1).indexOf(",");
//
//		if (firstindex != -1) {
//			String tulos = tulostus.substring(firstindex+1,lastindex);
//			return tulos;
//			}
//		else
//			return "Ei käännöstä vielä tästä " + English + "sanasta.";
//	}

	public void printAll() {

		String tulostus = clone().toString();
		String valitulostus = "";
		String apumjono = tulostus;
		int firstindex = 1;

		// Käytetään String-luokan methodeja hyväksi.
		// Ensimäisessä välituloksessa on poistettu{- ja }-merkit.
		// Lisäksi =-merkki on muutettu " => "-merkkijonoksi.
		
		int lastindex = apumjono.indexOf("=");
		if (lastindex != -1) {
			valitulostus = apumjono.substring(firstindex, firstindex + lastindex - 1) + " => ";
			firstindex = lastindex + 1;
			apumjono = apumjono.substring(firstindex);
		}
		firstindex = apumjono.indexOf("=");
		while (firstindex != -1) {
			valitulostus += apumjono.substring(0, firstindex) + " => ";
			apumjono = apumjono.substring(firstindex + 1);
			firstindex = apumjono.indexOf("=");
		}

		// Nyt jaetaan valitulos omille riveilleen ja poistetaan ,-merkki.
		firstindex = valitulostus.indexOf(",");
		if (lastindex != -1)
			apumjono = valitulostus;
		valitulostus = "";

		while (firstindex != -1) {
			valitulostus += apumjono.substring(1, firstindex) + "\n";
			apumjono = apumjono.substring(firstindex + 1);
			firstindex = apumjono.indexOf(",");
		}

		System.out.println(valitulostus);
	}

}
