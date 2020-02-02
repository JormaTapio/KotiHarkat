package KesaHarkat;

public class Pikseli extends Piste {
	int vari;

	public Pikseli(int xPos, int yPos, int vari) {
		super(xPos, yPos);
		this.vari = vari;
	}
	
	public String toString() {
		return (super.toString() + ",     Väri: " + vari);
	}
}
