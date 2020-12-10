package src.libros;

public abstract class Libro {
    private String titulo; 
    private double precioBase; 
    private String [] autores; // vector de 8 
    private int totalAutores; // dimL
    
    //constructor con autores
    public Libro (String titulo, double precioBase, String[] autores) {
        this.titulo = titulo;
        this.precioBase = precioBase;
        this.autores = new String [8];
        this.autores = autores;
        this.totalAutores= autores.length;  //diml sera del tamaño del array de los autores que se pasan
    }

    //constructor sin autores
    public Libro (String titulo, double precioBase) {
        this.titulo = titulo;
        this.precioBase = precioBase;
        this.autores = new String [8];
        for (int i = 0; i< 8;i++){
            autores[i]= null; 
        }
        this.totalAutores=0; 
    }

    @Override
    public String toString(){
        return "precio "+precioBase+" autores "+autores[0]+autores[1];
    }
}
