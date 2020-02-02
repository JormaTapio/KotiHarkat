package Viikko4;
import java.util.ArrayList;

public class AutoRekisteriTesti_Koti {
		
	public static void main(String[] args) {
       
		// Luodaan kaksi Auto-oliota muistiin
        Auto toyota = new Auto("Toyota", "Civic");
        Auto peoget = new Auto("Peoget", "206");
        Auto honda = new Auto("Honda", "Civic");
        Auto vw = new Auto("Volkswagen","Golf");
        
        // Autorekisteri on kokoelmaluokka , joka tallentaa autojen tietoja
        AutoRekisteri rekisteri = new AutoRekisteri();
        rekisteri.lisaa(toyota);
        rekisteri.lisaa(peoget);
        rekisteri.lisaa(honda);
        rekisteri.lisaa(vw);
        rekisteri.lisaa(new Auto("Volkswagen", "Passat"));

       	rekisteri.tulosta();
	}
}
