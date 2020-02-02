package KesaHarkat;
/*
K17: Luodaan luokka FirmanKoneet, joka hallinnoi yrityksen kaikkia
tietokoneita ja luokka Tietokone.
Firmankoneet-tyyppisestä objektista koneet voi tulostaa koneiden tiedot sekä laskea niiden yhteishinnan
koneiden hankintavaiheessa.
*/

public class K17_TietokoneTesti {

	public static void main(String[] args) {
		Tietokone elite = new Tietokone("HP Elitebook", 5, 1650);
		Tietokone mac = new Tietokone("Apple MacBook", 2, 1990);
		Tietokone think = new Tietokone("Lenovo ThinkPad", 3, 1390);
		Tietokone fujitsu = new Tietokone("Fujitsu Siemens", 1, 950);
		Tietokone ideapad = new Tietokone("Lenovo IdeaPad", 2, 550);

		FirmanKoneet koneet = new FirmanKoneet(5);
		koneet.lisaaKone(elite);
		koneet.lisaaKone(mac);
		koneet.lisaaKone(think);
		koneet.lisaaKone(fujitsu);
		koneet.lisaaKone(ideapad);
		System.out.println(koneet);
		System.out.println("hankintahinta yhteensä: " + koneet.yhteisHinta() + " euroa");
	}
}
