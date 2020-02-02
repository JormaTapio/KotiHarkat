package Viikko4;

/*
 Kannettavassa radiossa on vain kolme säädintä: päälle/pois-kytkin,
 äänen voimakkuuden säädin (arvot 0, 1, 2,..., 9) ja kuunneltavan
 kanavan taajuusvalinta (2000.0 - 26000.0).
  
Laadi luokka kannettavan radion toteutukseksi. Radion ominaisuudet 
tulee pitää käyttäjältä piilossa, niihin pääsee käsiksi vain metodien välityksellä.

Toteuta laite luokkana Radio, jolla on konstruktorin lisäksi ainakin seuraavat metodit:

- asetaRadionTila (asettaa radion päälle tai pois päältä)
- asetaÄänenVoimakkuus (asettaa radion äänen voimakkuuden, jos säätö on mahdollista)
- asetaTaajuus (asettaa radion taajuuden, jos säätö on mahdollista)
- mikäVoimakkuus (palauttaa radion äänen voimakkuuden)
- mikäTaajuus (palauttaa radion käyttämän taajuuden)
- onkoPäällä (palauttaa tiedon siitä on radio päällä vai ei)

Toteuta myös pääohjelma ja testaa sen avulla edellä tekemääsi luokkaa.
- muista testata radion ominaisuuksia raja-arvojen sisällä että ulkopuolella
  olevilla arvoilla (voimakkuus=1000, tai esim. taajuus=10)
- arvoja ei tarvitse kysyä käyttäjältä vaan voit asettaa niitä suoraan koodista,
  esim. radio.asetaVoimakkuus(2)
- jätä nämä testit näkyviin ohjelmointikoodiin
*/

public class H4_4_RadioTesti {

	public static void main(String[] args) {
		
		boolean paalla = true;
		boolean sammunut = false;
		
		Radio soundBlaster = new Radio();
		Radio blaubunkt = new Radio(paalla, 92, 7);
		
		soundBlaster.asetaRadionTila(paalla);
		soundBlaster.asetaAanenVoimakkuus(5);
		soundBlaster.asetaTaajuus(95
				);
		
//		soundBlaster.toString();
//		blaubunkt.toString();
		
		System.out.println("Soundblasteri:");
		soundBlaster.tulosta();
		
		System.out.println("Blaubunkt:");
		blaubunkt.tulosta();
		
		
		System.out.println("Testi1 eli SoundBlasterin " + "liian suuret arvot.");
		soundBlaster.asetaRadionTila(sammunut);
		soundBlaster.asetaAanenVoimakkuus(105);
		soundBlaster.asetaTaajuus(2100);
		System.out.println("Soundblasteri:");
		soundBlaster.tulosta();
		

		System.out.println("Testi2 eli SoundBlasterin " + "sopivat arvot.");
		soundBlaster.asetaRadionTila(paalla);
		soundBlaster.asetaAanenVoimakkuus(7);
		soundBlaster.asetaTaajuus(2200);
		System.out.println("Soundblasteri:");
		soundBlaster.tulosta();
		
		
		
		
		
		
		
		


	}

}
