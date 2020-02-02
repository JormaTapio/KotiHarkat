package KesaHarkat;

public class Paivamaara {
	int kuukausi;
	int vuosi;
	int paiva;

	String apupaiva;
	String apukuukausi;

	public Paivamaara(int paiva, int kuukausi, int vuosi) {
		this.paiva = paiva;
		this.kuukausi = kuukausi;
		this.vuosi = vuosi;
	}

	public String usaFormaatti() {
		if (paiva < 10)
			apupaiva = "0";
		else
			apupaiva = "";
		if (kuukausi < 10)
			apukuukausi = "0";
		else
			apukuukausi = "";

		return apukuukausi + kuukausi + "/" + apupaiva + paiva + "/" + vuosi;
	}

	public String isoFormaatti() {
		if (paiva < 10)
			apupaiva = "0";
		else
			apupaiva = "";
		if (kuukausi < 10)
			apukuukausi = "0";
		else
			apukuukausi = "";

		return vuosi + "-" + apukuukausi + kuukausi + "-" + apupaiva + paiva;
	}

	public int getPaiva() {
		return paiva;
	}

	public int getKuukausi() {
		return kuukausi;
	}

	public void setPaiva(int uusipaiva) {
		this.paiva = uusipaiva;
	}

	public void setKuukausi(int uusikuukausi) {
		this.kuukausi = uusikuukausi;
	}

//public String toString() {  						// Ennen lisätehtävää lisätä nollat.
//	return "" + paiva +"."+ kuukausi +"."+ vuosi;
//}

	public String toString() {
		if (paiva < 10)
			apupaiva = "0";
		else
			apupaiva = "";
		if (kuukausi < 10)
			apukuukausi = "0";
		else
			apukuukausi = "";

		return "" + apupaiva + paiva + "." + apukuukausi + kuukausi + "." + vuosi;
	}
}
