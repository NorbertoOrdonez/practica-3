public class Telefono{

public String pais, lada, numero, numfinal;

public Telefono(){

this.pais = "+52";
this.lada = "981";
this.numero = "1242593";
this.numfinal = pais.concat(" "+lada+numero);
}
public String toString(){
return numfinal;
}
}