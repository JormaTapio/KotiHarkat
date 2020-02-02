package KesaHarkat;
//Minun ratkaisuni tehtävään K6: Kruuna vai klaava

public class Kolikko {
	int arvo;

	Kolikko() {
	}

	public void heita() {
		this.arvo = (int) Math.floor (Math.random()*2);
	}

	public int palautaArvo() {
		return arvo;
	}
}
