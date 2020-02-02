package Viikko5;

//Object <- Elain <- KissaElain <- Kissa
abstract class Elain {
	private String laji;
	public Elain(String laji) {
		this.laji = laji;
	}
	public String getLaji() {
		return laji;
	}
}
//Abstract --> Luokasta ei voi luoda lainkaan olioa
class KissaElain extends Elain {
	public KissaElain(String laji) {
		super(laji);
	}

	public String toString() {
		return "Olen " + super.getLaji();
	}
}

class Kissa extends KissaElain {
	public Kissa(String laji) {
		super(laji);
	}

	public String toString() {
		return super.toString();
	}
}

public class KissaHierarkiaDemo {
	public static void main(String[] args) { // F5
		Object tiikeri = new KissaElain("Liikeri");
		System.out.println(tiikeri);
		Kissa katti = new Kissa("Miuku");
		System.out.println(katti);
		//Object misu = new Kissa("Misu");
		Elain misu = new Kissa("Misu");
		System.out.println(misu);
		
		Elain katti2 = katti;
		Object katti3 = katti2;
		System.out.println(katti2);

	}
}


 


