package controller;

import lombok.*;
import model.*;

import java.util.*;

public class CampeonatoController {

    private Campeonato campeonato;
    private CarreraController carreraController;
    private Scanner scanner;

    public CampeonatoController () {
        scanner = new Scanner (System.in);
        carreraController = new CarreraController ();

        crearCampeonato ();
    }

    private void crearCampeonato () {
        System.out.print ("Número de carreras: ");
        int n = scanner.nextInt ();

        ArrayList <Carrera> carreras = new ArrayList <> ();

        for (int i = 0; i < n; i++) {
            System.out.print ("Km de la carrera " + (i + 1) + ": ");
            int km = scanner.nextInt ();
            boolean add = carreras.add(new Carrera(km, carreraController.getCoches()));
        }

        campeonato = new Campeonato ( carreras, carreraController.getCoches () );
    }

    public void ejecutarCampeonato () {
        int num = 1;

        for (Carrera carrera : campeonato.getCarreras () ) {
            System.out.println ("\n=== CARRERA " + num + "===");

            campeonato.getCoches ().forEach (Coche :: resetKm);
            carreraController.simularCarrera (carrera);
            mostrarClasificacion ();

            num++;
        }
    }

    private void mostrarClasificacion () {
        campeonato.getCoches ().sort (
                Comparator.comparingInt (Coche::getPuntos).reversed ()
        );

        System.out.println ("\nPodio:");
        for (int i = 0; i < campeonato.getCoches ().size (); i++) {
            Coche c = campeonato.getCoches ().get (i);
            System.out.println ( (i + 1) + "º " +
                    c.getNombre () + " - " +
                    c.getPuntos () + " puntos");
        }
    }
}
