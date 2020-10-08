package tema2;
import PaqueteLectura.Lector;

public class Ej5 {
    public static void main(String[] args) {
        String[] mensaje = new String[10];

        for(int i=0;i<=9;i++){
           mensaje[i] = Lector.leerString();
        }

        for(int i=0;i<=9;i++){
            System.out.print(mensaje[i].charAt(0));
        }
    }
}
