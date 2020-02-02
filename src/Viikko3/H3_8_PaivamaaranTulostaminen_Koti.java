package Viikko3;
import java.util.Date;


//Tulosta tämänhetkinen päivämäärä käyttäen Date-luokkaa ja vähintään kahta eri tapaa.


public class H3_8_PaivamaaranTulostaminen_Koti {
 public static void main(String args[]) {
     Date aika = java.util.Calendar.getInstance().getTime();
     Date pvm = new Date();
     System.out.println("Tänään on  " + pvm + "\n" + "Aika on muuten nyt " + aika);
 }
}