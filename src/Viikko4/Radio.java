package Viikko4;

public class Radio {
	
	boolean paalla = false;
	int voimakkuus = 0;
	int taajuus = 0;
	
	
	public Radio() {
	}
	
	public Radio(boolean onkoPaalla, int aaniVoima, int radioTaajuus) {
	this.paalla = onkoPaalla;
	this.voimakkuus = aaniVoima;
	this.taajuus = radioTaajuus;
	}
	
	public void asetaRadionTila(boolean paalla) {
		this.paalla = paalla;
	}
	
	public void asetaAanenVoimakkuus(int aaniVoima) {
		if (0<=aaniVoima && aaniVoima<10)
			this.voimakkuus = aaniVoima;

		else System.out.println("Aanenvoimakkuuden pitää olla välillä "
				+ "0-9.");
	}
	
	public void asetaTaajuus(int radioTaajuus) {
		if (2000 <= radioTaajuus && radioTaajuus <= 26000)
			this.taajuus = radioTaajuus;
		else System.out.println("Taajuuden täytyy olla 2000-2600 (MHz).");
	}
	
	public int mikaVoimakkuus() {
		return voimakkuus;
	}
	
	public int mikaTaajuus() {
		return taajuus;
	}
	
	public boolean onkoPaalla() {
		return paalla;
	}
	
//	public String toString() {
//		System.out.println("Tulostui");
//		return ("Radion tila on" + this.onkoPaalla() + ", sen taajuus on "
//				+ this.mikaTaajuus() + " MHz ja  äänenvoimakkuus on taas puolestaan (0-9): "
//				+ this.mikaVoimakkuus());
//
//		}
	
	public void tulosta() {
		System.out.println("Radion tila on " + this.onkoPaalla() + ", sen taajuus on "
				+ this.mikaTaajuus() + " MHz ja  äänenvoimakkuus on taas puolestaan (0-9): "
				+ this.mikaVoimakkuus() +"\n");
		}
	}
