package Viikko5;

interface Pallo {
	 
    public void liiku(int m); // välineen liikkumismatka metreissä
    public void nollaa();     // nollataan kuljettu matka
}
 
abstract class Urheiluvaline {
    private String laji;      // lajin nimi
    //private int matka;
    Urheiluvaline(){
    	
    }
    
    Urheiluvaline(String laji){
    	this.laji = laji;
    }
    
    public void setLaji(String l) {
        laji = l;
    }

    public String getLaji() {
        return laji;
    }
 
    public String toString() {
        return laji;
    }
}
 
class Jalkapallo extends Urheiluvaline implements Pallo{

	private int matka = 0;
	
	public Jalkapallo() {
	}
	
	public Jalkapallo(String laji, int matka){
	super(laji);      // lajin nimi
	this.matka = matka;
	}
	 
	// välineen liikkumismatka metreissä
	public void liiku(int m) {
		this.matka = m;
    	System.out.println(super.getLaji() + " liikkuu ... " + m + " metriä.");
    } 
    
    // nollataan kuljettu matka
    public void nollaa(){
    	this.matka = 0;
    	System.out.println(super.getLaji() + " ei liiku.");
    } 
    
    public String toString() {
        return super.getLaji();
    }
}

class Pesapallo extends Urheiluvaline implements Pallo{ 
	
	//private String laji = "Pesäpallo";      // lajin nimi
	//super(laji);
	private int matka = 0;
	public Pesapallo() {
	}
	public Pesapallo(String laji, int matka){
		super(laji);      // lajin nimi
		this.matka = matka;
		}
	 
	// välineen liikkumismatka metreissä
	public void liiku(int m) {
		this.matka = m;
   	System.out.println(super.getLaji() + " liikkuu ... " + m + " metriä.");
   }; 
   
   // nollataan kuljettu matka
   public void nollaa(){
	this.matka = 0;
   	System.out.println(super.getLaji() + " ei liiku.");
   }; 
}
