package KesaHarkat;

import java.util.ArrayList;

class Piste {
	private int xPos, yPos;
	private int ID;
	public ArrayList<Integer> IdTaulu = new ArrayList<Integer>();

	Piste() {
		this.xPos = 0;
		this.yPos = 0;
		this.ID = IdTaulu.size() + 1;
	}

	Piste(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.ID = IdTaulu.size() + 1;
	}

	public void setPoint(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}

	public Object clone(){
		Piste t = new Piste();
		t.xPos = xPos;
		t.yPos = yPos;
		t.ID = IdTaulu.size() + 1;
		return t;
	}

	public boolean equals(Piste x) {
		if ((this.xPos == x.xPos) && (this.yPos == x.yPos) && (this.ID == x.ID)) // Korjasin tämän if-lauseen
																					// määrityksen syntaksia
			return true;
		else
			return false;
	}

	public String toString(Piste x) {
		return ("X: " + x.xPos + ",     Y: " + x.yPos);
	}

	public String toString() {
		return ("X: " + xPos + ",     Y: " + yPos);
	}
}
