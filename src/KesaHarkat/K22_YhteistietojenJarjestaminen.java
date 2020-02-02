package KesaHarkat;

public class K22_YhteistietojenJarjestaminen {
	// H22: Yhteistietojen järjestäminen comarator- metodilla a) iän mukaan
	// järjestettynä.

	public static void main(String args[]) {
		Yhteystieto[] kaverit = new Yhteystieto[8];
		kaverit[0] = new Yhteystieto("Roope", "Ankka", "050-54321", 50);
		kaverit[1] = new Yhteystieto("Taavi", "Ankka", "050-54321", 50);
		kaverit[2] = new Yhteystieto("Kake", "Ykkönen", "050-645645", 46);
		kaverit[3] = new Yhteystieto("Aku", "Ankka", "050-12434", 50);
		kaverit[4] = new Yhteystieto("Tupu", "Ankka", "050-98765", 13);
		kaverit[5] = new Yhteystieto("Hupu", "Ankka", "050-12345", 13);
		kaverit[6] = new Yhteystieto("Lupu", "Ankka", "050-76543", 13);
		kaverit[7] = new Yhteystieto("Uuno", "Ykkönen", "050-12341", 18);
 
		System.out.println("\nTaulukko järjestetään iän mukaan nuorimmasta vanhimpaan:"); // a)
		java.util.Arrays.sort(kaverit, new IkaComparator());
		for (Yhteystieto y : kaverit) {
			System.out.println(y);
		}
				
		System.out.println("\nb) Nimen mukaan aakkosjärjestyksessä:");	// b)
		java.util.Arrays.sort(kaverit, new NimiComparator());
		for (Yhteystieto y : kaverit) {
			System.out.println(y);
		}
		
		//c) Lisätehtävä: Järjestä yhteystiedot puhelinnumeron numero-osan mukaan nousevaan järjestykseen.

		System.out.println("\nLisätehtävä \nc) Puhelinnumeron numero-osan mukaan:");	// b)
		java.util.Arrays.sort(kaverit, new PuhelinComparator());
		for (Yhteystieto y : kaverit) {
			System.out.println(y);
		}
		
		System.out.println("\nLisätehtävä \nc) Suuntanumero muutetaan nyt kaverit-taulukon jäsenelle 0:");
		kaverit[0].setSuuntanumero("045");
		for (Yhteystieto y : kaverit) {
			System.out.println(y);
		}
		
		System.out.println("\nLisätehtävä \nc) Suuntanumero muutetaan taulukon Kake Ykkönen-nimiselle ankalle;");
		for (Yhteystieto y : kaverit) {
			if (y.getSukunimi() == "Ykkönen" && y.getEtunimi() == "Kake")
			y.setSuuntanumero("045");
			System.out.println(y);
		}
		
//		public void muutaSuuntanumero(String sukunimi, String etunimi, String suuntanumero) {
//		for (Yhteystieto y : kaverit) {
//			if (y.getSukunimi() == sukunimi && y.getEtunimi() == etunimi)
//			y.setSuuntanumero(suuntanumero);
//			System.out.println(y);
//		}
//		}
//		
//		muutaSuuntanumero("Ankka", "Tupu", "111");
	
	}
}
