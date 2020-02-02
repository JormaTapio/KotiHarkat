package KesaHarkat;
import java.util.Scanner;

public class TilastoBean{
private double[] luvut;
double[]lukuTaulukko;

String mjono;
int koko;

TilastoBean(){
}

TilastoBean(double[] lukuTaulu){
this.luvut = lukuTaulu;
}

public double getLuku(int luku){
return luvut[luku];
}

public int getKoko(){
int index = 0;
Scanner lukija = new Scanner(mjono);

lukija.useDelimiter(",");
    while (lukija.hasNext())
    	{
    	lukija.nextInt();
    	index +=1;
    	}
    lukija.close();
return index;
}

public void setLukuMerkkijono(String merkkijono){
     int index = 0;
     mjono = merkkijono;
     koko = getKoko();
     luvut = new double [koko]; 
     Scanner lukija = new Scanner(merkkijono);
     lukija.useDelimiter(",");
     while (lukija.hasNext())
         {
    	 luvut[index] = (double) lukija.nextInt();
    	 index +=1;
         }
     lukija.close();
}

public double getSumma(){
double summa = 0;
for (int i=0; i<koko; i++)
summa += luvut[i];
return summa;
}

public double getKeskiarvo(){
double keskiarvo;
keskiarvo = getSumma()/koko;
return keskiarvo;
}

public String tulostus(){
String apumjono = "";
for (int i=0; i < koko; i++){
String apuluku = "" + luvut[i];
if  (i != koko-1)
apumjono += apuluku + ", ";
else
apumjono += apuluku ;
}
return apumjono;
}

//Ratkaisuni KH-11b: TilastoBean järjestämiseen  sekä minimin että maksimin laskemiseen

public double laskeMax(){
double apuluku;
lukuTaulukko = luvut;
for (int i=0; i<=(koko-2); i++){                                     
if (lukuTaulukko[i] > lukuTaulukko[i+1]){
apuluku = lukuTaulukko[i];
lukuTaulukko[i] = lukuTaulukko[i+1];
lukuTaulukko[i+1] = apuluku;
}
}
return lukuTaulukko[koko-1];
}


public double laskeMin(){
double apuluku;
for (int i=koko -2; i>0; i--){                                     
if (lukuTaulukko[i] >= lukuTaulukko[i+1]){
apuluku = lukuTaulukko[i];
lukuTaulukko[i] = lukuTaulukko[i+1];
lukuTaulukko[i+1] = apuluku;
}
}
return lukuTaulukko[0];
}

//Ratkaisuni K_11 c) TilastoBean varianssin ja keskihajonnan laskeminen

public double keskihajonta(){
double keskiarvo = getKeskiarvo();
double keskisumma = 0;
for (int i=0; i< koko-1; i++)
 keskisumma += (luvut[i]-keskiarvo) * (luvut[i]-keskiarvo);
 double keskihajonta = Math.sqrt(keskisumma/koko);
 return keskihajonta;
}


public double varianssi(){
return (keskihajonta() * keskihajonta());
}

public double[] jarjestaTaulukko(){
for (int j=0; j < koko-2; j++)
laskeMax();
return lukuTaulukko;
}

public String toString(){
return "\n" + tulostus(); 
}

}

