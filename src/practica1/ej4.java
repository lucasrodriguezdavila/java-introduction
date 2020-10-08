/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author Lucas
 */
public class ej4 {
    public static void main(String[] args){
        GeneradorAleatorio.iniciar();
        
        double[][] matriz = new double[10][10];
        //se llena la matriz
        for (int i = 0;i<=9;i++){
            for (int j = 0;j<=9;j++){
                double random = GeneradorAleatorio.generarDouble(200);
                matriz[i][j] = random;
            }
        }
        //se imprime la matriz
        for (int i = 0;i<=9;i++){
            System.out.println("- Linea "+(i+1));
            printFila(matriz,i);
        }    
        

        //imprimir la sumatoria de filas 2 a 9 y coumnas 0 a 3
        int sumaTotal = 0;
        
        for (int i = 2;i<=9;i++){
            sumaTotal += getTotalFila(matriz, i);
        }
        for (int i = 0;i<=3;i++){
            sumaTotal += getTotalColumna(matriz, i);
        }
        
        System.out.println("suma total: "+sumaTotal);

        //Generar el vector de 10 posiciones
        int[] vector = new int[10];

        for (int i = 0; i<=9;i++){
            vector[i] = getTotalColumna(matriz, i);
        }

        //se busca un valor ingresado por teclado
        int input = Lector.leerInt();

        int i = 0;
        int j = 0;

        boolean found = false;
        while (i<=9 && !found) {
            while (j <= 9 && !found){
                if (matriz[i][j] == input){
                    System.out.println("Se encontro "+input+" en "+i+" - "+j);
                    found = true;
                }
                j++;
            } 
            i++;
        }
        if (!found) {
            System.out.println("No se ha encontrado ese numero");
        }
    }
    
    static int getTotalColumna(double[][] matriz, int columna) {
        int total = 0;
        for (int i = 0;i<=9;i++){
            total += matriz[i][columna];
        }
        return total;
    }
    
    static int getTotalFila(double[][] matriz, int fila) {
        int total = 0;
        for (int i = 0;i<=9;i++){
            total += matriz[fila][i];
        }
        return total;
    }
    
    static void printFila(double[][] matriz, int fila) {
        for (int i = 0;i<=9;i++){
            System.out.print("  - Contenido en "+(fila+1)+" : "+(i+1)+" = "+matriz[fila][i]);
        }
    }
}
