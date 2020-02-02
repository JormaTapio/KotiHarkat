package KesaHarkat;

//Ratkaisuni KH-11a: TilastoBean

public class K11_TilastoBeanTesti{
	
public static void main(String[] args) {
     TilastoBean sb = new TilastoBean();
     sb.setLukuMerkkijono("400,500,600,700,800,900,1000,1100,1200");
     // sb.setLukuMerkkijono("400,500,600,700,250,1900,1000,1100,1200"); // b) kokeilu
     System.out.println(sb.getLuku(0));
     System.out.println(sb.getLuku(1));
     System.out.println(sb.getLuku(2));
     System.out.println(sb.getKoko());
     System.out.println("summa=" + sb.getSumma());        // Korjattu keskiarvo => summa
     System.out.println("keskiarvo=" + sb.getKeskiarvo());
     
     System.out.println(sb);
     
     // b) Minimi, maksimi ja taulukko järjestykseen
     System.out.println("suurin arvo=" + sb.laskeMax());
     System.out.println("pienin arvo=" + sb.laskeMin() + "\n");
          
     System.out.println("Järjesatetty taulukko:");
     double[] jarjestettyTaulukko = sb.jarjestaTaulukko();
     for (int i=0; i<sb.getKoko(); i++) {
    	 System.out.println("Talukon(" + i + ")=" + jarjestettyTaulukko[i]);
     }
     
     // c) TilastoBean varianssin ja keskihajonnan laskeminen
     System.out.println("\nkeskihajonta= " + sb.keskihajonta());
     System.out.println("varianssi= " + sb.varianssi());
     
 }
}