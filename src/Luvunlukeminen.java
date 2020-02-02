
import java.util.Scanner;

/**
 * Tässä luokassa kysytää käyttältä kokonaislukua
 * 
 * @author Tapio Myllärinen (Ismo Harjunmaa)
 *
 */

public class Luvunlukeminen {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Anna kokonaisluku:");
		
		int luku = 0;
	
			luku = sc.nextInt();
			sc.close();
						
			switch (luku) {
			case 1:
				System.out.println("Yksi");
				return;
				
			case 2:
				System.out.println("Kaksi");
				return;
			case 3:
				System.out.println("Kolme");
				return;
						
			case 4:
				System.out.println("Neljä");
				return;
						
			case 5:
				System.out.println("Viisi");
				return;
						
			case 6:
				System.out.println("Kuusi");
				return;
						
			case 7:
				System.out.println("Seitsemän");
				return;
						
			case 8:
				System.out.println("Kahdeksan");
				return;
						
			case 9:
				System.out.println("Yhdeksän");
				return;
						
			default:
			}
			
			
	
	// Hyvä tapa on poistaa ohjelmakoodi
	//	while (sc.hasNextLine()) {
	//		System.out.println(sc.nextLine());
	//	}

	}

}
