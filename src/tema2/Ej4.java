package tema2;

import PaqueteLectura.Lector;

public class Ej4 {
    public static void main(String[] args) {
        Persona[][] casting = new Persona[5][8];

        Persona persona = new Persona();
        persona = loadPersona(persona);
        int x = 0;
        int y = 0;
        while (persona.getNombre() != "ZZZ" && x<=4){
            while (persona.getNombre() != "ZZZ" && y<=7){
                casting[x][y] = persona;
                persona = loadPersona(persona);
                y++;
            }
            x++;
        }
    
        for(int i = 0;i<=4;i++){
            for(int j=0;j<=4;j++){
                System.out.println(casting[i][j].toString());
            }
        }
    }
    public static Persona loadPersona(Persona persona) {
        System.out.println("Introduzca DNI");
        persona.setDNI(Lector.leerInt());
        System.out.println("Introduzca nombre");
        persona.setNombre(Lector.leerString());
        System.out.println("Introduzca edad");
        persona.setEdad(Lector.leerInt());
        return persona;
    } 
}
