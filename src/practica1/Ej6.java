package practica1;
import PaqueteLectura.Lector;
public class Ej6 {
    public static void main(String[] args) {
        
        int operation;
        int[] usesPerOperation = new int[5];
        boolean closeBank = false;

        while (!closeBank) {
            operation = Lector.leerInt();
            System.out.println("Ingrese operacion (0-5)");
            if (operation == 5) closeBank = true;
            usesPerOperation[operation]++;
        }

        int usesMax = 0;
        int indexMax = 0;
        for (int i = 0; i<=4; i++){
            if (usesPerOperation[i] > usesMax){
                usesMax = usesPerOperation[i];
                indexMax = i;
            }
        }
        System.out.println("La operacion mas usada fue "+indexMax+" con "+usesMax+" usos.");
    }   
}
