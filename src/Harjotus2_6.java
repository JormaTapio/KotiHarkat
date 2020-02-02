// Annat taulukolle viisi nimeä String-alkiona eroteltuna ;-merkillä. Tulosta taulukko.

public class Harjotus2_6 {

	public static void main(String[] args) {
				
		String rivi = "Aku;Mikki;Roope;Hessu;Iines";
		String [] nimet = new String [5];
		nimet = rivi.split(";");
		
		System.out.printf("Tulostaa rivin nimet, jossa nimet on eroteltu ; -välimerkillä.%n%n");
		
		
		for (int i=0; i< nimet.length; i++) {
			System.out.println(nimet[i]);
			}
		}
	}

