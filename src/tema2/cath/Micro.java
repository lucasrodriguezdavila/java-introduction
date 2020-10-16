package tema2.cath;

public class Micro {
    private String patente;
    private String destino;
    private double horaSalida;
    private final boolean [] vector;
    private int cantAsientosOcupados;
    
    public Micro(){
        vector=new boolean[19];
    }
    
    public Micro(String patente,String destino,double horaSalida){
        int i;
        this.patente=patente;
        this.destino=destino;
        this.horaSalida=horaSalida;
        cantAsientosOcupados=0;
        vector = new boolean[19];
        for (i=0;i<19;i++){
            vector[i]=false;
        }
    }
    public void setPatente(String patente){
        this.patente=patente;
    }
    public void setDestino(String destino){
        this.destino=destino;
    }
    public void setHoraSalida(double horaSalida){
        this.horaSalida=horaSalida;
    }
    public String getPatente(){
        return patente;
    }
    public String getDestino(){
        return destino;
    }
    public double getHoraSalida(){
        return horaSalida;
    }
    public int getCantAsientosOcupados(){
        return cantAsientosOcupados;
    }
    public boolean microLleno(){
        return cantAsientosOcupados == 19;
    }
    public boolean validarAsiento(int asiento){
        return (asiento >= 0) && (asiento < 19);
    }
    public boolean devolverEstadoAsiento(int asiento){
            return vector[asiento];
    }   
    public void ocuparAsiento(int asiento){
        vector[asiento]=true;
        cantAsientosOcupados++;
    }
    public void liberarAsiento(int asiento){
        vector[asiento]=false;
        cantAsientosOcupados--;
    }
    public int devolverPrimerAsientoLibre(){
        int i=0;
        while (vector[i] != false){
            i++;
        }
        return i;
    }
}