
import java.util.Scanner;

public class Harjoitus2_3 {
public static void main(String [] args) {
	
	int luku1, luku2;
	Scanner sc = new Scanner(System.in);
	int summa, tulo, erotus;
	System.out.println("Anna kaksi kokonaislukua, joille lasken summan, tulon ja erotuksen");
	
	System.out.println("Anna ensimmäinen kokonaisluku: ");
	luku1 = sc.nextInt();
		
	System.out.println("Anna toinen kokonaisluku: ");
	luku2 = sc.nextInt();
	sc.close();
	
	summa = luku1+ luku2;
	tulo = luku1 * luku2;
	erotus = luku1 - luku2;
	
	System.out.println();
	System.out.println("Antamasiluvut olivat " + luku1 + " ja " + luku2);
	System.out.println("Lukujen summa on " + summa);
	System.out.println("Lukujen tulo on " + tulo);
	System.out.println("Lukujen erotus on " + erotus);
		
	}
}
