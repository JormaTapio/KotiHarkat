package KesaHarkat;

abstract class KantaLuku {
	private int kokonaisluku;
	public int kanta;
	public int koko;
	public int[] kokonaisTaulu;
	public String[] muunnosTaulu;

	public KantaLuku(int kokonaisluku) {
		this.kokonaisluku = kokonaisluku;
		this.kanta = 10;
		this.koko = koko();
		this.kokonaisTaulu = new int[koko];
		this.muunnosTaulu = new String[koko];
	}

	public KantaLuku(int kokonaisluku, int kanta) {
		this.kokonaisluku = kokonaisluku;
		this.kanta = kanta;
		this.koko = koko();
		this.kokonaisTaulu = new int[koko];
		this.muunnosTaulu = new String[koko];
	}

	public void kokonaisTaulukko(int kokonaisluku) {
		int index = 0;
		int jakojaannos;

		while (jako(kokonaisluku) > 0) {
			jakojaannos = jakoJaannos(kokonaisluku);
			kokonaisluku = jako(kokonaisluku);
			kokonaisTaulu[index] = jakojaannos;
			index += 1;
		}
		if (kokonaisluku != 0)
			kokonaisTaulu[index] = kokonaisluku;
	}
	
	public void muunnosTaulukko() {
		kokonaisTaulukko(kokonaisluku);
		String[] heksaTaulu = new String[koko];
			for (int i = 0; i < koko; i++) {
			switch (kokonaisTaulu[i]) {
			default:
				heksaTaulu[i] = Integer.toString(kokonaisTaulu[i]);
			}
			}
		kopioTaulu(heksaTaulu, muunnosTaulu);
	}
	
	public int koko() {
		int koko = 1;
		int apukokonaisluku = kokonaisluku;
		while (jako(apukokonaisluku) > 0) {
			koko += 1;
			apukokonaisluku = jako(apukokonaisluku);
		}
		return koko;
	}

	public int jakoJaannos(int kokonaisluku) {
		return kokonaisluku % kanta;
	}

	public int jako(int kokonaisluku) {
		return kokonaisluku / kanta;
	}
	
	public void kopioTaulu(String[] lahtoTaulu, String[] kopioTaulu) {
		for (int i=0; i<koko; i++) {
			kopioTaulu[i] = lahtoTaulu[i];
		}
	}

	public String toString() {
		String charluku = "";
		muunnosTaulukko();
		for (int i = koko; i > 0; i--)
			charluku = charluku + muunnosTaulu[i - 1];
		return charluku;
	}
}

// Minun ratkaisuni K-3 Harjoitus: muunna kokonaisluku eri muotoihin a) Muunna luku heksaluvuksi
class HeksaLuku extends KantaLuku{
	
public HeksaLuku(int kokonaisluku) {
		super(kokonaisluku);
		kanta = 16;
		super.koko = koko();
		super.kokonaisTaulu = new int[koko];
		super.muunnosTaulu = new String[koko];
	}
	
	HeksaLuku(int kokonaisluku, int kanta) {
		super(kokonaisluku);
		super.kanta = kanta;
		super.koko = koko();
		super.kokonaisTaulu = new int[koko];
		super.muunnosTaulu = new String[koko];
	}

	public void muunnosTaulukko() {
		String[] heksaTaulu = new String[koko];

		for (int i = 0; i < koko; i++) {
			switch (kokonaisTaulu[i]) {

			case 10:
				heksaTaulu[i] = "A";
				break;
			case 11:
				heksaTaulu[i] = "B";
				break;
			case 12:
				heksaTaulu[i] = "C";
				break;
			case 13:
				heksaTaulu[i] = "D";
				break;
			case 14:
				heksaTaulu[i] = "E";
				break;
			case 15:
				heksaTaulu[i] = "F";
				break;
			default:
				heksaTaulu[i] = Integer.toString(kokonaisTaulu[i]);
			}
		}
		kopioTaulu(heksaTaulu, muunnosTaulu);
	}
	
	public String muunnaHeksaluvuksi(int kokonaisluku) {
		String charluku = "";
		kokonaisTaulukko(kokonaisluku);
		muunnosTaulukko();
		for (int i = koko(); i > 0; i--)
			charluku = charluku + muunnosTaulu[i-1];
		return charluku;
	}
}

//Minun ratkaisuni luvun muuttamiseen binääriluvuksi

class BinaariLuku extends KantaLuku{
	
public BinaariLuku(int kokonaisluku) {
		super(kokonaisluku);
		kanta = 2;
		koko = koko();
		kokonaisTaulu = new int[koko];
		muunnosTaulu = new String[koko];
	}
	
	public String muunnaBinaariluvuksi(int kokonaisluku) {
		String charluku = "";
		kokonaisTaulukko(kokonaisluku);
		muunnosTaulukko();
		for (int i = koko(); i > 0; i--)
			charluku = charluku + muunnosTaulu[i-1];
		return charluku;
	}
}

//Minun ratkaisuni luvun muuttamiseen oktaaliluvuksi

class OktaaliLuku extends KantaLuku{
	
public OktaaliLuku(int kokonaisluku) {
		super(kokonaisluku);
		kanta = 8;
		koko = koko();
		kokonaisTaulu = new int[koko];
		muunnosTaulu = new String[koko];
	}
		
	public String muunnaOktaaliluvuksi(int kokonaisluku) {
		String charluku = "";
		kokonaisTaulukko(kokonaisluku);
		muunnosTaulukko();
		for (int i = koko(); i > 0; i--)
			charluku = charluku + muunnosTaulu[i-1];
		return charluku;
	}
}
