package Viikko4;

/*Toteuta luokka Noppa, joka sisältää yhden tiedon eli nopan silmäluvun (väliltä 1-6).
Lisäksi luokassa on metodi heita(), jolla heitetään noppaa arpomalla uusi satunnaisluku joka kerta.
Toteuta pääohjelma, jossa luot kaksi Noppa-oliota ja heität noppaa sekä tulostat heiton tulokset.
*/
   
public class Noppa {
	
	int arvo = 0;
	
	Noppa(){
		arvo = 0;
	}
	
	  public int heita() {
		  //arvo =(int) Math.floor(Math.random() * 7);
		  this.arvo = (int)(Math.random() * 6) / 1;
		  return arvo;
	  }

	  public void setArvo (int arvo) {
		  this.arvo = arvo;
	  }

	  public int getArvo() {
		  //this.arvo = arvo;
		  return arvo;
	  }

}
