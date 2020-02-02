package KesaHarkat;
//Ratkaisuni tehtävään KH12: Työntekijä useilla osoitteilla ja puhelinnumeroilla
import java.util.Arrays;

public class K12_TyontekijaPuhelimiaJaOsoitteita{

public static void main(String args[]) {
     Tyontekija aku = new Tyontekija("Aku Ankka");
     Osoite kotiOsoite = new Osoite("Ankkalinna","43210", "Ankkakuja 46 B", "Koti");
     Osoite tyoOsoite  = new Osoite("Ankkalinna","43210", "Rahasäiliönkatu 1 B", "Työ");
     Puhelinnumero kotiPuhelin = new Puhelinnumero(0453245, "Koti");
     Puhelinnumero matkaPuhelin = new Puhelinnumero(0403245, "Matka");
     
     aku.lisaaOsoite(kotiOsoite);
     aku.lisaaOsoite(tyoOsoite);
     aku.lisaaPuhelinnumero(kotiPuhelin);
     aku.lisaaPuhelinnumero(matkaPuhelin);
     System.out.println(aku);
 	 }
}