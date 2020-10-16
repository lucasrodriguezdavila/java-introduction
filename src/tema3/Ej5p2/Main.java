package tema3.Ej5p2;

import PaqueteLectura.Lector;
import tema3.Ej4p2.Micro;

public class Main {
    public static void main(String[] args) {
        Flota flota = new Flota();
        System.out.println("Cargue patente"); String patente = Lector.leerString();
        System.out.println("Cargue destino"); String destino = Lector.leerString();
        System.out.println("Cargue hora"); int hora = Lector.leerInt();

        while(!patente.equals("ZZZ000") && !flota.estaCompleta()){
            Micro micro = new Micro(patente, destino, hora);
            flota.agregarMicro(micro);
            //dios mio como me gustaria modularizar
            System.out.println("Cargue patente"); patente = Lector.leerString();
            System.out.println("Cargue destino"); destino = Lector.leerString();
            System.out.println("Cargue hora"); hora = Lector.leerInt();
        }

        System.out.println("Ingrese patente para eliminar"); patente = Lector.leerString();
        flota.eliminarMicro(patente);
        System.out.println("Pertence "+patente+" a la flota?: "+(flota.getMicroPorPatente(patente) != null)); 
        
        System.out.println("Ingrese destino para buscar"); destino = Lector.leerString();
        if (flota.getMicroPorDestino(destino) != null){
            System.out.println("Patente a destino "+flota.getMicroPorDestino(destino).getPatente());
        }
        
    }
}
