package repaso.ej1;

public class Investigador {
    private String nombre;
    private String apellido;
    private int categoria;
    private String especialidad;
    private Subsidio[] subsidios;

    public Investigador(String nombre, String apellido, int categoria, String especialidad){
        setNombre(nombre);
        setApellido(apellido);
        setCategoria(categoria);
        setEspecialidad(especialidad);
        subsidios = new Subsidio[5];
    //getters
    }
    public String getApellido() {
        return apellido;
    }
    public int getCategoria() {
        return categoria;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public String getNombre() {
        return nombre;
    }
    //setters
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //metodos pedidos
    public void agregarSubsidio(Subsidio subsidio){
        int i = 0;
        boolean end = false;
        while(i<5 && !end){
            if (subsidios[i]==null){
                subsidios[i] = subsidio;
                end=true;
            }
            i++;
        }
    }
    //metodos propios
    public double getDineroOtorgado(){
        int i = 0;
        double total = 0;
        while(i<5){
            if (subsidios[i]!=null && subsidios[i].fueOtorgado()){
                total += subsidios[i].getMontoPedido();
            }
            i++;
        }
        return total;
    }
    public int subsidiosSolicitados(){
        int cantidad = 0;
        int i = 0;
        while (i<5){
            if (subsidios[i] != null){
                cantidad++;
            }
            i++;
        }
        return cantidad;
    }
    public void otorgarTodosSubsidios(){
        int i = 0;
        while(i<5){
            if (subsidios[i]!=null && !subsidios[i].fueOtorgado()){
                subsidios[i].setFueOtorgado(true);
            }
            i++;
        }
    }
    public String toString(){
        return " [Nombre y apellido: "+getNombre()+" "+getApellido()+" Categoria: "+getCategoria()+ " Dinero ortogado: " + getDineroOtorgado()+"]";
    }
}
