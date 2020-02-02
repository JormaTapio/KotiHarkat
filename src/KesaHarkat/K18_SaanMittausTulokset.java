/*	K-18 Harjoitus: Sään mittaustulokset
Huomaa, että tässä tehtävässä käytettävä tietorakenne on vapaavalintainen, joten se pitää suunnitella itse.
Muista myös perustella ohjelman kommenteissa tehtävässä käyttämäsi tietorakenne.

Tee tietorakenne, jonne tallennetaan tietoja lämpötilamittauksista.

Määrittele ensin luokka Mittaustulos, joka sisältää tiedot yhdestä mittaustapahtumasta.
Luokkaan tallennettavat tiedot ovat:

* Päivämäärä
* Kellonaika
* Lämpötila
* Sademäärä

mitattu lämpötilan arvo celsius asteina sekä sademäärä millimetreissä.

Määrittele luokka MittausSarja, joka sisältää lämpömittaustapahtumien sarjan.

MittausSarja -luokka palauttaa lämpötilat seuraavissa järjestyksissä:

1. Lämpötilan mukaan järjestettynä
2. Sademäärän mukaan järjestettynä
3. Päivämäärän ja kellonajan mukaan järjestettynä,

Tätä varten luokkaan on tehtävä metodit, joilla järjestys saadaan pyydettäessä.

Pääohjelma:
*/

package KesaHarkat;
import java.util.ArrayList;
 
public class K18_SaanMittausTulokset {
	    public static void main(String args[]) {
	        Mittaussarja sarja = new Mittaussarja();
	        sarja.setMittaustulos("8.4.2019", "00:00", 0.9, 0.0);
	        sarja.setMittaustulos("8.4.2019", "02:00", 0.8, 0.2);
	        sarja.setMittaustulos("8.4.2019", "04:00", 0.7, 0.0);
	        sarja.setMittaustulos("8.4.2019", "06:00", 0.6, 0.0);
	        sarja.setMittaustulos("8.4.2019", "08:00", 0.7, 0.0);
	        sarja.setMittaustulos("8.4.2019", "10:00", 1.1, 0.0);
	        sarja.setMittaustulos("8.4.2019", "12:00", 1.9, 0.0);
	        sarja.setMittaustulos("8.4.2019", "14:00", 2.5, 0.0);
	        sarja.setMittaustulos("8.4.2019", "16:00", 2.8, 0.0);
	        sarja.setMittaustulos("8.4.2019", "18:00", 2.4, 0.2);
	        sarja.setMittaustulos("8.4.2019", "20:00", 2.5, 1.0);
	        sarja.setMittaustulos("8.4.2019", "22:00", 2.7, 0.2);
	        sarja.setMittaustulos("9.4.2019", "00:00", 2.7, 0.0);
	        sarja.setMittaustulos("9.4.2019", "02:00", 2.4, 0.0);
	        sarja.setMittaustulos("9.4.2019", "04:00", 2.2, 0.0);
	        sarja.setMittaustulos("9.4.2019", "06:00", 1.9, 0.0);
	        sarja.setMittaustulos("9.4.2019", "08:00", 1.7, 0.2);
	        sarja.setMittaustulos("9.4.2019", "10:00", 1.8, 0.0);
	        sarja.setMittaustulos("9.4.2019", "12:00", 2.2, 0.4);

	        System.out.println("***Sorttaus lämpötilan mukaan**");        
	        java.util.Collections.sort(sarja.getMittaukset(), new LampotilaComparator());
	        System.out.println(sarja);
	        System.out.println("***Sorttaus sademäärän mukaan**");
	        java.util.Collections.sort(sarja.getMittaukset(), new SademaaraComparator());
	        System.out.println(sarja);
	        System.out.println("***Sorttaus aikaleiman mukaan**");
	        java.util.Collections.sort(sarja.getMittaukset(), new PvmComparator());
	        System.out.println(sarja);
	    }
}
