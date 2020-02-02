package Viikko3;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;


// Luo kalenteri-olio tämän hetkisestä ajasta käyttäen GregorianCalendar-luokkaa:
// Calendar kalenteri = new GregorianCalendar();
// Palauta ja tulosta oliosta seuraavat tiedot get()-metodilla:
// •Vuosi  •Kuukausi •päivä •tunnit (24 h kellolla) •minuutit ja •sekunnit  


public class H3_11_GregorianCalendar_Koti {
    public static void main(String args[]) {
        Calendar kalenteri = new GregorianCalendar();
        
        int vuosi, kuukausi, paiva, tunti, minuutti, sekuntti;
        
        Date kokeilu_aika = kalenteri.getTime();
        
       
        vuosi = kalenteri.get(Calendar.YEAR);
        kuukausi = kalenteri.get(Calendar.MONTH);
        paiva = kalenteri.get(Calendar.DAY_OF_MONTH);
        tunti = kalenteri.get(Calendar.HOUR_OF_DAY);
        minuutti = kalenteri.get(Calendar.MINUTE);
        sekuntti = kalenteri.get(Calendar.SECOND); 
        
        if (sekuntti<10)
        	System.out.println("Päivämäärä on " + paiva + "." + kuukausi + "."
        			+ vuosi + " ja aika on " + tunti + ":" + minuutti + ":0" + sekuntti);
        else
        	System.out.println("Päivämäärä on "  + paiva + "." + kuukausi + "." + vuosi +
        			" ja aika on " + tunti + ":" + minuutti + ":"  + sekuntti);
        System.out.println("\nAika on tulostettuna suoraan Gregorian -kalenteriobjektista (Calendar):\n " + kokeilu_aika);
        }
}
