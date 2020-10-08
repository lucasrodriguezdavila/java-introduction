/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;


/**
 *
 * @author Lucas
 */

//- Escriba un programa que imprima en consola el factorial de todos los números
//entre 1 y 9. ¿Qué modificación debe hacer para imprimir el factorial de los
//números impares solamente?

public class ej2 {
     public static void main(String[] args){
        for (int j = 9; j>0; j--){
            if (j%2 != 0) {
                int result = 1;
                for (int i = j; i>0; i--) {
                    result = result * i;
                }
                System.out.println("Resultado de "+j+": "+result);
            }
        }
     }
}