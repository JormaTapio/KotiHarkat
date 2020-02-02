package KesaHarkat;

import java.util.Scanner;

//public class Visa extends TietoVisaTaulu {
public class Visa {
	static final String kysymykset[][] = {
			{ "Javan yritysversio?", "..... 1)Java SE", "..... 2)Java EE", "", "..... Oikea vastaus 2...Java EE", "2" },
			{ "Uusin Java versio?", "..... 1)Java SE 8", "..... 2)Java SE 12", "", "..... Oikea vastaus 2...Java SE 12",
					"2" },
			{ "Kuuluisa IDE?", "..... 1)Eclipse", "..... 2)Sun", "", "..... Oikea vastaus 1...Sun", "2" },
			{ "Javan kehitti alunperin yritys?", "..... 1)Moon", "..... 2)Sun", "..... 3)Star",
					"..... Oikea vastaus 1...Moon", "1" },
			{ "Javasta vastaa nykyisin?", "..... 1)IBM", "..... 2)Oracle", "", "..... Oikea vastaus 2...Oracle",
					"2" } };

	String kysymys;
	String[] vaihtoehdot = new String[5];
	int oikeaVastaus;
	String [] vastausTaulu = new String[5];

	public Visa() {
	}

	public Visa(int numero) {
		int index = numero;
		this.kysymys = annaKysymys(index);
		this.vaihtoehdot = annaVaihtoehdot(index);
		this.oikeaVastaus = Integer.parseInt(kysymykset[index][5]);
	}

	public String annaKysymys(int index) {
		return kysymykset[index][0];
	}

	public String[] annaVaihtoehdot(int index) {
		for (int i = 0; i < 3; i++) {
			vaihtoehdot[i] = kysymykset[index][i+1];
		}
		return vaihtoehdot;
	}

	public String annaVastaus(int index) {
		return vastausTaulu[index];

	}

	public String lueVastaus(int index) {
		Scanner lueSyote = new Scanner(System.in);
		vastausTaulu[index] = lueSyote.nextLine();

		return vastausTaulu[index];
	}

	public static void tulostaKysymykset() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println(kysymykset[i][j]);
			}
			System.out.println(kysymykset[i][4]);
			System.out.println();
		}
	}

	Scanner lue = new Scanner(System.in);
}
