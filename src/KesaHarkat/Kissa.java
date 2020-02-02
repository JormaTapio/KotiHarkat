package KesaHarkat;

public class Kissa{
String nimi;

Kissa(String nimi){
this.nimi = nimi;
}

public void karkuun(Koira nimi){
System.out.println(this.nimi + " juoksee karkuun oliota " + nimi);
}

public String toString(){
return "Kissa: " + nimi;
}
}




