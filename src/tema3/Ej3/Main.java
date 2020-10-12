package tema3.Ej3;
import PaqueteLectura.Lector;





public class Main {
    public static void main(String[] args) {
        Entrenador entrenador = new Entrenador();

        System.out.println("Cargar nombre"); entrenador.setNombre(Lector.leerString());
        System.out.println("Cargar sueldo"); entrenador.setSueldo(Lector.leerDouble());
        System.out.println("Cargar campeonatos"); entrenador.setCampeonatos(Lector.leerInt());
    
        System.out.println("Sueldo del entrenador "+entrenador.getNombre()+" : "+entrenador.getSueldo()+". sueldo final: "+entrenador.calcularSueldo());

    }
}
