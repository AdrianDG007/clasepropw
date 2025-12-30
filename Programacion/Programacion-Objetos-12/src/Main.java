import model.Coche;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        /*int numero = 5;

        Integer nuermoComplejo =  5;

        Scanner scanner = new Scanner(System.in);*/
        // esto es la instancia de la clase -> un objeto de la clase
        Coche vw = new Coche ("VW", "Tiguan","23456A", "Blanco", 150);
        // marca = VW, modelo = Tiguan, bastidor = 23456A, color  = blanco
        // cv = 150, velocidad = 0
        // precio = 0.0
        Coche ford = new Coche ("Ford","Focus","1234A","verde",150);
        // marca = Ford, modelo = Focus, bastidor = 1234A, color = verde
        // cv = 250, velocidad = 0
        // precio = 0.0
        Coche opel = new Coche ();
        // marca = null, modelo = null, bastidor = null, color = null
        // cv = 0, velocidad = 0
        // precio = 0
        Coche mercedes = new Coche ("Mercedes", "Clase C", 80000);
        // marca = Mercedes, modelo = Clase C, bastidor  = null, color = null
        // cv = 0, velocidad = 0
        // precio = 80000
        Coche audi = new Coche ("Audi", "Etron", 120000, 500);
        System.out.println (mercedes);
        System.out.println (audi);
        System.out.println (ford);
        audi.mostrarDatos();
        mercedes.mostrarDatos();
        ford.mostrarDatos();
        // audi.setCv (70);
        // System.out.println ("Los cv que tiene el audi son" + audi.getCv ());
        // System.out.println ("El modelo del audi es " + audi.getModelo ());
        // System.out.println("Los CV que tiene el audi son " + audi.getCv());
        // marca = Audi, modelo = Etron, precio = 120000, bastidor = null, color = null
        // cv = 570, velocidad = 0
        // precios = 120000
        Coche coche = new Coche ();
    }
}
