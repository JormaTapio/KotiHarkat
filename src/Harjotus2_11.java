// Ohjelma katsoo käyttäjän syötteestä onko luku parillinen ,pariton tai nolla.
// Ohjelma lopetetaan antamlla jokin muu syöte kuin numero.

import java.util.Scanner;

public class Harjotus2_11 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int luku, index = 0, jako = 1;
		
	try {
		System.out.println("Muistathan, että voit lopettaa ohjelman antamalla muun kuin numeron.");
		System.out.print("Anna joku kokonaisluku, niin kerron onko se parillinen, pariton tai nolla.\n");
		
		while	(sc.hasNextInt() == true) {
		
			if (index%jako == 0)
			{
				System.out.println("Muistathan, että voit lopettaa ohjelman antamalla muun kuin numeron.");
				System.out.print("Anna joku kokonaisluku, niin kerron onko se parillinen, pariton tai nolla.\n");
			}	
			luku = sc.nextInt();
	
			if (luku == 0)
				System.out.println("Antamasi luku on 0:");
			else if (luku%2 == 0)
				System.out.println("Antamasi luku: "+ luku+ " on parillinen.");
			else
				System.out.println("Antamasi luku " + luku +" on pariton");
	
			System.out.print("\nAnna seuraava numnero: ");
			index++;
			if (index < 15)
				jako = 4;
			else
				jako = 10;
		}

		
		System.out.println("Ohjelma loppu nyt. Moikka!");
		sc.close();
		}
		
		catch (Exception e) {
			System.out.println("Virhe: Homma ei mennyt puikkoihin. Sorry about that!");
		}
	}
}
