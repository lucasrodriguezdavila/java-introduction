package tema1;
import PaqueteLectura.Lector;

public class test {
public static void main(String[] args) {
    int i=1;
    int factorial = 1;
    
    System.out.print("Numero a saber factorial: ");
    int num = Lector.leerInt();	
    for (i=1;i <= num;i++){
        factorial=factorial*i;
    }
    System.out.println(num+"! = "+factorial);
}
}