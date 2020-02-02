package Viikko5;

class Suorakulmio {
	private double korkeus;
	private double leveys;

	public Suorakulmio(double korkeus, double leveys) {
		this.korkeus = korkeus;
		this.leveys = leveys;
	}
	
	public void setLeveys(double leveys) {
		this.leveys = leveys;
	}
	public double laskePintaala() {
		return korkeus * leveys;
	}

	public String toString() {
		return " korkeus, leveys : ( " + korkeus + ", " + leveys + " )";
	}
}

public class SuorakulmioDemo {
	public static void main(String args[]) {
		int a = 10;
		int b = a; 
		a = 22; 
//		a = null;
		
		Integer intOlio = 10;
		intOlio = null;
		Integer intOlio2 = intOlio; 
		intOlio = 22;
		
		String str = "testi";
		str = null;
		str = "kissa";
		String koira = "" + str;
		System.out.println(str);
		
		Suorakulmio sk1 = new Suorakulmio(10, 20);
		sk1 = null;
		Suorakulmio sk2 = sk1;
		Suorakulmio sk3 = new Suorakulmio(10, 20);
//		sk3 = new Suorakulmio();
//		sk3.setKorkeus(sk1.getKorkeus());
		sk3 = sk1;
		
		sk3 = null;
		if (sk3 != null){
			// SyytÃ¤ jos olio voi olla null
			sk3.setLeveys(15);
		}
		sk2.setLeveys(25);
		sk1.setLeveys(27);
		
		System.out.println("sk1:" + sk1);
		System.out.println("sk2:" + sk2);
	}
}
