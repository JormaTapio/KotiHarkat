package KesaHarkat;

public class Koira{
String nimi;
 
Koira(String nimi){
this.nimi = nimi;
}
 
public void jahtaa(Kissa nimi){
System.out.println(this.nimi + " jahtaa oliota " + nimi);
}
 
public String toString(){
return "Koira: " + nimi;
}
}
