package tema3.Ej4p2;

public class Micro {
    int horaSalida;
    String destino, patente;
    boolean[] asientos = new boolean[20];
    int asientosOcupados;

    public Micro(String patente, String destino, int horaSalida){
        this.patente = patente;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientosOcupados = 0;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }
    public String getPatente() {
        return patente;
    }
    public String getDestino() {
        return destino;
    }
    public int getHoraSalida() {
        return horaSalida;
    }
    public int getAsientosOcupados() {
        return asientosOcupados;
    }
    public boolean estaLleno(){
        return 20 >= asientosOcupados;
    }
    public boolean estaEnRango(int asiento){
        return asiento-1 >= 0 && asiento-1 < 20;
    }
    public boolean estaOcupado(int asiento){
        return asientos[asiento-1] == true;
    }
    public void ocuparAsiento(int asiento){
        asientos[asiento-1] = true;
        asientosOcupados++;
    }
    public void liberarAsiento(int asiento){
        asientos[asiento-1] = false;
        asientosOcupados--;
    }
    public int primerAsientoLibre(){
        int i = 0;
        boolean found = false;
        while(found && i<20){
            if(asientos[i]){
                found = true;
                return i+1;
            }
            i++;
        }
        return -1;        
    }

}
