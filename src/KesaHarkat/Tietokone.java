package KesaHarkat;

public class Tietokone {

	public double hankintahinta;
	public int ika;
	public String nimi;
	

	Tietokone(String nimi, int ika, double hankintahinta) {
		this.nimi = nimi;
		this.ika = ika;
		this.hankintahinta = hankintahinta;
	}
	
	public String toString() {
		return nimi + " maksoi "+ hankintahinta+ " euroa, jonka ikä on " +ika+ " vuotta.";
	}
}
