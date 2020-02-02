package KesaHarkat;

public class K2_BensaTankki {

		double tilavuus;
		double bensaMaara;

		public K2_BensaTankki(double tilavuus, double bensaMaara) {
			this.tilavuus = tilavuus;
			this.bensaMaara = bensaMaara;
		}

		public String toString() {
			return "Bensatankin tilavuus on " + tilavuus + " litraa, ja siellä on " + bensaMaara + " litraa bensaa.";
		}


	public static void main(String[] args) {
		K2_BensaTankki tankki = new K2_BensaTankki(60, 30);
		K2_BensaTankki tankki2 = new K2_BensaTankki(50, 27.5);
		System.out.println(tankki);
		System.out.println(tankki2);
}
}
