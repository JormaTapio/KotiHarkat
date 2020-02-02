package KesaHarkat;

//Ratkaisu KH10: Omenat ja Kori

public class K10_OmenatJaKoriTesti{

 public static void main(String[] args) {
     Omena omppu1 = new Omena("Aino", 120);
     Omena omppu2 = new Omena("Amorosa", 80);
     Omena omppu3 = new Omena("Ola", 420);
     Kori omenakori = new Kori("Pärekori");
     omenakori.lisaaOmena(omppu1);
     omenakori.lisaaOmena(omppu2);
     omenakori.lisaaOmena(omppu3);
     omenakori.lisaaOmena(new Omena("Raike", 210));
     
     omenakori.lisaaOmena(new Omena("Valkea kuulas", 120));
     omenakori.lisaaOmena(new Omena("Åkero", 120));


     System.out.println(omenakori);
 }
}
