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

//CLASE PRINCIPAL
public class Main {

//5. PASS BY VALUE
public static void cambiar(int x) {
 x = 50;
}

public static void main(String[] args) {

	// 1. TYPE CASTING
	   double numDouble = 9.78;
	   int numInt = (int) numDouble;
	   System.out.println("Casting: " + numInt);

	   // 2. PACKAGES
	   System.out.println("Uso del package sistema");

	   // 3. ENUMS
	   Dia hoy = Dia.LUNES;
	   System.out.println("Hoy es: " + hoy);

	   // 4. INITIALIZER BLOCK
	   EjemploInitializer e = new EjemploInitializer();
	   System.out.println("Valor x: " + e.x);
	   
	// 5. PASS BY VALUE
	   int a = 10;
	   cambiar(a);
	   System.out.println("Pass by Value: " + a);

	   // 6. EXCEPTION HANDLING
	   try {
	       int r = 10 / 0;
	   } catch (Exception ex) {
	       System.out.println("Error: División por cero");
	   }

	// 7. ACCESS SPECIFIERS
	   System.out.println("Uso de private y public en encapsulación");
	   
	   // 8. ENCAPSULATION
	   PersonaEncapsulada p = new PersonaEncapsulada();
	   p.setNombre("Oscar");
	   System.out.println("Nombre: " + p.getNombre());
	   
	   // 9. BASICS OF OOP
	   Persona per = new Persona();
	   per.nombre = "Osacar";
	   per.saludar();
	}
	}
