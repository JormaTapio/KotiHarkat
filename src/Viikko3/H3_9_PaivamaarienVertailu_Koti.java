package Viikko3;

import java.util.Date;


//Luo kaksi päivämäärä oliota Date-luokalla ja vertaile niiden arvoja keskenään.


public class H3_9_PaivamaarienVertailu_Koti {
 public static void main(String args[]) {
     Date aika = java.util.Calendar.getInstance().getTime();
     Date pvm = new Date();
     System.out.println("Tänään on  " + pvm + "\n" + "Aika on muuten nyt " + aika);
     Date aika1 = java.util.Calendar.getInstance().getTime();
     
     //aika1 = aika;
     System.out.println();
     
     if (aika.compareTo(aika1) == 0)
         System.out.println("Aikaarvot ovat samoja.");
     else if (aika.compareTo(aika1) < 0)
         System.out.println("1. aika-arvo on pienenmpi kuin toisena syötetty arvo.\n" + aika + " != " + aika1);
     else
         System.out.println("1. aika-arvo on suurempi kuin toisena syötetty arvo.\n" + aika +  " != " + aika1);
 }
}