/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import PaqueteLectura.Lector;
/**
 *
 * @author Lucas
 */
public class ej1 {
    public static void main(String[] args){
//        Escriba un programa que imprima en consola el factorial de un número N
//(ingresado por teclado, N > 0). Ejemplo: para N=5 debería imprimir 5! = 120
        System.out.println("Ingrese un numero");

        int result = 1;
        for (int i = Lector.leerInt(); i>0; i--) {
            result = result * i;
        }
        System.out.println("Resultado: "+result);
    }
}