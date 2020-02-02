package KesaHarkat;

public class Yhteystieto {
	private String etunimi;
	private String sukunimi;
	private String puhelin;
	private int ika;
//private Yhteistieto[] yhteystiedot = null;

	public Yhteystieto() {
	}

	public Yhteystieto(String etunimi, String sukunimi, String puhelin, int ika) {
		this.etunimi = etunimi;
		this.sukunimi = sukunimi;
		this.puhelin = puhelin;
		this.ika = ika;
//this.yhteystiedot = new Static Final int[koko];
	}

	public String getEtunimi() {
		return etunimi;
	}

	public int getIka() {
		return ika;
	}

//	public String toString() {				// Tehtävät a) ja b)
//		return sukunimi + " " + etunimi + "    " + ika;
//	}

//  b) Järjestä yhteistiedot myös nimen mukaan nousevaan järjestykseen:

	public String getSukunimi() {
		return sukunimi;

	}

//c) Lisätehtävä: Järjestä yhteystiedot puhelinnumeron numero-osan mukaan nousevaan järjestykseen.

	public String getPuhelin() {
		return puhelin;
	}
	
	public void setSuuntanumero(String suuntanumero) {
		puhelin = suuntanumero + puhelin.substring(3);
	}

public String toString(){					// Tehtävä c)
return sukunimi +" "+ etunimi +"    "+ ika + "    " + puhelin;
// return toString() + puhelin;
}

}