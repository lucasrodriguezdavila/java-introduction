package tema2;

import PaqueteLectura.Lector;

public class Ej4 {
    public static void main(String[] args) {
        Persona[][] casting = new Persona[5][8];
        
        System.out.println("Carga dni"); int dni = Lector.leerInt();
        System.out.println("Carga nombre"); String nombre = Lector.leerString();
        System.out.println("Carga edad"); int edad = Lector.leerInt();

        int x = 0;
        int y = 0;
        while (!nombre.equals("ZZZ") && x<=4){
            while (!nombre.equals("ZZZ") && y<=7){
                Persona persona = new Persona();

                persona.setDNI(dni);
                persona.setEdad(edad);
                persona.setNombre(nombre);

                casting[x][y] = persona;

                System.out.println("Carga dni");  dni = Lector.leerInt();
                System.out.println("Carga nombre");  nombre = Lector.leerString();
                System.out.println("Carga edad");  edad = Lector.leerInt();
                y++;
            }
            y = 0;
            x++;
        }
        
        x = 0; y = 0;
        while (casting[x][y] != null & x <4){
            while (casting[x][y] != null && y < 7){
                System.out.println(casting[x][y].toString());
                y++;
            }
            y = 0;
            x++;
        }
    }
}
