package Viikko3;
import java.util.ArrayList;

//Radiot -luokka on ArrayList, johon voi tallentaa useita Radio-tyypin aparaatteja. Listalle voi lisÃ¤tÃ¤ radion,
//lisÃ¤ksi niiden mÃ¤Ã¤rÃ¤n voi palauttaa, samoin kuin tietyn indeksin sisÃ¤ltÃ¤mÃ¤n radion. MyÃ¶s koko listaus saadaan tulostettua.


class Radiot {
  private ArrayList<Radio> radiot = new ArrayList<>();


  public void lisaa(Radio radio) {
      radiot.add(radio);
      System.out.println("*** Radio " + radio + " on on lisÃ¤tty omiin radioihisi. ***\n");


  }


  public void tulosta() {
      int i = 0;
      if (radiot.size() == 0)
          System.out.println(" [ei yhtÃ¤Ã¤n radiota]");
      for (Radio indeksi : radiot) {
          System.out.print((i + 1) + ": ");
          System.out.print(indeksi);
          System.out.println();
          i++;
      }
  }


  public int maara() {
      return radiot.size();
  }


  public Radio valitse(int indeksi) {
      return radiot.get(indeksi);
  }
}