package tema2.cath;
import PaqueteLectura.Lector;

public class Main {
    public static void main(String[] args) {

        FlotaDeMicros flota = new FlotaDeMicros();

        String patente1;
        System.out.print("Patente micro: ");
        patente1=Lector.leerString();

            while ((!flota.flotaCompleta()) && (!patente1.equals("ZZZ000"))){
                Micro colectivo = new Micro();
                colectivo.setPatente(patente1);
                if (!colectivo.getPatente().equals("ZZZ000")){
                    System.out.print("Destino: ");
                    colectivo.setDestino(Lector.leerString());
                    System.out.print("Horario salida: ");
                    colectivo.setHoraSalida(Lector.leerDouble());
                    System.out.print("Patente micro: ");
                    patente1=Lector.leerString();
                    //agrego el micro a la flota
                    flota.agregarMicro(colectivo);
                }
            }

            String patente,destino;
            System.out.print("Patente del micro a eliminar: ");
            patente=Lector.leerString();
            if (flota.eliminarMicro(patente)){
                System.out.println("Se ha borrado el micro");
            }else{
                System.out.println("Ese micro no existia");
            }
            if (flota.buscarMicroPatente(patente) == null){
                // si buscarMicroPatente(patente)== null entonces NO lo encontro
                System.out.println("MICRO ELIMINADO");
            }else
                System.out.println("PATENTE: "+flota.buscarMicroPatente(patente)+" NO HA SIDO ELIMINADA");
            
            System.out.print("Destino para averiguar micro: ");
            destino=Lector.leerString();
            if (flota.buscarMicroDestino(destino) != null){
                System.out.println("El micro que va hacia "+destino+" es "+flota.buscarMicroDestino(destino));
            }else{
                System.out.println("Ese micro no existe/ha sido borrado");
            }   
    }
}
        