package Viikko3;

import java.util.Date;

//Käytä kahta Date-luokan metodia before() ja after() päivämäärien vertaamiseen edellisen tehtävän tapaan.
//Lisää toiseen aikaan kaksi minuuttia ennen vertailun aloittamista.

public class H3_10_PvmVertailu_Koti {
 public static void main(String args[]) {
    // Date pvm1 = java.util.Calendar.getInstance().getTime();
     int lisa_minuutit = 2;
     Date pvm1 = new Date();
     long pvm1_msecs = pvm1.getTime();	//getTimeInMillis();
     long pvm2_msecs = pvm1_msecs + lisa_minuutit * 60 *1000;
     Date pvm2 = new Date(pvm2_msecs);
     
     if (pvm2.after(pvm1))
     System.out.println("Jälkimmäinen päivämäätä on suurempi kuin aikaisempi päivämäärä.\n" + pvm1 + " < " + pvm2);
     }
}