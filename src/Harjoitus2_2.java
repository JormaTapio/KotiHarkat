

import java.util.Scanner;

public class Harjoitus2_2 {
	public static void main(String[] args){
	
		int luku1, luku2, luku3;
		int maxluku;
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Anna 1.luku:");
		luku1 = sc.nextInt();
		
		System.out.println("Anna 2.luku:");
		luku2 = sc.nextInt();
		
		System.out.println("Anna 3.luku:");
		luku3 = sc.nextInt();
		
		if (luku1 > luku2)
			maxluku = luku1;
		else if (luku3 > luku2)
			maxluku = luku3;
		else
			maxluku = luku2;
		
		System.out.println("Kolmesta antamastasi luvusta: " + luku1 + ", " + luku2 + " ja " + luku3 + " suurin on " + maxluku);
		sc.close();
	}

}