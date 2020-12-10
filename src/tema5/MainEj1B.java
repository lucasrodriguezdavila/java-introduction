package tema5;
import PaqueteLectura.Lector;



public class MainEj1B {
    public static void main(String[] args) {
        System.out.println("Ingrese 3 lados para un triangulo"); 
            double lado1 = Lector.leerDouble();
            double lado2 = Lector.leerDouble();
            double lado3 = Lector.leerDouble();
        System.out.println("Ingrese un color de relleno y un color de linea para el triangulo");
            String crt = Lector.leerString();
            String clt = Lector.leerString();
        System.out.println("Ingrese 1 lado para el cuadrado");
            double lado = Lector.leerDouble();
        System.out.println("Ingrese un color de relleno y un color de linea para el cuadrado");
            String crc = Lector.leerString();
            String clc = Lector.leerString();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3, crt, clt);
        Cuadrado cuadrado = new Cuadrado(lado, crc, clc);

        System.out.println(triangulo.toString());
        System.out.println(cuadrado.toString());
    }
}
