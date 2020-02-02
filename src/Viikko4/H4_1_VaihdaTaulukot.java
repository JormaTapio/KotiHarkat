package Viikko4;

/*Tallenna kahteen taulukkoon kokonaislukuja, ja toteuta myös metodi vaihdaTaulukot(int[], int[]) , joka vaihtaa kahden taulukon sisällöt keskenään.
* Tarkastetaan, että taulukot ovat samankokoisia.
* Tässä tehtävässä kopioidaan taulukon alkiot yksitellen taulusta toiseen käyttäen väliaikaista taulukkoa kopioinnin apuna.
* Tulosta vaihdettujen taulukoiden sisällöt lopuksi näytölle.
*/

public class H4_1_VaihdaTaulukot {
	 static int taulu1[] = {1,2,3,4,5};    // taulukko on Javassa olio.
     static int taulu2[] = {10,20,30,40,50};
     //static int valitaulu[5];
     
     // taulu1.length 
     public static boolean vaihdaTaulukot(int[] taulu1, int[] taulu2) {
         int valitaulu[] = new int[taulu1.length];
         
         if (taulu1.length == taulu2.length) {	/*
         for (int i=0; i< taulu1.length; i++) {
             valitaulu[i] = taulu1[i];
         }
         taulu1 = taulu2;*/

         System.arraycopy(taulu1, 0, valitaulu, 0, taulu1.length);
         //System.out.println("Valitaulu : (pitäisi alkaa 1:llä) " + tauluMerkkijonoksi(valitaulu));
         System.arraycopy(taulu2, 0, taulu1, 0, taulu1.length);
         //System.out.println("Taulu1 : (pitäisi alkaa 10:llä) " + tauluMerkkijonoksi(taulu1));
         System.arraycopy(valitaulu, 0, taulu2, 0, taulu1.length);
         
         //System.out.println("Taulu2 : (pitäisi alkaa 1:llä) " + tauluMerkkijonoksi(taulu2));
         
         //taulu2 = valitaulu;
         }
         return true;
     }
     
     public static String tauluMerkkijonoksi(int[] t) {
         StringBuffer mjpuskuri = new StringBuffer();
         System.out.println("Taulukko merkkijonona: ");
         for (int i=0; i<t.length; i++) {
             //System.out.print(t[i]);
             mjpuskuri.append(t[i] + " |");
         }
         return mjpuskuri.toString();
     }

	public static void main(String[] args) {
	
		System.out.println("taulu1: "+ tauluMerkkijonoksi(taulu1) + "\n"
                + vaihdaTaulukot(taulu1, taulu2));
        System.out.println("taulu1: "+ tauluMerkkijonoksi(taulu1) + "\n"
        		+ vaihdaTaulukot(taulu1, taulu2));
        //vaihdaTaulukot(taulu1, taulu2);
        System.out.println("taulu1: "+ tauluMerkkijonoksi(taulu1) + "\n");
     
	}

}
