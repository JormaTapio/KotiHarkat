/**
 * 
 */
/* Näyttää wile, do-while ja for-silmukan ominaisuuksia.

/**
 * @author asennus
 *
 */
public class Toistometodi {
	public static void main(String [] args) {
		int indeksi = 0;
		
		System.out.println("Näyttää wile, do-while ja for-silmukan ominaisuuksia.\n");
		
		while (indeksi < 10) {
			System.out.println("Indeksin arvo on while-silmukassa: " + indeksi);
			indeksi = indeksi + 1;
		}
		
		System.out.println("--------------------------------------------------------------");
		
		do {
			System.out.println("Indeksin arvo on do-while -silmukassa: " + indeksi);
			indeksi = indeksi + 1;
		} while (indeksi < 10);
		
		System.out.println("--------------------------------------------------------------");
		
		for (int i = 0; i <  10; i++) {
			System.out.println("Indeksin arvo on for-silmukassa: " + (++i));
		}
	}

}
