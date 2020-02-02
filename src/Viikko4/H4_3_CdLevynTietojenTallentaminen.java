package Viikko4;

public class H4_3_CdLevynTietojenTallentaminen {

	public static void main(String[] args) {
		
		CD cd1 = new CD("Iron Maiden"); //), "Powerslave", 3048, 8);
	    CD cd2 = new CD("Tom Petty");
	    cd2.biiseja = 12;
	    cd2.nimi = "Full Moon Fever";
	    cd2.pituus = 2398;
	    CD cd3 = new CD("Paula Koivuniemi", "Luotan Sydämen Ääneen", 2850, 12);
	    
	    CD[] CdTaulu = new CD[3];
	    
	    CdTaulu[0] = cd1;
	    CdTaulu[1] = cd2;
	    CdTaulu[2] = cd3;
	    
	    for (CD levy: CdTaulu)
	    	System.out.println("Levy on " + levy);
	    
	    System.out.println("\n"
	    		+ "Loppu.");
	}

}
