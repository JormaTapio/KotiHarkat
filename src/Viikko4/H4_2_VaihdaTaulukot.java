package Viikko4;

public class H4_2_VaihdaTaulukot {
	 static int taulu1[] = {1,2,3,4,5};    // taulukko on Javassa olio.
     static int taulu2[] = {10,20,30,40,50};
     
     public static boolean vaihdaTaulukot(int[] taulu1, int[] taulu2) {
         int valitaulu[] = new int[taulu1.length];
         
         if (taulu1.length == taulu2.length) {

         System.arraycopy(taulu1, 0, valitaulu, 0, taulu1.length);
         System.arraycopy(taulu2, 0, taulu1, 0, taulu1.length);
         System.arraycopy(valitaulu, 0, taulu2, 0, taulu1.length);
         
         }
         return true;
     }
     
     public static String tauluMerkkijonoksi(int[] t) {
         StringBuffer mjpuskuri = new StringBuffer();
         //System.out.println("Taulukko merkkijonona: ");
         for (int i=0; i<t.length; i++) {
             mjpuskuri.append(t[i] + " |");
         }
         return mjpuskuri.toString();
     }
     

	public static void main(String[] args) {
		
        System.out.println("Alkuperäinen taulu1: " + tauluMerkkijonoksi(taulu1) + "\n");
        System.out.println("Alkuperäinen taulu2: " + tauluMerkkijonoksi(taulu2) + "\n");
		vaihdaTaulukot(taulu1, taulu2);
        System.out.println("taulu1: "+ tauluMerkkijonoksi(taulu1) + "\n");
        System.out.println("taulu2: "+ tauluMerkkijonoksi(taulu2) + "\n");

	}

}
