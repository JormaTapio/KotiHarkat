package KesaHarkat;

import java.util.Scanner;
//Minun ratkaisuni K7-a: Tietovisailun kysymysten ja vastausten tulostamiseen

public class TietovisaTaulu {
	static final String kysymykset[][] =
			{
			{ "Javan yritysversio?", "..... 1)Java SE", "..... 2)Java EE", "", "..... Oikea vastaus 2...Java EE", "2" },
			{ "Uusin Java versio?", "..... 1)Java SE 8", "..... 2)Java SE 12", "", "..... Oikea vastaus 2...Java SE 12",
					"2" },
			{ "Kuuluisa IDE?", "..... 1)Eclipse", "..... 2)Sun", "", "..... Oikea vastaus 1...Sun", "2" },
			{ "Javan kehitti alunperin yritys?", "..... 1)Moon", "..... 2)Sun", "..... 3)Star",
					"..... Oikea vastaus 1...Moon", "1" },
			{ "Javasta vastaa nykyisin?", "..... 1)IBM", "..... 2)Oracle", "", "..... Oikea vastaus 2...Oracle",
					"2" } 
			};

	
//	Tänne kysymykset
	public TietovisaTaulu() {
		 final String kysymykset[][] = {
					{ "Javan yritysversio?", "..... 1)Java SE", "..... 2)Java EE", "", "..... Oikea vastaus 2...Java EE", "2" },
					{ "Uusin Java versio?", "..... 1)Java SE 8", "..... 2)Java SE 12", "", "..... Oikea vastaus 2...Java SE 12",
							"2" },
					{ "Kuuluisa IDE?", "..... 1)Eclipse", "..... 2)Sun", "", "..... Oikea vastaus 1...Sun", "2" },
					{ "Javan kehitti alunperin yritys?", "..... 1)Moon", "..... 2)Sun", "..... 3)Star",
							"..... Oikea vastaus 1...Moon", "1" },
					{ "Javasta vastaa nykyisin?", "..... 1)IBM", "..... 2)Oracle", "", "..... Oikea vastaus 2...Oracle",
							"2" } };
	}
	


// tulostaa kysymykset ja oikeat vastaukset
	public static void tulostaKysymykset() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println(kysymykset[i][j]);
			}
			System.out.println(kysymykset[i][4]);
			System.out.println();
		}
	}
}
//// Minun K7-b ratkuisuni tehdä luokka hallinnoimaan kysymykisä, vastausvaihtoehtoja ja oikeita vastauksia.
