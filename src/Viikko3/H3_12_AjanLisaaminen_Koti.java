/*	Kotona
 *  Luo Date-olio ja lisää siihen kymmenen minuuttia sekä yksi tunti (1:10).
Käytä lisäämisessä ja ajan tulostamisessa Calendar-luokkaa.

Date pvm = new Date();
Calendar kalenteri = Calendar.getInstance();
kalenteri.setTime(pvm); // pvm on oltava Date-olio*/

package Viikko3;
import java.util.Date;
import java.util.Calendar;

public class H3_12_AjanLisaaminen_Koti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date pvm = new Date();
		Calendar kalenteri = Calendar.getInstance();
		Calendar kalenteri_lisa = Calendar.getInstance();
		
		kalenteri.setTime(pvm);
		kalenteri_lisa.add(Calendar.HOUR, +1);
		kalenteri_lisa.add(Calendar.MINUTE, +10);

				
		System.out.println("Alkuperäisen kalenterin aikaan " + kalenteri.getTime()  + "\n"
				+ " lisätään aikaa (+ 1 h 10 min) " + kalenteri_lisa.getTime());
	}

}
