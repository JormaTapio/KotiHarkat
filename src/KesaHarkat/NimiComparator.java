package KesaHarkat;

import java.util.Comparator;

public class NimiComparator implements Comparator<Yhteystieto> {
	public int compare(Yhteystieto ayhteystieto, Yhteystieto byhteystieto) {
// Palautaa nimen mukaan kasvavassa eli nousevassa järjestyksessä

		String asukunimi = ayhteystieto.getSukunimi();
		String bsukunimi = byhteystieto.getSukunimi();
		String aetunimi = ayhteystieto.getEtunimi();
		String betunimi = byhteystieto.getEtunimi();

		// int compare = 0;
		/*
		 * if (compare != 0) compare = asukunimi.compareTo(bsukunimi); else compare =
		 * aetunimi.compareTo(betunimi); return compare; }
		 */

		int apituus = asukunimi.length();
		int bpituus = bsukunimi.length();
		char achar;

		char bchar;
		int pituus = java.lang.Math.min(apituus, bpituus);
		for (int i = 0; i < pituus; i++) {
			achar = asukunimi.charAt(i);
			bchar = bsukunimi.charAt(i);
			if (achar != bchar)
				return (int) achar - (int) bchar;
		}
		if (apituus != bpituus)
			return apituus - bpituus;

		apituus = aetunimi.length();
		bpituus = betunimi.length();
		pituus = java.lang.Math.min(apituus, bpituus);
		for (int i = 0; i < pituus; i++) {
			achar = aetunimi.charAt(i);
			bchar = betunimi.charAt(i);
			if (achar != bchar)
				return (int) achar - (int) bchar;
		}
		// if (apituus != bpituus)
		return apituus - bpituus;
	}
}

class PuhelinComparator implements Comparator<Yhteystieto> {

	public int compare(Yhteystieto atieto, Yhteystieto btieto) {
		String amjonopuhelin = atieto.getPuhelin().substring(4);
		String bmjonopuhelin = btieto.getPuhelin().substring(4);
		int apuhelin = amjonopuhelin.length();
		int bpuhelin = bmjonopuhelin.length();
		int pituus = java.lang.Math.min(apuhelin, bpuhelin);
		char achar;
		char bchar;
		
		for (int i = 0; i < pituus; i++) {
			achar = amjonopuhelin.charAt(i);
			bchar = bmjonopuhelin.charAt(i);
			if (achar != bchar)
				return (int) achar - (int) bchar;
		}
		return 0;
	}
}