package repaso.ej1;

public class Main {
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Aurora", 155512);
        Investigador investigador1 = new Investigador("Bob", "Ross",3,"IA");
        Investigador investigador2 = new Investigador("Jack", "Dylan",5,"Seguridad");

        proyecto.agregarInvestigador(investigador1);
        proyecto.agregarInvestigador(investigador2);

        Subsidio subsidio1 = new Subsidio(500, "Limpieza");
        Subsidio subsidio2 = new Subsidio(600, "Papers");
        Subsidio subsidio3 = new Subsidio(700, "Movilidad");
        Subsidio subsidio4 = new Subsidio(800, "Insumos");


        investigador1.agregarSubsidio(subsidio1);
        investigador1.agregarSubsidio(subsidio2);
        investigador2.agregarSubsidio(subsidio3);
        investigador2.agregarSubsidio(subsidio4);

        proyecto.otrogarTodos("Bob", "Ross");

        System.out.println(proyecto.toString());
    }
}
