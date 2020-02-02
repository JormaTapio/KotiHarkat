
package Viikko4;

/*		Tee luokka RekisteriTesti, jolla voidaan testata edellä tehtyjä luokkia:
			•luo Rekisteri-luokasta olio, johon voidaan tallentaa henkilöitä  
			•luo joitain henkilöitä  
			•lisää henkilöitä rekisteriin  
			•tulosta rekisterin sisältö  
			•etsi henkilöä sotun perusteella  
*/

public class H4_5_HenkilorekisterinToteutus {
	

	public static void main(String[] args) {

		Henkilo h1 = new Henkilo("Matti", "Meikalainen", "111131-123A", 84);
		Henkilo h2 = new Henkilo("Teija", "Teikaläinen", "220242-234B", 73);
		Henkilo h3 = new Henkilo("Pekko", "Peloton", "330363-345A", 52);
		Henkilo h4 = new Henkilo("Ulla", "Untamoinen", "010175-543B", 40);
		Henkilo h5 = new Henkilo("Aku", "Avainheimo", "020286-432C", 29);
		Henkilo h6 = new Henkilo("Simo", "Avainheimo", "030486-654D", 29);

		Rekisteri rekisteri = new Rekisteri();

		rekisteri.lisaaHenkilo(h1);
		rekisteri.lisaaHenkilo(h2);
		rekisteri.lisaaHenkilo(h3);

		System.out.println("Just for try ...");
		rekisteri.tulosta(h2);
		System.out.println("\n");

		rekisteri.lisaaHenkilo(h4);
		rekisteri.lisaaHenkilo(h5);
		rekisteri.lisaaHenkilo(h6);



		
		for (int i =0; i<rekisteri.palautaHenkilomaara(); i++) //rekisteri.size()
			{
			Henkilo indexHenkilo = rekisteri.palautaHenkilo(i);
			rekisteri.tulosta(indexHenkilo);	//rekisteri.get(i).tulosta(i);
			}
		//	System.out.println(rekisteri.get(i).toString());	
		//  System.out.println(rekisteri.etsiHenkilo("010175-543B").toString());
		System.out.println("\nLopuksi etsitään ihminen hänen sosiaaliturvatunnuksen mukaan, joka on 010175-543B");
		rekisteri.tulosta(rekisteri.etsiHenkilo("010175-543B"));
		
//		System.out.println("\n... ja henkilön jota ei ole rekisterissä 010101-111A");
//		rekisteri.tulosta(rekisteri.etsiHenkilo("010101-111A"));
	}

}
