package src.libros;

public class Main {
    public static void main(String[] args) {
        
        LibroDigital libro = new LibroDigital("pdf",40,"odisea",400);
        String texto = libro.toString();
        System.out.println(texto);
    }

}
