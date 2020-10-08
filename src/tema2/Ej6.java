package tema2;
import PaqueteLectura.Lector;





public class Ej6 {
    public static void main(String[] args) {
        Partido[] partidos = new Partido[10];

        for (int i =0;i<=9;i++){
            Partido partido = new Partido();
            partido = loadPartido(partido);
            partidos[i] = partido;
        }

        int golesBoca = 0;
        int ganadosRiver = 0;
        int empates = 0;
        for (int i =0;i<=9;i++){
            if (partidos[i].hayEmpate()){
                empates++;
            } else if(partidos[i].getLocal() == "Boca" ){
                golesBoca += partidos[i].getGolesLocal();
            } else if(partidos[i].hayGanador() && partidos[i].getGanador() == "River"){
                ganadosRiver++;
            }
        }

        System.out.println("Porcentaje de empates: %"+(empates/10)*100);
        System.out.println("Goles de boca de visitante: "+golesBoca);
        System.out.println("Ganados de river: "+ganadosRiver);
    }

    public static Partido loadPartido(Partido partido){
        System.out.println("Introduzca equipo local");
        partido.setLocal(Lector.leerString());
        System.out.println("Introduzca goles del local");
        partido.setGolesLocal(Lector.leerInt());

        System.out.println("Introduzca equipo visitante");
        partido.setVisitante(Lector.leerString());
        System.out.println("Introduzca goles del visitante");
        partido.setGolesVisitante(Lector.leerInt());
        return partido;
    }
}
