import controller.CampeonatoController;

import java.util.Scanner;

public class Main {

    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);
        int opcion = 0;

        do {
            System.out.println ("Bienvenidos a al Campeonato de Coches:");
            System.out.println ("1- !Creemos un Campeonato!");
            System.out.println ("2- Abandonar el Campeonato.");
            System.out.println ();
            opcion = scanner.nextInt ();
            switch (opcion) {
                case 1 -> {
                    CampeonatoController campeonatoController = new CampeonatoController ();
                    campeonatoController.ejecutarCampeonato ();

                }
                case 2 -> {
                    System.out.println ("Saliendo del campeonato.....");
                }
            }
        }while (opcion != 2);

    }
}
