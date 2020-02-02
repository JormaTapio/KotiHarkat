package KesaHarkat;

public class Puhelinnumero {
	int puhelin;
	String tyyppi; // matka, koti, tyo hyväksytään!

	public Puhelinnumero(int puhelinnumero, String tyyppi) {
		this.puhelin = puhelinnumero;
		if (tyyppi == "Matka" || tyyppi == "Koti" || (tyyppi == "Työ"))
			this.tyyppi = tyyppi;
		else
			System.out.println("Väärä puhelinyhteystyyppi. Puhelintyypin pitää olla joko Koti, Työ tai Matka.");
	}
}