package tema1;
import tema2.Persona;
import PaqueteLectura.Lector;

public class Ejercicio2 {
    public static void main(String[] args) {
        int dimF=3,i,edad,DNI;
        String nombre;
        Persona [] vector;
        vector = new Persona[dimF];
        
        for (i=0;i<dimF;i++){    //cargo el vector 
            Persona alguien = new Persona();
            System.out.print("Escriba su nombre: ");
            nombre=Lector.leerString();
            alguien.setNombre(nombre);
            System.out.print("Escriba su edad: ");
            edad=Lector.leerInt();
            alguien.setEdad(edad);
            System.out.print("Escriba su DNI: ");
            DNI=Lector.leerInt();
            alguien.setDNI(DNI);
        }
        
        int contEdad=0,menDNI=999,posicion=0;
        for (i=0;i<dimF;i++){
            if (vector[i].getEdad() > 65){
                contEdad=contEdad+1;
            }
            if (vector[i].getDNI() < menDNI){
                menDNI=vector[i].getDNI();
                posicion=i;
            }
        }
        System.out.println("Hay "+contEdad+" personas mayores de 65 anios");
        System.out.println("La persona con menor DNI es: "+vector[posicion].toString());
        
    }
}