package KesaHarkat;
import java.util.Comparator;

class LampotilaComparator implements Comparator<Mittaustulos> {
    public int compare(Mittaustulos amittaus, Mittaustulos bmittaus) {
      // TODO: palauta järjestyksessä lämpötilan mukaan
    	
    	return (int) ((amittaus.getLampotila() - bmittaus.getLampotila()) * 10);
    	}
}

class SademaaraComparator implements Comparator<Mittaustulos> {
    public int compare(Mittaustulos amittaus, Mittaustulos bmittaus) {
      // TODO: palauta järjestyksessä sademäärän mukaan
    	if (-(int) ((amittaus.getSademaara() - bmittaus.getSademaara()) * 10) != 0)
    		return -(int) ((amittaus.getSademaara() - bmittaus.getSademaara()) * 10);
    	else
    		return -(int) ((amittaus.getLampotila() - bmittaus.getLampotila()) * 10);
    	}
}

class PvmComparator implements Comparator<Mittaustulos> {
    public int compare(Mittaustulos amittaus, Mittaustulos bmittaus) {
      // TODO: palauta järjestyksessä aikaleiman mukaan
    	int index;
    	String apvmmjono = amittaus.getPaivamaara();
    	index = apvmmjono.indexOf(".");
    	int apvmluku = Integer.parseInt(apvmmjono.substring(0, index));
    	String bpvmmjono = bmittaus.getPaivamaara();
    	index = bpvmmjono.indexOf(".");
    	int bpvmluku = Integer.parseInt(bpvmmjono.substring(0, index));
    	
    	String amjono = amittaus.getKellonaika();
    	index = amjono.indexOf(":");
    	int aluku = Integer.parseInt(amjono.substring(0, index));
    	String bmjono = bmittaus.getKellonaika();
    	index = bmjono.indexOf(":");
    	int bluku = Integer.parseInt(bmjono.substring(0, index));
    	
    	if ((apvmluku - bpvmluku) != 0)
    		return -(apvmluku - bpvmluku);
    	else
    		return -(aluku - bluku);
    	}
}
