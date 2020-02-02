package KesaHarkat;

import java.util.Scanner;

//Minun ratkaisuni K7-a: Tietovisailun kysymysten ja vastausten tulostamiseen

public class K7_TietovisaTesti {

	public static void main(String[] args) {
// Minun ratkaisuni K7-a: Tietovisailun kysymysten ja vastausten tulostamiseen
		TietovisaTaulu kysyjavastaa = new TietovisaTaulu();
		kysyjavastaa.tulostaKysymykset();

// Minun K7-b ratkuisuni tehdä luokka hallinnoimaan kysymykisä, vastausvaihtoehtoja ja oikeita vastauksia.
		System.out.println(
				"----------------------- b-kohta --------------------------------------------------------------------");
		Visa kysy = new Visa();
		System.out.println(
				"----------------------------------------------------------------------------------------------------");
		Visa kysy1 = new Visa(1);

		System.out.println("\n" + "Kysymykseen oikea vastaus on numero " + kysy1.oikeaVastaus + ".");

		System.out.println(
				"----------------------- c-kohta --------------------------------------------------------------------");
// Ratkaisuni K7-c lisäharjoitukseen, jonka tehtävänä on vastata kysymyksiin ja tarkastaa vastausten oikeellisuus,
// vastausten tallennus sekä tulostaa vastattujen kysymysten lukumäärä.

		String vastaus;
		int oikea = 0;
		int vaara = 0;
		int vastausMaara = 0;

// Kysy kysymykset ja laske moniko meni oikein...
		
		System.out.println("Vastaa Java-aiheisiin kysymyksiin.\n");
		Visa koe = new Visa();

		try {
			for (int i = 0; i < 5; i++) {
				koe = new Visa(i);
				System.out.println(koe.kysymys);// koe.annaKysymys(i);

				for (int j = 0; j < 3; j++) {

					System.out.println(koe.vaihtoehdot[j]);
				}
				System.out.println("Valitse ja kirjoita mielestäsi oikean vastauksen numero:");
				vastaus = koe.lueVastaus(i);
				if (Integer.parseInt(vastaus) == (koe.oikeaVastaus))
					oikea += 1;
				else
					vaara += 1;
				vastausMaara += 1;
			}
		} catch (Exception e) {
			System.out.println("Sorry.Ei mennyt ihan putkeen...");
		}
		System.out.println("\nVastasit " + vastausMaara + " kysymykseen ja sait " + oikea + " oikeaa ja " + vaara
				+ " väärää vastausta.");
	}
}
