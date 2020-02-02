package Viikko5;


public class H5_2_PeriytyminenTesti {

	public static void main(String[] args) {

		//Pallo pallo1 = new Jalkapallo();
		//Urheiluvaline urheiluvaline1 = new Urheiluvaline();
		Pesapallo pesapallo1 = new Pesapallo("Pesapallo", 5);
		Jalkapallo jalkapallo1 = new Jalkapallo("Jalkapallo",5);
		//Object objekti1 = new Object();

	
		System.out.println(jalkapallo1.getLaji());
		jalkapallo1.liiku(5);

		/*Jalkapallo class tunnistettu: Jalkapallo on liikkunut 5 metriä
		 */ 


		/*Pallo interface tunnistettu: Jalkapallo on liikkunut 5 metriä

		Urheiluvaline class tunnistettu: Jalkapallo on liikkunut 5 metriä

		Object class tunnistettu: Jalkapallo on liikkunut 5 metriä*/
		
		System.out.println(pesapallo1.getLaji());
		pesapallo1.liiku(5);

		/*Pesapallo class tunnistettu: Pesis on liikkunut 22 metriä

		Pallo interface tunnistettu: Pesis on liikkunut 22 metriä

		Urheiluvaline class tunnistettu: Pesis on liikkunut 22 metriä

		Object class tunnistettu: Pesis on liikkunut 22 metriä */

		 

	}

}
