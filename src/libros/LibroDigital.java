package src.libros;

public class LibroDigital extends Libro {

        private String formato; 
        private double tamMB;

        public LibroDigital(String formato, double tamMB, String titulo, double precioBase, String[] autores){
            super(titulo,precioBase,autores);
            this.formato = formato;
            this.tamMB = tamMB;
        }

        public LibroDigital(String formato, double tamMB, String titulo, double precioBase){
            super(titulo,precioBase);
            this.formato = formato;
            this.tamMB = tamMB;
        }
}
