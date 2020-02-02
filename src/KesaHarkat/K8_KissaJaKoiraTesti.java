package KesaHarkat;

public class K8_KissaJaKoiraTesti{
    public static void main(String[] args) {
        Kissa katti = new Kissa("Katti");
        Koira musti = new Koira("Musti");
        System.out.println(katti + "\n" + musti);
        musti.jahtaa(katti);
        katti.karkuun(musti);
    }
    

}
