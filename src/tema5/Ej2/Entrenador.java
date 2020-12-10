package tema5.Ej2;

public class Entrenador extends Empleado{

    int campeonatos;

    public Entrenador(String nombre, double sueldo, int campeonatos){
        super(nombre, sueldo);
        this.campeonatos = campeonatos;
    }

    public int getCampeonatos() {
        return campeonatos;
    }
    public void setCampeonatos(int campeonatos) {
        this.campeonatos = campeonatos;
    }

    public double calcularSueldoACobrar(){
        if (campeonatos > 10) {return super.getSueldoBasico()+5000;}
        else if (5 >= campeonatos && campeonatos <=10) { return super.getSueldoBasico() + 30000;}
        else if (1 >= campeonatos && campeonatos <=4){ return super.getSueldoBasico() + 5000;}
        else {return super.getSueldoBasico();}
    }

    public String toString(){
        return super.toString()+" Campeonatos ganados: "+getCampeonatos();
    }
}
