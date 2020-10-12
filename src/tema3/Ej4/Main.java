package tema3.Ej4;

import PaqueteLectura.Lector;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();

        System.out.println("Cargar radio"); circulo.setRadio(Lector.leerDouble());
        System.out.println("Cargar color de linea"); circulo.setColorLinea(Lector.leerString());
        System.out.println("Cargar color de relleno"); circulo.setColorRelleno(Lector.leerString());
    
        System.out.println("Radio "+circulo.getRadio()+"  Color de linea: "+circulo.getColorLinea()+". Area: "+circulo.calcularArea());

    }
}
