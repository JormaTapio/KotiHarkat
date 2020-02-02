// kuvioiden tulostaminen

package Viikko3;

public class Harjoitus3_1K {

	
	public static void main(String[] args) {
		int max_merkki = 11;
		int max_rivi = 11;
		
		int keskikohta;
		
		if (max_merkki % 2 == 0)
			keskikohta = max_rivi / 2;
		else 
			keskikohta = (max_rivi+1)/2; 
		
		for (int rivi=1; rivi<= max_rivi; rivi++) {
			int k1_tyhja = rivi -1;
			int k1_tahti = max_merkki + 1 - rivi;
			int vakio_vali = 4;
			
			int k2_tyhja = max_merkki - rivi;
			
			int k3_tyhja, k3_tahti;
			
			for (int merkki = 1; merkki <= max_merkki; merkki++) {
				// Kuvio yksi
				if (merkki <= k1_tahti) {
					System.out.printf("*");
				}
				else {
					System.out.printf(" ");
				}
			}
				
				System.out.print(" ");
				
			for (int merkki = 1; merkki <= max_merkki; merkki++) {
			
				// Kuvio kaksi
				if (merkki <= k2_tyhja) {
					System.out.printf(" ");
				}
				else {
					System.out.printf("*");
				}
				
			}
			System.out.print("       ");
			
			for (int merkki = 1; merkki <= max_merkki; merkki++) {
				
				// Kuvio kolme
				if (rivi <= keskikohta) {
					k3_tyhja = keskikohta - rivi;
					k3_tahti = 2*rivi -1;
					}
				else {
					k3_tyhja = rivi - keskikohta;
					k3_tahti = max_rivi - k3_tyhja;
				}
				
				if (merkki <= k3_tyhja || merkki > max_merkki -k3_tyhja) {
					System.out.printf(" ");
				}
				else {
					System.out.printf("*");
				}
				
			}
			System.out.println();
			
			
		}

	}

}
