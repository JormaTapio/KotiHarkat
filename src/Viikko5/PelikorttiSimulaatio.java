package Viikko5;

public class PelikorttiSimulaatio {

	public static void main(String[] args) {

		Kortti kortti1 = new Kortti();
		Kortti kortti2 = new Kortti();
		Kortti kortti3 = new Kortti();
		
		Kortti [] kortit = new Kortti[3];
		
		for (int i=0; i<3; i++) {
			kortit[i].annaMaa();
			kortit[i].annaNumero();
		}
		
		System.out.println("Kortti " + kortit[0].maa + " ja numnero " + kortit[0].arvo );
		if(onSuurempi(kortit[0].arvo, kortit[1].arvo))
				System.out.println(" on suurempi kuin ");
		System.out.println("Kortti " + kortit[1].maa + " ja numnero " + kortit[1].arvo );
		
		System.out.println("Kortti " + kortit[1].maa + " ja numnero " + kortit[1].arvo );
		if(onSuurempi(kortit[1].arvo, kortit[2].arvo))
				System.out.println(" on suurempi kuin ");
		System.out.println("Kortti " + kortit[2].maa + " ja numnero " + kortit[2].arvo );
	
	}

}
