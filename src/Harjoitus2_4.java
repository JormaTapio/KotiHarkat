
import java.util.Scanner;

public class Harjoitus2_4 {
public static void main(String [] args) {
	double luku1, luku2, luku3;
	double keskiarvo;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Anna minulle kolme reaalilukua, niin lasken lukujen keskiarvon");
	
	System.out.println("Anna 1. luku :");
	luku1 = sc.nextDouble();
	
	System.out.println("Anna 2. luku ");
	luku2 = sc.nextDouble();
	
	System.out.println("Anna 3. luku :");
	luku3 = sc.nextDouble();
	sc.close();
	
	keskiarvo = (luku1 + luku2+ luku3)/3;
	
	System.out.println("Antamiesi kolmenluvun " + luku1 + " , " + luku2 + " ja " + luku3 + " keskiarvo on " + keskiarvo);
	
}
}
