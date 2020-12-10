package tema5.Ej2;

public class Jugador extends Empleado{
    private int partidosJugados;
    private int goles;

    public Jugador(String nombre, double sueldo, int partidosJugados, int goles){
        super(nombre, sueldo);
        setGoles(goles);
        setPartidosJugados(partidosJugados);
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }
    public int getGoles() {
        return goles;
    }
    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }
    public void setGoles(int goles) {
        this.goles = goles;
    }

    @Override
    public double calcularSueldoACobrar() {
        if (!(getGoles() / getPartidosJugados() >= 0.5))  return super.getSueldoBasico();
        return super.getSueldoBasico()*2;
    }

    
}
