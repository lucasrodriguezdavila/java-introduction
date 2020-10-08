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
/*
Escriba un programa que lea las alturas de los 15 jugadores de un equipo de
básquet y las almacene en un vector. Luego informe:
- la altura promedio
- la cantidad de jugadores con altura por encima del promedio
NOTA: Dispone de un esqueleto para este programa en Ej03Jugadores.java*/
public class ej3 {
    public static void main(String[] args) {
        
        double [] jugadores = new double[14];
        
        for (int i = 0;i<=14;i++){
            System.out.println("Ingrese una altura:");
            jugadores[i] = Lector.leerDouble();
        }
        
        double promedio = 0;
        double suma = 0;
        for (int i = 0;i<=14;i++){
            suma += jugadores[i];
        }
        promedio = suma /15;
        
        int cantJugadoresAltos = 0;
        for (int i = 0;i<=14;i++){
            if (jugadores[i]>promedio) {cantJugadoresAltos++;}
        }
        System.out.println("La cantidad de jugadores encima del promedio "+promedio+" = "+cantJugadoresAltos);
    
    }
}
