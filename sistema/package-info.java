package sistema;

class Estudiante {
    String nombre;
}

public class Main {
    public static void main(String[] args) {
        Estudiante e = new Estudiante();
        e.nombre = "Oscar";
        System.out.println(e.nombre);
    }
}