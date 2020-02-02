// En tiedä, miksi tulee alkuun plus 2 tuntia ylimääräistä?

/*
On annettu kellonaika merkkijonona "14:45".
Muunna merkkijono Calender-olioksi ja lisää siihen kuusi tuntia ja viisi minuuttia.
Käytä muuntamisessa SimpleDateFormat-luokkaa.
*/

package Viikko3;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;


public class H3_13_AikaParsitaanMerkkijonosta_Koti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long aika_msecs, uusi_aika_msecs;
		String [] mjono_taulukko = new String [2];
		int [] numero_taulukko = new int [2];
		int [] lisa_numero_taulukko = {6,5};
		
		String aika_mjono = "14:45";
		Scanner lukija = new Scanner(aika_mjono);
		mjono_taulukko = lukija.nextLine().split(":");
		
		Date nolla_aika = new Date(0);

		nolla_aika.setYear(0);
		nolla_aika.setMonth(0);
		nolla_aika.setDate(1);
		nolla_aika.setHours(0);
		nolla_aika.setMinutes(0);
		nolla_aika.setSeconds(0);
		
		Date aika_annettu = new Date(0);
		Date laskettu_uusi_aika = new Date(0);
		
		// SimpleDateFormat aika = new SimpleDateFormat();
		
		for (int i=0;i<mjono_taulukko.length;i++) 
			numero_taulukko[i] = Integer.parseInt(mjono_taulukko[i]);
		
		aika_msecs = (numero_taulukko[0]*3600 + numero_taulukko[1]*60)*1000;
		aika_annettu.setTime(aika_msecs);
		uusi_aika_msecs = aika_msecs + (lisa_numero_taulukko[0]*3600 + lisa_numero_taulukko[1]*60)*1000;
		laskettu_uusi_aika.setTime(uusi_aika_msecs);
		
		System.out.println("Annettu merkkijono hajoitettuna kahdeksi merkkijonoluvuksi " + mjono_taulukko[0] + " ja " + mjono_taulukko[1]);
		System.out.println("Nolla aika näyttää tältä " + nolla_aika);
		System.out.println("Laskettu uusi aika " + aika_annettu + ", johon on lisätty (6h 5min) "
		 + " ja " + laskettu_uusi_aika );

	}

}
