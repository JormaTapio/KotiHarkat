package KesaHarkat;

public class Kori{
	 String malli;
	 Omena[] omenat;
	 static int KOKO = 6; // korin maksimi koko
	 
	 int index = 0;

	Kori(String malli){
	this.malli = malli;
	omenat = new Omena [KOKO];
	//this.omenat = omenat; //super(omenat);
	}

	public void lisaaOmena(Omena nimi){
	//int index;
	if (omenat[0] == null)
		index = 0;
	else
		if (index != KOKO-1)
			index += 1;
		else
			System.out.println("Korissa on tilaa vain kuudelle omenalle.");
	omenat[index] = nimi;
	}

	public String toString(){
	double summa = 0;
	int koko = omenat.length;
	String tulostus = "Korissa omenat =\n\n[";
	for (int i=0; i<koko; i++){
	summa += omenat[i].paino;
	if (i != koko-1)
	tulostus += "[" + omenat[i].nimi + ", " + omenat[i].paino + "],\n";
	else
	tulostus += "[" + omenat[i].nimi + ", " + omenat[i].paino + "]]";
	}
	tulostus += ("\n\nKori[" + malli + "] omenien yhteispaino: " + summa + "g.");
	return tulostus;
	}
}
