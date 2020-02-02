package KesaHarkat;

public class Mittaustulos {

	private String paivamaara;
	private String kellonaika;
	private double lampotila;
	private double sademaara;

	public Mittaustulos() {
	}

	public Mittaustulos(String paivamaara, String kellonaika, double lampotila, double sademaara) {
		this.paivamaara = paivamaara;
		this.kellonaika = kellonaika;
		this.lampotila = lampotila;			//this.setLampotila(lampotila);
		this.setSademaara(sademaara);
	}

	public double getLampotila() {
		return lampotila;
	}

	public double getSademaara() {
		return sademaara;
	}

	public void setSademaara(double sademaara) {
		this.sademaara = sademaara;
	}

	public String getKellonaika() {
		return kellonaika;
	}

	@Override
	public String toString() {
		return "" + lampotila + "   " + getSademaara() + "   " + paivamaara + "   " + kellonaika ;
	}

	public String getPaivamaara() {
		// TODO Auto-generated method stub
		return paivamaara;
	}
}
