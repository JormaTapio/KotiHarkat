package Viikko4;


	import java.util.ArrayList;


	public class Rekisteri {
	public ArrayList <Henkilo> henkilot = new ArrayList <> ();
	private int maara = 0;
	// private int henkiloNumero = -1;


	public Rekisteri() {
	    henkilot = new ArrayList<>();
	}


	int palautaHenkilomaara() {
	    this.maara = henkilot.size();
	    return maara;
	}


	public Henkilo palautaHenkilo(int henkiloNumero){
	    if (henkilot.get(henkiloNumero) != null)
	        return henkilot.get(henkiloNumero);
	    else
	    	return null;
	}


	//public void lisaaHenkilo(String etunimi, String sukunimi, String sotu ) {
	void lisaaHenkilo(Henkilo lisaHenkilo ) {
		
	    henkilot.add(lisaHenkilo);
	}
	
	public Henkilo etsiHenkilo(String sotu){
	// - merkkijonojen yhtäsuuruus voidaan testata seuraavasti: merkkijono.equals(merkkijono)
	    for (int i = 0; i < henkilot.size(); i++) {
	    	if (henkilot.get(i).palautaSotu() == sotu)
	    		return henkilot.get(i);}
	    	return null;
	}
	
	void tulosta(Henkilo henkilo) {
		//try
			System.out.println(henkilo.palautaTiedot());
//		catch (Exception e) {
//			System.out.println("Sotua ei löytynyt");	
//		}
	}
	

	public String toString(Henkilo henkilo) {
		Henkilo apuH = henkilo;
		return "Etunimi: " + apuH.etunimi + "/t ja sukunimi: " + apuH.sukunimi + 
				"/t sekä sosiaaliturvatunnus: " + apuH.sotu + " iällä " + apuH.ika;
	}
}
