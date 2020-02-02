package Viikko3;

//Vaihda omaksi paketiksesi (kommentoi piiloon, jos kÃ¤Ã¤nnÃ¤t suoraan javac:n avulla)

import java.util.Scanner;

public class Harjoitus4_Radio {

	public static void main(String[] args) {
		Radiot radiot = new Radiot();
		Radio mankka = null;
		Scanner skanneri = new Scanner(System.in);
		String valinta = "";
		while (true) { // Ohjelman pÃ¤Ã¤silmukka, tÃ¤hÃ¤n palataan aina.
			System.out.println("Sinulla on seuraavat radiot:");
			radiot.tulosta();
			System.out.print(
					"\nLisÃ¤Ã¤ uusi radio painamalla L tai kirjoita indeksinumero mennÃ¤ksesi asetuksiin.\nOhjelma pÃ¤Ã¤ttyy antamalla jokin muu syÃ¶te: ");
			valinta = skanneri.nextLine();
			if (valinta.contains("L") || valinta.contains("l")) { // TÃ¤ssÃ¤ tapauksessa kÃ¤yttÃ¤jÃ¤ haluaa lisÃ¤tÃ¤
																	// radion.
				System.out.print("SyÃ¶tÃ¤ radiollesi nimi: ");
				String nimi = skanneri.nextLine();
				radiot.lisaa(new Radio(nimi));
				continue;
			} else if (!(valinta.contains("1") || valinta.contains("2") || valinta.contains("3") // Tutkitaan ensin,
																									// sisÃ¤ltÃ¤Ã¤kÃ¶
																									// syÃ¶te
																									// kokonaislukua
					|| valinta.contains("4") || valinta.contains("5") || valinta.contains("6") || valinta.contains("7")
					|| valinta.contains("8") || valinta.contains("9"))) {
				System.out.println("\nOhjelma lopetettu."); // TÃ¤ssÃ¤ tapauksessa ei sisÃ¤llÃ¤, ohjelma loppuu breakin
															// kautta (jotta skannerit tulevat suljetuiksi)
				break;
			} else {
				int parsittu = Integer.parseInt(valinta);
				// Nyt siis on varmuudella* int. VielÃ¤ pitÃ¤Ã¤ selvittÃ¤Ã¤,
				// onko kyseinen int olemassa oleva radio vai ei
				// *ei tÃ¤ydellisellÃ¤ varmuudella. SyÃ¶tteeksi voi laittaa esim "1 +
				// tÃ¤mÃ¤OnTekstiÃ¤", jolloin menee tarkastuksesta lÃ¤pi, mutta ei voi parsia.
				if (parsittu >= 0 && parsittu < radiot.maara() + 1)
					mankka = radiot.valitse(parsittu - 1); 
				// Valitse -metodi palauttaa radiolistasta tietyn radion
				// kÃ¤yttÃ¤jÃ¤n sÃ¤Ã¤dettÃ¤vÃ¤ksi
				else {
					System.out.println("\nOhjelma lopetettu."); // TÃ¤ssÃ¤ tapaus, jossa syÃ¶tetty validi int, mutta se
																// ei vastaa mitÃ¤Ã¤n radiota.
					break;
				}

			}

			while (true) { 
				// TÃ¤ssÃ¤ osuudessa sÃ¤Ã¤detÃ¤Ã¤n ykisttÃ¤istÃ¤ radiota, siis Radio-oliota.
				// Unohdetaan Radiot-arraylist siksi aikaa.
				System.out.println("\nValittu radio:  >> " + mankka
						+ " <<.  Valitse toiminto: \n1. Aseta tila, 2. SÃ¤Ã¤dÃ¤ voimakkuutta, 3. Aseta taajuus\n"
						+ "4. Tulosta Ã¤Ã¤nenvoimakkuus, 5. Tulosta taajuus, 6. Onko pÃ¤Ã¤llÃ¤? \nPalaa negatiivisella luvulla");
				int valinta2 = Integer.parseInt(skanneri.nextLine());

				switch (valinta2) {
				case 1: {
					System.out.print("Kirjoita 1 (pÃ¤Ã¤llÃ¤) tai 0 (pois): ");
					int tila = Integer.parseInt(skanneri.nextLine());
					System.out.println(tila);
					mankka.asetaRadionTila(tila);
					break;
				}
				case 2: {
					System.out.print("Kirjoita Ã¤Ã¤nenvoimakkuus (0-9): ");
					int tila = Integer.parseInt(skanneri.nextLine());
					mankka.asetaAanenVoimakkuus(tila);
					break;
				}
				case 3: {
					System.out.print("Kirjoita taajuus (2000 - 26 000): ");
					double tila = Double.parseDouble(skanneri.nextLine());
					mankka.asetaTaajuus(tila);
					break;
				}
				case 4:
					mankka.mikaVoimakkuus();
					break;
				case 5:
					mankka.mikaTaajuus();
					break;
				case 6:
					mankka.onkoPaalla();
					break;
				default: {
					System.out.println("Et tehnyt mitÃ¤Ã¤n.\n");
					break;
				}
				}
				if (valinta2 < 0)
					break;
			}

		}
		skanneri.close();

	}

}
