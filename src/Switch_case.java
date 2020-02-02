// tulostaa annetun alkuluvun ja syöttäjän antaman luvun.

import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {
		
		int luku = 3;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ohjelmnan antama alkuluku haetaan luku-muuttujasta.\n\n");
		
		if (luku == 1) {
			System.out.println("Alkuluku on yksi.");
			}
		else if (luku == 2) {
			System.out.println("Alkuluku on kolme.");
			} 
		else if (luku == 3)
				System.out.println("Alkuluku on kolme.");
		else {
			System.out.println("Alkuluku on muu luku kuin 1,2 tai 3."
					+ "");
		}
		
		System.out.print("\nKäyttäjänä anna joku kokoniasluku:");
		luku = sc.nextInt();
		switch (luku) {
		case 1:
			System.out.println("Antamasi luku on yksi.");
			break;
		case 2:
			System.out.println("Antamasi Luku on kaksi.");
			break;
		
		case 3:
			System.out.println("Antamasi luku on kolme.");
			break;
		default:
			System.out.println("Syöttämäsi luku on joku muu luku kuin 1,2 tai 3. Eikö totta!");
			sc.close();
			break;
		}

	}

}

