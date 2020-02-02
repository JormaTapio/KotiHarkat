package KesaHarkat;
import java.util.Comparator;


public class IkaComparator implements Comparator<Yhteystieto> {
	public int compare(Yhteystieto ayhteystieto, Yhteystieto byhteystieto) {
	// Palautaa iän mukaan kasvavassa järjestyksessä
		
		int compare = 0;
		if ((ayhteystieto.getIka() - byhteystieto.getIka()) == 0)
		{
			compare = ayhteystieto.getSukunimi().compareTo(byhteystieto.getSukunimi());
			if (compare == 0)
				compare = ayhteystieto.getEtunimi().compareTo(byhteystieto.getEtunimi());
			return compare;
		} else
			return (ayhteystieto.getIka() - byhteystieto.getIka());
	}
}
