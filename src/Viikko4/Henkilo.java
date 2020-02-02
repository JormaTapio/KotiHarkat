package Viikko4;

public class Henkilo {
	String etunimi;
	String sukunimi;
	String sotu;
	int ika = 0;

	public Henkilo(String etunimi, String sukunimi, String sotu, int ika) {
		this.etunimi = etunimi;
		this.sukunimi = sukunimi;
		this.sotu = sotu;
		this.ika = ika;
	}

	public String palautaSotu() {
		return sotu;
	}

	String palautaEtunimi() {
		return etunimi;
	}

	String palautaSukunimi() {
		return sukunimi;
	}

	String palautaTiedot() {
		return "Etunimi: " + etunimi + "\tsukunimi: " + sukunimi + "\tsotu: " + sotu + "\tikä: " + ika;
	}

	void muutaEtunimi(String muutettuEtunimi) {
		this.etunimi = muutettuEtunimi;
	}

	void muutaSukunimi(String muutettuSukunimi) {
		this.sukunimi = muutettuSukunimi;
	}

//	String toString(Henkilo henkilo) {
//		Henkilo apuH = henkilo;
//		return "Etunimi: " + apuH.etunimi + "/t ja sukunimi: " + apuH.sukunimi + "/t sekä sosiaaliturvatunnus: "
//				+ apuH.sotu + " iällä " + apuH.ika;
//	}
}
