package tema2;
import PaqueteLectura.Lector;





public class Ej6 {
    public static void main(String[] args) {
        Partido[] partidos = new Partido[10];

        // bloque de carga de datos (como me gustaria modulizar esto)
        System.out.println("Introduzca equipo local"); String local = Lector.leerString();
        System.out.println("Introduzca goles del local"); int golesLocal = Lector.leerInt();
        System.out.println("Introduzca equipo visitante"); String visitante = Lector.leerString();
        System.out.println("Introduzca goles del visitante"); int golesVisitante = Lector.leerInt();

        int x = 0;
        while (x<20 && !visitante.equals("ZZZ")){
            Partido partido = new Partido();
            
            partido.setLocal(local);
            partido.setGolesLocal(golesLocal);
            partido.setVisitante(visitante);
            partido.setGolesVisitante(golesVisitante);

            partidos[x] = partido;

            System.out.println("Introduzca equipo local");  local = Lector.leerString();
            System.out.println("Introduzca goles del local");  golesLocal = Lector.leerInt();
            System.out.println("Introduzca equipo visitante");  visitante = Lector.leerString();
            System.out.println("Introduzca goles del visitante");  golesVisitante = Lector.leerInt();

            x++;
        }

        int golesBoca = 0;
        int ganadosRiver = 0;
        int empates = 0;
        x = 0;
        while  (partidos[x] != null && x <20){
            if (partidos[x].hayEmpate()){
                empates++;
                System.out.println("Hubo empate");
            }
            if(partidos[x].getLocal().equals("Boca")){
                golesBoca += partidos[x].getGolesLocal();

            }
            if(partidos[x].hayGanador() && partidos[x].getGanador().equals("River")){
                ganadosRiver++;
            }
            x++;
        }

        System.out.println("Porcentaje de empates: %"+(empates/10)*100);
        System.out.println("Goles de boca de visitante: "+golesBoca);
        System.out.println("Ganados de river: "+ganadosRiver);
    }
}
