package cath;
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
                    flota.agregarMicro(colectivo);
                    System.out.print("Patente micro: ");
                    patente1=Lector.leerString();
                }
            }
            String patente,destino;
            System.out.print("Patente del micro a eliminar: ");
            patente=Lector.leerString();

            //entra al if si se puede eliminar el micro
            if (flota.eliminarMicro(patente)){
                System.out.println("Se ha borrado el micro");
                //volvemos a  checkear q se haya eliminado
                if (flota.buscarMicroPatente(patente) == null){
                    System.out.println("MICRO ELIMINADO");
                }else
                    System.out.println("Micro con patente: "+patente+" NO HA SIDO ELIMINADA");

            }else{
                System.out.println("Ese micro no existia");
            }


            if (flota.eliminarMicro(patente)){
                //se borra porque existia en la flota
                if (flota.buscarMicroPatente(patente) == null){
                    //avisar que se pudo eliminar
                }else{
                    //avisar q no se pudo eliminar
                }
            }else{
                //no se borra nada porque no existia el micro en la flota
                //avisar q ese micro nunca estuvo en la flota
            }
           
            
            System.out.print("Destino para averiguar micro: ");
            destino=Lector.leerString();
            if (flota.buscarMicroDestino(destino) != null){
                System.out.println("El micro que va hacia "+destino+" es "+flota.buscarMicroDestino(destino).getPatente());
            }else{
                System.out.println("Ese micro no existe/ha sido borrado");
            }   
    }
        
}