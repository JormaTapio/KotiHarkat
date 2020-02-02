package KesaHarkat;
import java.util.ArrayList;

public class Kulmio extends Piste {
	private static final int kulmia = 3;
	private Piste[] kulmat;
	public ArrayList<Integer> KulmaIdTaulu = new ArrayList<Integer>();
	private int kulmiaID;

	public Kulmio() {
		this.kulmat = new Piste[kulmia];
	}

	public Kulmio(Piste aPiste, Piste bPiste, Piste cPiste) {
		this.kulmat = new Piste[kulmia];
		this.kulmat[0] = aPiste;
		this.kulmat[1] = bPiste;
		this.kulmat[2] = cPiste;
		this.kulmiaID = KulmaIdTaulu.size() + 1; // int index = index +1;
	}
	
	public String toString() {
		return ("Piste1: ("+super.toString(kulmat[0]) + ") Piste2: ("+super.toString(kulmat[0]) + ") Piste3: ("+super.toString(kulmat[0])+")");
	}
}
