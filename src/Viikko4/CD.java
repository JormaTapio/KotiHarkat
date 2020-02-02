package Viikko4;

public class CD{
	String artisti;
	String nimi;

	int pituus;  // kokonaispituus minuuteissa
	int biiseja; // lukumäärä
	
	public	CD() {
	}

	public CD(String artistinimi) {
	this.artisti = artistinimi;
	}

	public CD(String artistinimi, String levynimi, int pituus, int biisit ) {
	this.artisti = artistinimi;
	this.nimi = levynimi;
	this.pituus = pituus;
	this.biiseja = biisit;
	}
	
	public String toString() {
	return "Levyn artistin n imi on " + artisti + " ja levy on " + nimi
			+ " sen pituus on " + pituus + " sekä Cdellä on " + biiseja + " kappaletta.";
	}
}


