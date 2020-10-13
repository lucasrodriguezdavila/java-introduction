package tema3.Ej4p2;
import PaqueteLectura.Lector;





public class Main {
    public static void main(String[] args) {
        Micro micro = new Micro("ABC123", "Mar del plata", 500);
        
        System.out.println("Ingrese el asiento que desea reservar:"); int asiento = Lector.leerInt();
        int primerAsientoLibre;

        while(asiento != -1 && micro.estaLleno()){
            if (micro.estaOcupado(asiento)){
                primerAsientoLibre = micro.primerAsientoLibre();
                System.out.println("Error: este asiento esta ocupado, el primer asiento libre es "+primerAsientoLibre);
            } else {
                System.out.println("Asiento "+asiento+" reservado con exito.");
                micro.ocuparAsiento(asiento);
            }
            System.out.println("Ingrese el asiento que desea reservar:"); asiento = Lector.leerInt();
        }

        System.out.println(" - Asientos ocupados del micro "+micro.getPatente()+": "+micro.getAsientosOcupados());
    }
}
