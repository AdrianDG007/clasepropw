package ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que tamaño tiene las matrices");
        int tamanio = scanner.nextInt();
        int [] [] matriz1 = new int [tamanio] [tamanio];
        int [] [] matriz2 = new int [tamanio] [tamanio];
        int [] [] sumaMatrices = new int [tamanio] [tamanio];
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                matriz1 [i] [j]  = (int) (Math.random () * 51);
                matriz2 [i] [j]  = (int) (Math.random () * 51);
            }
        }
        System.out.println ("Impreimendo matriz 1");
        imprimirArray (matriz1);
        System.out.println ("Impreimendo matriz 2");
        imprimirArray (matriz2);
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                sumaMatrices [i] [j] = matriz1 [i] [j] + matriz2 [i] [j];
            }
        }
        System.out.println ("Imprimiendo suma");
        imprimirArray (sumaMatrices);
    }
    public static void imprimirArray (int [] [] matriz) {
        for (int [] fila : matriz) {
            for (int item : fila) {
                System.out.print (item + "\t");
            }
            System.out.println ();
        }
    }
}
