package tema2.cath;
public class FlotaDeMicros {
    int cantMicros;
    private Micro [] vector;
    
    public FlotaDeMicros(){
        cantMicros=0;
        vector = new Micro[4];
        }
    public boolean flotaCompleta(){
        return cantMicros==4;
    }
    public void agregarMicro(Micro colectivo){
        vector[cantMicros]=colectivo;
        cantMicros++;
    }
    public boolean eliminarMicro(String patente){
        int i;
        boolean exito=false;
        for(i=0; i<cantMicros; i++){
            if (vector[i].getPatente().equals(patente)){
                vector[i]=null;
                cantMicros--;
                exito=true;
            }else{
                exito=false;
            }
        }
        return exito;
    }
    public String buscarMicroPatente(String patente){
        int i=0;
        boolean exito=false;
        while ((!exito) && (i < cantMicros)){
            //ese lugar en memoria existe?
            if (vector[i]!=null){
            exito = vector[i].getPatente().equals(patente);
            i++;
            }
        }
        if (exito){
            return vector[i].getPatente();
        }else{
            return null;
        }
    }
    public String buscarMicroDestino(String destino){
        int i=0;
        boolean exito=false;
        while ((!exito) && (i < cantMicros)){
            //ese lugar en memoria existe?
            if (vector[i]!=null){
                exito = vector[i].getDestino().equals(destino);
            }
            i++;
        }
        if (exito){
            return vector[i].getPatente();
        }else{
            return null;
        }
    }
}