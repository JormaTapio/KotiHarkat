package Viikko4;

import java.util.ArrayList;

public class AutoRekisteri {

	    // Ominaisuus, joka tallentaa kaikki rekisterissä olevat autot
	    // ArrayList == dynaaminen taulukko/lista, jonka koko kasvaa "tarvittaessa"
	    ArrayList<Auto> autolista = null;
	    
	    public AutoRekisteri() {
	        // Varaa muistia autot-listalle
	        autolista = new ArrayList<>();
	    }
	    
	    // Lisää uuden auton rekisteriin
	    public void lisaa(Auto auto) {
	        autolista.add(auto);
	        
	    }
	    // tulostaa kaikki rekisterissä olevat autot
	    public void tulosta() {
	        for (Auto auto: autolista) {
	            System.out.println(auto);
	        }
	    }
}
