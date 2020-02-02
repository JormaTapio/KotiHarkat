package KesaHarkat;

import java.util.Arrays;

class Tyontekija {
	String nimi;
	Osoite osoitteet[];
	Puhelinnumero puhelinnumerot[];

	public Tyontekija(String nimi) {
		this.nimi = nimi;
		this.osoitteet = new Osoite[3];
		this.puhelinnumerot = new Puhelinnumero[3];
	}

	// metodit
	public void lisaaOsoite(Osoite uusiosoite) {
		int index;
		if (osoitteet[0] == null)
			index = 0;
		else if (osoitteet[1] == null)
			index = 1;
		else if (osoitteet[2] == null)
			index = 2;
		else {
			index = 3;
			System.out.println("Kaikki mahdolliset 3 osoitepaikkaa on jo käytetty.");
		}
		if (index != 3)
			this.osoitteet[index] = uusiosoite;
	}

	public void lisaaPuhelinnumero(Puhelinnumero uusipuhelinnumero) {
		int index;
		if (puhelinnumerot[0] == null)
			index = 0;
		else if (puhelinnumerot[1] == null)
			index = 1;
		else if (puhelinnumerot[2] == null)
			index = 2;
		else {
			index = 3;
			System.out.println("Kaikki mahdolliset 3 puhelinumerot on jo käytetty.");
		}
		if (index != 3)
			this.puhelinnumerot[index] = uusipuhelinnumero;
	}

	public String toString(){
	String tulosta = nimi + ":\n\nOsoitteet: \n";
	for (int i=0; i<osoitteet.length; i++)
		if (osoitteet[i] != null)
			tulosta += osoitteet[i].postitoimipaikka+", "+osoitteet[i].postinumero+", "+osoitteet[i].katuosoite+", "+osoitteet[i].tyyppi + "\n";
	tulosta += "\nPuhelinnumerot: \n";
	for (int j=0; j<puhelinnumerot.length; j++)
		if (puhelinnumerot[j] != null)
			tulosta += puhelinnumerot[j].puhelin + ", " + puhelinnumerot[j].tyyppi + "\n";
	System.out.println("Tyontekija");
	return tulosta;
	}
}

