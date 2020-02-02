package KesaHarkat;
import java.util.ArrayList;

public class Mittaussarja{
	 public ArrayList<Mittaustulos> mittaukset = null;
	 
	 public Mittaussarja() {
		 this.mittaukset = new ArrayList <Mittaustulos>();
	 }
	 
	 public void setMittaustulos(String paivamaara, String kellonaika, double lampotila, double sademaara) {
		 Mittaustulos mittaustulos = new Mittaustulos(paivamaara, kellonaika, lampotila, sademaara);
		 mittaukset.add(mittaustulos);
	 }
	 
	 public ArrayList<Mittaustulos> getMittaukset() {
		 return mittaukset;
	 }

	@Override
	public String toString() {
		String mittauksia = "";
		for (int i=0; i<mittaukset.size();i++)
			mittauksia += mittaukset.get(i).toString() + "\n";
		return mittauksia;
	}
}
