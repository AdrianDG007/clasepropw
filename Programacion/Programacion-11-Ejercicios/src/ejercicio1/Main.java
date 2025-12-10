package ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        int [] numeros = new int [10];
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        //  0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
        for (int i = 0; i < numeros.length; i++) {
            int aletorio = (int) (Math.random () * 20) + 1;
            numeros [i] = aletorio;
        }
        for (int item : numeros) {
            System.out.print (item + " ");
        }
        do {
            System.out.println ("1 - Imprimir el array");
            System.out.println ("2 - mover a izquierda");
            System.out.println ("3 - mover a ddercha");
            System.out.println ("4 - inverir ");
            System.out.println ("Que opcion quiieres hacer");
            opcion = scanner.nextInt ();
            switch (opcion) {
                case 1 -> {
                    for (int item : numeros) {
                        System.out.print (item + " ");
                    }
                    System.out.println ();
                }
                case 2 -> {
                    int temporal = numeros [0];
                    for (int i = 0; i < numeros.length-1; i++) {
                        numeros [i] = numeros [i + 1];
                    }
                    numeros [numeros.length-1] = temporal;
                }
                case 3 -> {
                    int temporal = numeros [numeros.length-1];
                    for (int i = numeros.length - 1; i > 0; i++) {
                        numeros [i] = numeros [i + 1];
                    }
                    numeros [numeros.length - 1] = temporal;
                }
                case 4 -> {
                    for (int i = 0; i < numeros.length / 2; i++) {
                        int temporal = numeros [i];
                        numeros [i] = numeros [numeros.length - 1];
                        numeros [numeros.length - 1] = temporal ;
                    }
                }
            }
        } while (opcion != 5);
    }
}
