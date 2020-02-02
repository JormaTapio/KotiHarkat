package Viikko4;

public class Auto {
	    // Yleensä javassa omianaisuudet on yksityisiä
	    // public String nimi; // yleensä ei tehdä näin...
	    
	    private String nimi;
	    private String malli;   //
	    
	    public Auto() {
	        
	    }
	    
	    public Auto(String nimi, String malli) {
	        this.nimi = nimi;
	        this.malli = malli;
	    }
	    
	    // Pitäät ehdä asetus/palautemethodit
	    public void asetaNimi(String nimi) {
	        // this viitta luokan sisäisiin ominaisuuksiin/methodeihin
	        this.nimi = nimi;
	    }
	    
	    public void asetaMalli(String malli) {
	        this.malli = malli;
	    }
	    
	    public String palautaNimi() {
	        return nimi;
	    }
	    
	    public String palautaMalli() {
	        return malli;
	    }
	    
	    // Miten tulostat kaikki auton tiedot yhdellä tulosta-methodilla
//	    public void tulosta() {
//	        //System.out.println("Auton nimi on " + palautaNimi() + " ja sen malli on taas " + palautaMalli() + ".");
//	        System.out.println("Auton nimi on " + nimi + " ja sen malli on taas " + malli + ".");
//	    }
	    
	     public String toString() {
	        //System.out.println("Auton nimi on " + palautaNimi() + " ja sen malli on taas " + palautaMalli() + ".");
	        return("Auton nimi on nyt "
	        		+ "" + nimi + " ja sen malli on taas " + malli + ".");
	    }
	}
	
