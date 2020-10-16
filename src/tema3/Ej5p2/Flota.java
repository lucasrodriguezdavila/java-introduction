package tema3.Ej5p2;

import tema3.Ej4p2.Micro;

public class Flota {
    private Micro[] flota = new Micro[15];
    private int cantidadDeMicros;

    public Flota(){
        for (int i  = 0; i<15; i++){
            flota[i] = null;
        }
        cantidadDeMicros = 0;
    }

    public boolean estaCompleta(){
        return cantidadDeMicros >= 15; 
    }
    public void agregarMicro(Micro micro){
        int i = 0;
        boolean stop = false;
        while(!stop){
            if (flota[i] == null){
                flota[i] = micro;
                stop = true;
            }
            i++;
        }
    }
    public boolean eliminarMicro(String patente){
        int i = 0;
        boolean stop = false;
        while(i <15 && !stop){
            if (flota[i].getPatente().equals(patente)){
                flota[i] = null;
                stop = true;
            }
            i++;
        }
        return stop;
    }
    public Micro getMicroPorPatente(String patente){
        int i = 0;
        boolean stop = false;
        while(i <15 && !stop){
            if (flota[i] != null && flota[i].getPatente().equals(patente)){
                stop = true;
                return flota[i];
            }
            i++;
        }
        return null;
    }
    public Micro getMicroPorDestino(String destino){
        int i = 0;
        boolean stop = false;
        while(i <15 && !stop){
            if (flota[i] != null && flota[i].getDestino().equals(destino)){
                stop = true;
                return flota[i];
            }
            i++;
        }
        return null;
    }
    
}
