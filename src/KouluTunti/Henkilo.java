package KouluTunti;

public class Henkilo implements Comparable<Henkilo> {
  private String etunimi;
  private String sukunimi;
  private int ika;
  private String sotu;
  // Konstruktori, getterit ja setterit

  public Henkilo(String etunimi, String sukunimi, String sotu, int ika) {
    this.etunimi = etunimi;
    this.sukunimi = sukunimi;
    this.sotu = sotu;
    this.ika  = ika;
  }

  public String getSotu() {
    return sotu;
  }

  public String getEtunimi() {
    return etunimi;
  }

  public String getSukunimi() {
    return sukunimi;
  }

  public int getIka() {
    return ika;
  }

  public void setEtunimi(String etunimi) {
    this.etunimi = etunimi;
  }

  public void setSukunimi(String sukunimi) {
    this.sukunimi = sukunimi;
  }

  public void setIka(int ika) {
     this.ika = ika ;
   }
// Luokka implements Comparable<Henkilo>
  public int compareTo(Henkilo verrattava) {
    int sukuVert = sukunimi.compareTo( verrattava.getSukunimi() );
    if (sukuVert == 0) // jos sukunimet ovat samat, verrataan vielÃ¤ etunimiÃ¤
        return etunimi.compareTo(verrattava.getEtunimi());
    else // sukunimet ovat erisuuret, palautetaan vertailun tulos
        return sukuVert;
  }

  @Override
  public String toString() {
    return etunimi + " " + sukunimi + " " + sotu + " " + ika;
  }
  
  // metodi palauttaa true, jos kaksi henkilÃ¶a ovat samoja
  // Eli etunimi, sukunimi ja sotu ovat samoja
  @Override
  public boolean equals(Object verrattava){
	  Henkilo cmp = (Henkilo)verrattava;
    if (etunimi.equals(cmp.getEtunimi()) &&     // vertailtavan etunimi on sama
        sukunimi.equals(cmp.getSukunimi()) &&   // vertailtavan sukunimi on sama
        sotu.equals(cmp.getSotu()))    
        return true;
    else 
        return false;
    }

    // palauttaa samansisaltoisen hajautuskoodin samansisaltoisille henkiloille
    @Override
    public int hashCode() {
    	//etunimi.toLowerCase().hashCode() + sukunimi.toLowerCase().hashCode();
        //return etunimi.hashCode() + sukunimi.hashCode() + sotu.hashCode();
    	Integer ika = (Integer) this.ika;
        return etunimi.hashCode() + sukunimi.hashCode() + sotu.hashCode() + ika.hashCode();
    }
  
}
