package Viikko4;

public class H4_6_NoppaTesti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Noppa noppa1 = new Noppa();
		Noppa noppa2 = new Noppa();
		int arvo1,arvo2;
		int arvottujaLukuja = 1000;
				
				;
				;
		int jakaja = arvottujaLukuja/100;
		
		int [][] nopanArvot = new int [2][arvottujaLukuja];
		int [][] noppaFrekvenssi = new int [2][6];
		
		// Noppafrekvenssien alsutus nollaksi.
		for (int i=0; i<6; i++) {
			noppaFrekvenssi[0][i] = 0;
			noppaFrekvenssi[1][i] = 0;
		}
		
		// Heitetään kahdelle nopalle arvot.
		for ( int i=0; i<arvottujaLukuja ;i++) {
			arvo1 = noppa1.heita();
			arvo2 = noppa1.heita();
			noppa1.setArvo(arvo1);
			noppa2.setArvo(arvo2);

			nopanArvot[0][i] = noppa1.arvo;
			nopanArvot[1][i] = noppa2.arvo;
		}
		
		// Laskertaan molempien noppien frekvenssit arvoille 1-6.
		for ( int i=0; i<arvottujaLukuja
				; i++) {
			switch (nopanArvot[0][i]) {
				case 0: noppaFrekvenssi[0][0] += 1;
					break;
				case 1: noppaFrekvenssi[0][1] += 1;
					break;
				case 2: noppaFrekvenssi[0][2] += 1;
					break;
				case 3: noppaFrekvenssi[0][3] += 1;
					break;
				case 4: noppaFrekvenssi[0][4] += 1;
					break;
				case 5: noppaFrekvenssi[0][5] += 1;
					break;
				default:
					System.out.println("Noppa1:llä ei ole kuin kuusi mahdollista numeroa (1-6).");
					break;
			}
				
			switch (nopanArvot[1][i]) {
				case 0: noppaFrekvenssi[1][0] += 1;
					break;
				case 1: noppaFrekvenssi[1][1] += 1;
					break;
				case 2: noppaFrekvenssi[1][2] += 1;
					break;
				case 3: noppaFrekvenssi[1][3] += 1;
					break;
				case 4: noppaFrekvenssi[1][4] += 1;
					break;
				case 5: noppaFrekvenssi[1][5] += 1;
					break;
				default:
					System.out.println("Noppa2"
							+ ":llä ei ole kuin kuusi mahdollista numeroa (1-6).");
					break;

			}
		}
		
		double
		kokonaisProsentti = 0;
		int apuFrekvenssi = 0;
		double prosenttiLuku = 0;
		
		// Näytetään visuaalisesti noppa1:sen frekvenssit arvoilla 1-6.
		System.out.println("Prosentteja noppa1:sen heitoissa.");
		System.out.println("0          10         20         30");
		System.out.println("|          |          |          |");
		
		for (int i=0; i<6; i++) {
			apuFrekvenssi = noppaFrekvenssi[0][i];
			prosenttiLuku = (double) apuFrekvenssi / jakaja;
			
			for (int j=0; j<prosenttiLuku; j++) {
				System.out.print("*");
			}
			
			System.out.println("\t\t\t" + "Noppa1" + " ja silmäluku " + (i+1)
					+ " sekä prosenttiluku "+ prosenttiLuku);
			kokonaisProsentti += prosenttiLuku;
		
			if (i==5)
				System.out.println("Kokonaisprosenttimäärä on " + kokonaisProsentti + "\n");
		}
		
		kokonaisProsentti = 0;
		apuFrekvenssi = 0;
		prosenttiLuku = 0;
		
		// Näytetään visuaalisesti noppa2:sen frekvenssit arvoilla 1-6.
		System.out.println("Prosentteja noppa2:sen heitoissa.");
		System.out.println("0          10         20         30");
		System.out.println("|          |          |          |");

		
		for (int i=0; i<6; i++) {
			apuFrekvenssi = noppaFrekvenssi[1][i];
			prosenttiLuku = (double) apuFrekvenssi / jakaja
					;
			
			for (int j=0; j<prosenttiLuku; j++) {
				System.out.print("*");
			}
						
			System.out.println("\t\t\t" + "Noppa2 ja silmäluku " + (i+1)
					+ " sekä prosenttiluku " + prosenttiLuku);
			kokonaisProsentti += prosenttiLuku;

			if (i==5)
				System.out.println("Kokonaisprosenttimäärä on " + kokonaisProsentti + "\n");
		}
	}

}
