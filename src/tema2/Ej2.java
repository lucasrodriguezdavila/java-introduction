package tema2;

import PaqueteLectura.Lector;

public class Ej2 {
    public static void main(String[] args) {
        Persona[] personas = new Persona[15];
        for (int i = 0;i<=15;i++){
            Persona persona = new Persona();
            personas[i] = loadPersona(persona);
        }
        
        int contador = 0;
        for (int i = 0;i<=15;i++){
            if (personas[i].getDNI() > 65) {
                contador++;
            }
        }
        System.out.println("Personas mayores a 65 anios: "+contador);
    
        Persona personWithMinorDNI = new Persona("empty", -1,0);
        personWithMinorDNI.setDNI(-1);
        for (int i = 0;i<=15;i++){
            if (personas[i].getDNI() < personWithMinorDNI.getDNI()) {
                personWithMinorDNI = personas[i];
            }
        }
        System.out.println(personWithMinorDNI.toString());
    }

    public static Persona loadPersona(Persona persona) {
        System.out.println("Introduzca DNI");
        persona.setDNI(Lector.leerInt());
        System.out.println("Introduzca nombre");
        persona.setNombre(Lector.leerString());
        System.out.println("Introduzca edad");
        persona.setEdad(Lector.leerInt());
        return persona;
    } 
}
