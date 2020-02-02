package Viikko3;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
//import java.util.Scanner;

//Radio -luokka kÃ¤sittÃ¤Ã¤ tehtÃ¤vÃ¤nannon mukaiset ominaisuudet ja toiminnot, ja lisÃ¤ksi pÃ¤ivÃ¤mÃ¤Ã¤rÃ¤n ja ajan. Koska ohjelmassa luodaan useita
//radioita, niille tÃ¤ytyy myÃ¶s asettaa nimi.
class Radio {
  private String nimi;
  private boolean paalla;
  private int aanenvoimakkuus;
  private double taajuus = 2000;
  private Calendar kalenteri;
  private SimpleDateFormat paiva = new SimpleDateFormat("d.M.yyyy HH:mm:ss");
  private SimpleDateFormat aika = new SimpleDateFormat("HH:mm:ss");
  private static ArrayList<Radio> mankat = new ArrayList<>();


  public Radio(String nimi) {
      kalenteri = new GregorianCalendar();
      this.nimi = nimi;
      // mankat = new ArrayList<>();
      System.out.println("\n*** Uusi radio on luotu " + paiva.format(kalenteri.getTime()) + " ***");


  }


  public void lisaa(String radio) {
      mankat.add(new Radio("radio"));
  }


  public void asetaRadionTila(int tila) {
      if (tila == 1) {
          paalla = true;
          kalenteri = new GregorianCalendar();
          System.out.println("\n*** Radio " + nimi + " on pÃ¤Ã¤llÃ¤. " + aika.format(kalenteri.getTime()) + " ***");
      } else if (tila == 0) {
          kalenteri = new GregorianCalendar();
          paalla = false;
          System.out.println("\n*** Radio " + nimi + " on pois pÃ¤Ã¤ltÃ¤. " + aika.format(kalenteri.getTime()) + " ***");
      } else
          System.out.println("\nVirheellinen syÃ¶te (kirjoita 1 tai 0), tilaa ei muutettu. Radiota " + nimi
                  + " viimeksi muokattu " + aika.format(kalenteri.getTime()));
  }


  public void asetaAanenVoimakkuus(int aani) {
      if (aani <= 9 && aani >= 0) {
          aanenvoimakkuus = aani;
          kalenteri = new GregorianCalendar();
          System.out.println("\n*** Ã„Ã¤nenvoimakkuus on arvossa " + aani + " ***");
      } else
          System.out.println("\nValintasi on raja-arvojen (0-9) ulkopuolella. Voimakkuutta ei muutettu. Radiota "
                  + nimi + " viimeksi muokattu " + aika.format(kalenteri.getTime()));
  }


  public void asetaTaajuus(double taajuus) { // (asettaa radion taajuuden, jos sÃ¤Ã¤tÃ¶ on mahdollista)
      if (taajuus >= 2000 && taajuus <= 26000) {
          this.taajuus = taajuus;
          kalenteri = new GregorianCalendar();
          System.out.println(
                  "\n*** Taajuus on sÃ¤Ã¤detty lukemaan " + taajuus + ". " + aika.format(kalenteri.getTime()) + " ***");
      } else {
          System.out.println("\n*** Taajuutta ei voi valita. MitÃ¤Ã¤n ei tehty. Radiota " + nimi + " muokattu viimeksi "
                  + aika.format(kalenteri.getTime()) + " ***");
      }
  }


  public void mikaVoimakkuus() { // (palauttaa radion Ã¤Ã¤nen voimakkuuden)
      System.out.println("\n*** Radion " + nimi + " Ã¤Ã¤nenvoimakkuus on arvossa " + aanenvoimakkuus + ". ***");
  }


  public void mikaTaajuus() { // (palauttaa radion kÃ¤yttÃ¤mÃ¤n taajuuden)
      System.out.println("\n*** Radion " + nimi + " taajuus on arvossa " + taajuus + ". ***");
  }


  public void onkoPaalla() { // (palauttaa tiedon siitÃ¤ on radio pÃ¤Ã¤llÃ¤ vai ei)
      if (paalla == true)
          System.out.println("\n*** " + nimi + " on pÃ¤Ã¤llÃ¤. ***");
      else
          System.out.println("\n*** " + nimi + " on pois pÃ¤Ã¤ltÃ¤. ***");
  }


  public String toString() {
      return nimi;
  }


}
