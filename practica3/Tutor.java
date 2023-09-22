public class Tutor{
String nombre;
int edad;
Telefono telefono = new Telefono();

public void nombre(String nombre){
this.nombre = nombre;
}
public void edad(int edad){
this.edad = edad;
}
public Telefono getTelefono(){
return telefono;
}
}