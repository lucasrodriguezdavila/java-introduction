package practica1;
import PaqueteLectura.Lector;
/**
 *
 * @author Lucas
 */
public class Ej5 {
    public static void main(String[] args) {
        String[][] edificio = new String[8][4];

        for (int i = 0;i<=7;i++){
            for (int j = 0;j<=3;j++){
                System.out.println("Ingrese una persona");
                String persona = Lector.leerString();
                edificio[i][j] = persona;
            }
        }
        
        int contador = 0;
        for (int i = 0;i<=7;i++){
            for (int j = 0;j<=3;j++){
                if (edificio[i][j] != null){
                    contador++;
                }
            }
        }
        System.out.println("Ingresaron "+contador+" personas al edificio");
    }
}
