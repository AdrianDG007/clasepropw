package ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] nuemros = new int [10];
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        //  0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
        for (int i = 0; i < nuemros.length; i++) {
            int aletorio = (int) (Math.random () * 20) + 1;
            nuemros [i] = aletorio;
        }
        for (int item : nuemros) {
            System.out.print(item + " ");
        }
        do {
            System.out.println("1 - Imprimir el array");
            System.out.println("2 - mover a izquierda");
            System.out.println("3 - mover a ddercha");
            System.out.println("4 - inverir ");
            System.out.println("Que opcion quiieres hacer");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> {
                    for (int item : nuemros) {
                        System.out.print(item + " ");
                    }
                    System.out.println();
                }
                case 2 -> {
                }
                case 3 -> {
                }
                case 4 -> {
                }
            }
        } while (opcion != 5);
    }
}
