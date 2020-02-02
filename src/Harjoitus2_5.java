// Syöttäjän antamt 5 kokonaislukua taletetaan taulukkoon ja annetaan lopuksi käännetyssä järjestyksessä takaisin näytölle.
import java.util.Scanner;

public class Harjoitus2_5 {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		int luku;
		int [] kokonaisluvut = new int[5];
		int back_i;
		
		System.out.printf("Anna 5 kokoniasalukua, jotka annan näytölle käännetyssä järjestyksesä.%n");
		
		for (int i= 0; i < 5; i++)
		{
			System.out.println("Anna " + (i+1) + ". kokonaisluku:");
			luku = sc.nextInt();
			back_i = 4 - i;
			kokonaisluvut[back_i] = luku;
		}
		sc.close();
		
		System.out.println("Annan luvut käännetyssä järjestyksessä:");
		
		for (int i = 0; i < 5; i++) {
			System.out.println(kokonaisluvut[i]);
		}
	}
}
