package cath;
public class FlotaDeMicros {
    int cantMicros;
    private final Micro [] vector;
    
    public FlotaDeMicros(){
        cantMicros=0;
        vector = new Micro[4];
        int i;
        for (i=0;i<4;i++){
            vector[i]=null; //inicializo el vector en null
        }
    }
    public boolean flotaCompleta(){
        return cantMicros >= 4;
        
    }
    public void agregarMicro(Micro colectivo){
        boolean exito=false;
        while (!exito){
            if (vector[cantMicros] == null ){
                vector[cantMicros]=colectivo;
                exito=true;
            }
            //grave
            cantMicros++;
        }
        System.out.println(cantMicros);
        }
    public boolean eliminarMicro(String patente){
        int i=0;
        boolean exito=false;
        while ((i < 4) && (!exito)){
            if (vector[i].getPatente().equals(patente)){
                vector[i]=null;
                cantMicros--;
                exito=true;
            }
            i++;
        }
        return exito;
    }
    public Micro buscarMicroPatente(String patente){
        int i=0;
        boolean exito=false;
        while ((!exito) && (i < 15)){
            if ((vector[i] != null) && (vector[i].getPatente().equals(patente))){
                exito=true;
                return vector[i];
            }
            i++;
        }
        return null;
    }
    public Micro getMicros(int i){
        return vector[i];
    }
    public Micro buscarMicroDestino(String destino){
        int i=0;
        boolean exito=false;
      //while ((!exito) && (i < cantMicro)){
        while ((!exito) && (i < 15)){
            if ((vector[i] != null) && (vector[i].getDestino().equals(destino))){
                System.out.println(i+" Destino "+vector[i].getDestino().equals(destino));
            }
            if ((vector[i] != null) && (vector[i].getDestino().equals(destino))){
                exito=true;
                return vector[i];
            }
            i++;
        }
        return null;
    }
}