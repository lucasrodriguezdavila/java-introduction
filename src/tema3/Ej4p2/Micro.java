package tema3.Ej4p2;

public class Micro {
    int patente, horaSalida;
    String destino;
    boolean[] asientos = new boolean[20];
    int asientosOcupados;

    public Micro(int patente, String destino, int horaSalida){
        this.patente = patente;
        this.destino = destino;
        this.horaSalida = horaSalida;
    }
    public void setPatente(int patente) {
        this.patente = patente;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }
    public int getPatente() {
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
        int x = 0;
        for (int i = 0; i<20; i++){
            if (asientos[i]){
                x++;
            }
        }
        return asientos.length >= asientosOcupados;
    }
}
