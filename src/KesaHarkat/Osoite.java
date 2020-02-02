package KesaHarkat;

public class Osoite {
	String postitoimipaikka;
	String postinumero;
	String katuosoite;
	String tyyppi;

	public Osoite(String postitoimipaikka, String postinumero, String katuosoite, String tyyppi) {
		this.postitoimipaikka = postitoimipaikka;
		this.postinumero = postinumero;
		this.katuosoite = katuosoite;
		if ((tyyppi == "Koti") || (tyyppi == "Työ"))
			this.tyyppi = tyyppi;
		else
			System.out.println("Väärä osoiteyhteystyyppi. Osoitetyypin pitää olla joko Koti tai Työ.");
	}
}
