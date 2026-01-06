package controller;

import model.Carrera;
import model.Coche;

import java.util.*;

public class CarreraController {
    private ArrayList <Coche> coches;
    private Scanner scanner;
    private Random random;

    public CarreraController () {
        scanner = new Scanner (System.in);
        coches = new ArrayList <> ();

        crearCoches ();
    }

    private void crearCoches () {
        System.out.print ("Número de coches: ");
        int n = scanner.nextInt ();
        scanner.nextLine ();

        for (int i = 0; i < n; i++) {
            System.out.print ("Nombre del piloto " + (i + 1) + ":");
            String nombre = scanner.nextLine ();
            System.out.print ("Nombre de la marca:");
            String marca = scanner.nextLine ();
            System.out.print ("Nombre del modelo:");
            String modelo = scanner.nextLine ();
            coches.add ( new Coche (nombre, marca, modelo) );
        }
    }

    public void simularCarrera (Carrera carrera) {
        boolean fin = false;

        while (!fin) {
            for ( Coche c : carrera.getCoches () ) {
                c.avanzar ( (int) (Math.random () * 31) );
                if ( c.getKm () >= carrera.getKmObjetivo () ) {
                    fin = true;
                }
            }
        }

        carrera.getCoches ().sort (
                Comparator.comparingInt (Coche::getKm).reversed ()
        );

        asignarPuntos ( carrera.getCoches () );
        mostrarPodio  ( ( ArrayList <Coche> ) carrera.getCoches () );
    }

    private void asignarPuntos(List <Coche> lista) {
        int [] puntos = { 10, 9, 8, 7, 6, 5, 4, 3 , 2, 1};
        for (int i = 0; i < lista.size () && i < 10; i++) {
            lista.get (i) .sumarPuntos ( puntos [i] );
        }
    }

    private void mostrarPodio(ArrayList<Coche> lista) {
        System.out.println("Puntos:");
        for (int i = 0; i < Math.min ( 3, lista.size () ); i++) {
            System.out.println( (i + 1) + "º - " +
                    lista.get (i).getNombre () +
                    " " + lista.get (i).getPuntos () + " puntos");
        }
    }

    public List<Coche> getCoches() {
        return coches;
    }
}
