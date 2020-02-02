package KesaHarkat;

public class LuokanOppilas{
String nimi;
boolean istuu;
public int oppilasmaara;

LuokanOppilas(){
oppilasmaara = oppilasmaara + 1;	
}

LuokanOppilas(String nimi, boolean istuu){
this.oppilasmaara = oppilasmaara + 1;	// Ei toimi, kuten haluaisin...
this.nimi = nimi;
this.istuu = istuu;
}


public void setIstuu(boolean istuu){
this.istuu = istuu;
}


public String Istuu(){
if (istuu == true)
return " istuu.";
else 
return " ei istu.";
}

public void tulosta() {
	System.out.println(nimi + Istuu());
}

public String toString()
{
	return nimi + Istuu();
}

public int oppilaitaYhteensa(){
return oppilasmaara;
}
}
