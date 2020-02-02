package KesaHarkat;
// Harjoitus K-16 Englanti-Suomi

public class K16_EnglantiSuomiSanakirja {

	public static void main(String args[]) {

		WordBook words = new WordBook();
		words.put("object", "olio");
		
		
		words.put("computer", "tietokone");
		words.put("program", "ohjelma");
		words.put("programming", "ohjelmointi");
		words.put("system", "järjestelmä");
		words.put("compiler", "kääntäjä"); // käntäjä => kääntäjä
		words.put("linker", "linkittäjä");
		words.put("interpreter", "tulkki");
		words.put("byte-code", "tavukoodi");
		words.put("execute", "suorittaa");
		words.put("execute", "ajaa");

		System.out.println("object: " + words.get("object"));
		System.out.println("execute: " + words.get("execute"));

		for (int i = 0; i < 80; i++)
			System.out.print("*");
		System.out.println();


		words.printAll();
	}
}
