package sistema;

//3. ENUMS
enum Dia {
LUNES, MARTES, MIERCOLES, JUEVES, VIERNES
}

//8. ENCAPSULATION + 7. ACCESS SPECIFIERS
class PersonaEncapsulada {
private String nombre; // atributo privado (access modifier)

public void setNombre(String nombre) { // setter
   this.nombre = nombre;
}

public String getNombre() { // getter
   return nombre;
}
}

//4. INITIALIZER BLOCK
class EjemploInitializer {
int x;

{
 x = 10;
 System.out.println("Bloque inicial ejecutado");
}
}
//9. BASICS OF OOP
class Persona {
String nombre;

public void saludar() {
 System.out.println("Hola soy " + nombre);
}
}
