package KesaHarkat;


/**
 * @author Juha PeltomÃ¤ki, 05.06.2019
 *
 * Kannattaa kirjoittaa koodia / kÃ¤Ã¤ntÃ¤Ã¤ omalla koneella
 * EnsimmÃ¤inen vaihe on kirjoittaa luokka, josta sitten 
 * voi luoda olioita. 
 * Tarvitaan toinen luokka, jossa on pÃ¤Ã¤ohjelma ja 
 * mahdollisesti muita funktioita
 */



public class AutotTesti {
	
	

		


	// ns. tavallisia funktioita voi kirjoittaa static
	
	public static void main(String[] args) {
		// Luodaan kaksi Auto-oliota muistiin
		// tulostetaan niiden sisÃ¤ltÃ¶
		Auto toyota = new Auto();
		toyota.asetaNimi("Toyota");
		toyota.asetaMalli("Corolla");
//		System.out.println(toyota.palautaNimi());
//		System.out.println(toyota.palautaMalli());
		//toyota.tulosta();
		System.out.println(toyota); // toString() luokan sisÃ¤lle
		//Auto peugeot = new Auto();
		Auto peugeot = new Auto("Peugeot", "206");
//		peugeot.asetaNimi("Peugeot");
//		peugeot.asetaMalli("206");
		System.out.println(peugeot);

	}

}

