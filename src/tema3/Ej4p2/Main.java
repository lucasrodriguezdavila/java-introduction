package tema3.Ej4p2;
import PaqueteLectura.Lector;





public class Main {
    public static void main(String[] args) {
        Micro m = new Micro ("ABC123", "Mar del Plata", "5:00");
        int asiento;
        
        System.out.print("Ingrese asiento a ocupar: ");
        asiento = Lector.leerInt();
        
        while((asiento != -1) && (!m.getestaLleno())){
            if((m.getEstaEnRango(asiento)==true)){
                if(m.getEstadoAsiento(asiento) == false){
                    System.out.println("Asiento: " + asiento + " reservado con éxito.");
                    m.setOcuparAsiento(asiento);
                }
                else{
                    System.out.println("El asiento está ocupado, el primer asiento libre para ocupar es: " + m.getPrimerAsientoLibre());
                }
            }
            else{
                System.out.println("El asiento ingresado está fuera de rango.");
            }
            System.out.print("Ingrese asiento a ocupar: ");
            asiento = Lector.leerInt();
        }
        System.out.println("El micro con patente: " + m.getPatente() + " tiene ocupado: " + m.getCantOcupados());
    }
}
