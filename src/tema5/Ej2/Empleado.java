package tema5.Ej2;

public abstract class Empleado {
    private String nombre;
    private double sueldoBasico;

    public Empleado(String nombre, double sueldoBasico){
        this.setNombre(nombre);
        this.setSueldoBasico(sueldoBasico);
    }

    public String getNombre() {
        return nombre;
    }
    public double getSueldoBasico() {
        return sueldoBasico;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
    public String toString(){
        return "Nombre: "+getNombre()+" Sueldo: "+calcularSueldoACobrar();
    }
    public abstract double calcularSueldoACobrar();

}
