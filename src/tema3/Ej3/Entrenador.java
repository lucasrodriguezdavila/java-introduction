package tema3.Ej3;

public class Entrenador {
    String nombre;
    double sueldo;
    int campeonatos;

    public Entrenador(String nombre, double sueldo, int campeonatos){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.campeonatos = campeonatos;
    }
    public Entrenador(){
    }
    public String getNombre() {
        return nombre;
    }
    public int getCampeonatos() {
        return campeonatos;
    }
    public double getSueldo() {
        return sueldo;
    }
    public void setCampeonatos(int campeonatos) {
        this.campeonatos = campeonatos;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double calcularSueldo(){
        if (campeonatos > 10) {return sueldo+5000;}
        else if (5 >= campeonatos && campeonatos <=10) { return sueldo + 30000;}
        else if (1 >= campeonatos && campeonatos <=4){ return sueldo + 5000;}
        else {return sueldo;}
    }
}
