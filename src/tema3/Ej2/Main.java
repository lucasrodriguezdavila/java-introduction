package tema3.Ej2;
import PaqueteLectura.Lector;





public class Main {
    public static void main(String[] args) {
        Balanza balanza = new Balanza();
        balanza.iniciarCompra();

        System.out.println("Ingresas peso"); double pesoxKG = Lector.leerDouble();
        System.out.println("Ingresas precio por kilo"); double precioxKG = Lector.leerDouble();

        while(pesoxKG !=0){
            balanza.registrarProducto(pesoxKG, precioxKG);
            System.out.println("Ingresas peso"); pesoxKG = Lector.leerDouble();
            System.out.println("Ingresas precio por kilo");precioxKG = Lector.leerDouble(); 
        }
        System.out.println(balanza.devolverResumenDeCompra());
    }
    
}
