// Ohjelma kysyy käyttäjältä luvun 1-100 ja ohjelma kertoo onko oikea luku suurempi 
// tai pienempi kuin arvattu luku.

// import java.math.*;
import java.util.Scanner;

public class Harjotus2_12 {

	public static void main(String[] args) {
	int rig_number, small_number = 1, big_number =100, ges_number = 1, index = 1;
	Scanner sc = new Scanner(System.in);
	
	try {
	rig_number = (int) Math.round( 100 * Math.random());
		
	System.out.print("Arvaa kokonaisluku väliltä 1-100:");
	ges_number = sc.nextInt();
	System.out.println("--------------------------------------------------------------");
	
	while (rig_number != ges_number) {
		
		if (rig_number < ges_number)
			{
			System.out.println("Oikea numero on pienempi kuin arvaamasi luku: " + ges_number);
			}
		else if (rig_number > ges_number) 
			{
			System.out.println("Oikea numero on suurempi kuin arvaamasi luku: " + ges_number);
			}
			
			//last_gnumber = ges_number;
		
	
		if (ges_number > rig_number)
			{
			System.out.println("Oikea luku kuuluu välille (" + small_number + "-" + ges_number + ").");
			big_number = ges_number;
			}
		else if (ges_number != rig_number)
			{
			System.out.println("Oikea luku kuuluu välille (" + ges_number + "-" + big_number + ").");
			small_number = ges_number;
			}
		System.out.print("Anna uusi arvaus:");
		ges_number = sc.nextInt();
		index++;
		System.out.println("--------------------------------------------------------------");
	}
	switch (index)
	{
	case 1:
	case 2:
	case 3:
	case 4:
		{
		System.out.println("Nice job, you are the man!");
		break;
		}
	case 5:
	case 6:
	case 7:
		{
		System.out.println("Ok, not bad!");
		break;
		}
	default:
		{
			System.out.println("You could do better than ths, I believe.");
		break;
		}
	}
	System.out.println("Oikea numero on sama kuin arvaamasi luku: " + ges_number);
	System.out.print("Arvasit oikein " + index + ". kerralla.");
	sc.close();
	}
	catch (Exception e) {
		System.out.printf("Väärä syöte. Täytyy olla kokonaisluku.");
		
	}
	}

}
