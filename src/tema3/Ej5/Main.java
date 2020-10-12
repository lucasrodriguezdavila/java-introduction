package tema3.Ej5;
import PaqueteLectura.Lector;



public class Main {
    public static void main(String[] args) {
        Balanza balanza = new Balanza();
        balanza.iniciarCompra();

        System.out.println("Ingresar desc. de producto"); String desc = Lector.leerString();
        System.out.println("Ingresar peso"); double pesoxKG = Lector.leerDouble();
        System.out.println("Ingresar precio por kilo"); double precioxKG = Lector.leerDouble();

        while(pesoxKG !=0){
            Producto producto = new Producto(pesoxKG, desc);
            balanza.registrarProducto(producto, precioxKG);

            System.out.println("Ingresar desc. de producto");  desc = Lector.leerString();
            System.out.println("Ingresar peso");  pesoxKG = Lector.leerDouble();
            System.out.println("Ingresar precio por kilo");  precioxKG = Lector.leerDouble();
        }
        System.out.println(balanza.devolverResumenDeCompra());
    }   
}
