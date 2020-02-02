package KesaHarkat;
/*
Luodaan luokka FirmanKoneet, joka hallinnoi yrityksen kaikkia
tietokoneita (Tietokoneet[] -taulukko).
Sillä voi tulostaa koneiden tiedot sekä laskea niiden yhteishinnan
koneiden hankintavaiheessa.
*/

public class FirmanKoneet {
	
	public int index;
	private Tietokone Tietokoneet[];

	public FirmanKoneet(int koko) {
		Tietokoneet = new Tietokone[koko];
		index = 0;
	}

	public void lisaaKone(Tietokone kone) {
		Tietokoneet[index] = kone;
		index = index +1;
	}

	public double yhteisHinta() {
		double summa = 0;
		// for (Tietokone i: Tietokoneet)
		for (int i=0; i < Tietokoneet.length; i++)
			summa = summa + Tietokoneet[i].hankintahinta;
		return summa;
	}
	
	public String toString() {
		String tulos = "";
		for (int i=0; i<Tietokoneet.length; i++)
			tulos += Tietokoneet[i].toString()+"\n";
		return tulos;
	}
}
