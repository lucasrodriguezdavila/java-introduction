package repaso.ej1;

public class Proyecto {
    private String nombre;
    private int codigo;
    private String director;
    private Investigador[] investigadores;

    public Proyecto(String nombre, int codigo){
        this.nombre = nombre;
        this.codigo = codigo;
        investigadores = new Investigador[50];
        this.director = "";
    }
    //getters
    public int getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDirector() {
        return director;
    }
    //setters
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    //metodos pedidos
    public void agregarInvestigador(Investigador investigador){
        int i = 0;
        boolean end = false;
        while(i<50 && !end){
            if (investigadores[i]==null){
                investigadores[i] = investigador;
                end=true;
            }
            i++;
        }
    }
    public double dineroTotalOtorgado(){
        double total = 0;
        int i = 0;
        while(i<50){
            if (investigadores[i]!=null){
                total += investigadores[i].getDineroOtorgado();
            }
        }
        return total;
    }
    public int cantidadDeSubsidios(String nombre, String apellido){
        boolean found = false;
        int i = 0;
        int total = -1;
        while(!found && i<50){
            if (investigadores[i]!=null && investigadores[i].getNombre().equals(nombre) && investigadores[i].getApellido().equals(apellido)){
                total = investigadores[i].subsidiosSolicitados();
            }
            i++;
        }
        return total; //retornara -1 si ese investigador no existe o no puede ser encontrado
    }
    public void otrogarTodos(String nombre, String apellido){
        boolean found = false;
        int i = 0;
        while(!found && i<50){
            if (investigadores[i]!=null && investigadores[i].getNombre().equals(nombre) && investigadores[i].getApellido().equals(apellido)){
                investigadores[i].otorgarTodosSubsidios();
            }
            i++;
        }
    }

    public String toString(){
        String proyecto = "Nombre: "+getNombre() + " Codigo: " +getCodigo() +" Director: "+ getDirector()+" Investigadores: ";
        int i = 0;
        while (i<50) {
            if (investigadores[i] != null){
                proyecto += investigadores[i].toString();
            }
            i++;
        }
        return proyecto;
    }

}
