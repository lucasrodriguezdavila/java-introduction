package tema2;
import PaqueteLectura.Lector;

public class Ej1 {
    //se crea la persona
    public static void main(String[] args) {
        Persona persona = new Persona(Lector.leerString(), Lector.leerInt(), Lector.leerInt());

        System.out.println(persona.toString());


    }
}
