package KesaHarkat;

//Ratkaisu KH9: LuokanOppilas
public class K9_LuokanOppilasTesti{
//public int oppilasmaara;


 public static void main(String[] args) {
LuokanOppilas LuokanOppilas = new LuokanOppilas();
	 
     LuokanOppilas matti = new LuokanOppilas("Matti", true);
     LuokanOppilas pekka = new LuokanOppilas("Pekka", false);
     LuokanOppilas kaarina = new LuokanOppilas("Kaarina", false);
     LuokanOppilas aino = new LuokanOppilas("Aino", false);
     LuokanOppilas annikki = new LuokanOppilas("Annikki", true);
     matti.tulosta();
     pekka.setIstuu(true);
     pekka.tulosta();
     annikki.setIstuu(false);
     aino.tulosta();
     annikki.tulosta();
     System.out.println(matti);
     System.out.println(pekka);
     System.out.println(kaarina);
     // Lisätehtävä
     System.out.println("Luokassa on oppilaita on yhteensä " + LuokanOppilas.oppilaitaYhteensa() + " kappaletta");


 }
}