package Viikko5;

public class Kortti {
int [] maat = new int  [4];
int [] arvot = new int [13];
int maa;
int arvo;

Kortti() {
}

Kortti(int maa, int arvo) {
	this.maa = maa;
	this.arvo = arvo;
}
 
public String annaMaa() {
	
	int luku = (int) Math.ceil(Math.random()*4);
	
		switch(luku) {
		
		case 0:
			{
			return "Risti";
			//break
			}
		
		case 1:
			{
			return "Pata";
			//break;
			}
		
		case 2:
			{
			return "Ruutu";
			//break;
			}
		
		case 3:
			{
			return "Hertta";
			//break;
			}
		
		default:
			System.out.println("Korttimaita on vain neljä erilaista. Anna arvo 0-3.");
			return "Not OK";
		}
	}

	public boolean onSuurempi(int luku1, int luku2) {
		if (luku1 > luku2)
			return true;
		else 
			return false;
	}
	

	public String annaNumero() {
		final int lukuArvo = (int) Math.ceil(Math.random() * 13) + 1;
		String[] kortinArvo = { "Kaks", "kol", "Nel", "Viis", "Kuus", "Sei", "Kasi", "Ysi", "Kymppi", "Jätkä", "Akka",
				"Kustu", "Ässä" };
		return kortinArvo[lukuArvo];
	}
}
