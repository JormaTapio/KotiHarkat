package Viikko3;

public class Henkilo implements Comparable<Henkilo> {
	private String etunimi;
	private String sukunimi;
	private int ika;
	private final String sotu;

	public Henkilo(String etunimi, String sukunimi, String sotu, int ika) {
		this.etunimi = etunimi;
		this.sukunimi = sukunimi;
		this.sotu = sotu;
		this.ika = ika;
	}

	public String getSotu() {
		return sotu;
	}

	public String getEtunimi() {
		return etunimi;
	}

	public String getSukunimi() {
		return sukunimi;
	}

	public int getIka() {
		return ika;
	}

	@Override
	public String toString() {
		return etunimi + " " + sukunimi + " " + sotu + " " + ika;
	}

	public void setEtunimi(String etunimi) {
		this.etunimi = etunimi;
	}

	public void setSukunimi(String sukunimi) {
		this.sukunimi = sukunimi;
	}

	public void setIka(int ika) {
		this.ika = ika;
	}

	@Override
	public int compareTo(Henkilo verrattava) {
		// System.out.println("Verrattava : " + sukunimi + " " + etunimi + " Vertaaja :
		// " + verrattava.getSukunimi() + " " + verrattava.getEtunimi());
		int sukuVert = sukunimi.compareTo(verrattava.getSukunimi());
		if (sukuVert == 0) // jos sukunimet ovat samat, verrataan vielÃ¤ etunimiÃ¤
			return etunimi.compareTo(verrattava.getEtunimi());
		else // sukunimet ovat erisuuret, palautetaan vertailun tulos
			return sukuVert;
	}

	// metodi palauttaa true, jos kaksi henkilÃ¶a ovat samoja
	@Override
	public boolean equals(Object verrattava) {
		if ((verrattava instanceof Henkilo) && // vertailtava on Henkilo-olio
				etunimi.equals(((Henkilo) verrattava).getEtunimi()) && // vertailtavan etunimi on sama
				sukunimi.equals(((Henkilo) verrattava).getSukunimi()) && // vertailtavan sukunimi on sama
				sotu.equals(((Henkilo) verrattava).getSotu()))
			return true;
		else
			return false;
	}

	// palauttaa samansisaltoisen hajautuskoodin samansisaltoisille henkiloille
	@Override
	public int hashCode() {
		return etunimi.hashCode() + sukunimi.hashCode();
	}

}