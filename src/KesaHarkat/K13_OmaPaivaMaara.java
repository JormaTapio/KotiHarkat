package KesaHarkat;
//Ratkaisuvaihtoehto K_13: Omapäivämäärä


public class K13_OmaPaivaMaara{


public static void main(String[] args) {
     Paivamaara pvm = new Paivamaara(17, 6, 2019);
     System.out.println(pvm);
     pvm.setPaiva(pvm.getPaiva() +  1);
     System.out.println(pvm.usaFormaatti());
     pvm.setKuukausi(pvm.getKuukausi() +  1);
     System.out.println(pvm.isoFormaatti());
 }
}

