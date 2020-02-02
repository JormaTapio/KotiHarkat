package KesaHarkat;

// Minun ratkaisuni "K-3 Harjoitus: muunna kokonaisluku eri muotoihin a) Muunna luku heksaluvuksi
// b) Muunna luku binääriluvuksi ja c) Muunna luku oktaaliluvuksi

public class K3_MuunnaKokoniaslukuEriMuotoihin {

public static void main(String[] args) {
	// A)
	HeksaLuku luku1 = new HeksaLuku(11);
	HeksaLuku luku2 = new HeksaLuku(257);
	System.out.println(luku1.muunnaHeksaluvuksi(11) + "," + luku2.muunnaHeksaluvuksi(257));
	//System.out.println(muunnaHeksaluvuksi(11) + "," + muunnaHeksaluvuksi(257));
	
	// B)
	BinaariLuku luku3 = new BinaariLuku(255);
	BinaariLuku luku4 = new BinaariLuku(256);
	System.out.println(luku3.muunnaBinaariluvuksi(255) + "," + luku4.muunnaBinaariluvuksi(256));
	//System.out.println(muunnaBinaariluvuksi(255) + "," + muunnaBinaariluvuksi(256));
	
	// C)
	OktaaliLuku luku5 = new OktaaliLuku(255);
	OktaaliLuku luku6 = new OktaaliLuku(256);
	System.out.println(luku5.muunnaOktaaliluvuksi(255) + "," + luku6.muunnaOktaaliluvuksi(256));
	//System.out.println(muunnaOktaaliluvuksi(255) + "," + muunnaOktaaliluvuksi(256));
}
}

