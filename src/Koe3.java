

//Tähän tulee oma Java ohjelma
//Joka käännetään
//javac Koe3.java
//java KOe3
//käännetty tiedosto .class -loppuisena

public class Koe3 {
	// Pääohjelma josta suorittaminen voi alkaa public static void main(...
	
	public static void main(String[] args){
	System.out.println("Tulosta lvut 1-10.\n");
	
	
	for (int i=1; i<=10; i++)
		System.out.println("Luku " + i);
	
	System.out.printf("%nSeuraavassa tulostus 10:stä 1:teen.%n%n");
	for (int i=10; i>=1; i--)
		System.out.println("Luku " + i);
	}
}