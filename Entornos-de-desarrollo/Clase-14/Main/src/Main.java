import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuanto números quieres analizar ");
        int numeroTotal = scanner.nextInt();
        int [] numeros = new int [numeroTotal];
        int pares = 0;
        int impares = 0;
        System.out.println("Introduce 15 números");
        for (int i = 0; i < 15; i++) {
            System.out.println("Número " + ( i + 1) + ": ");
            numeros [i] = scanner.nextInt();
        }
        Arrays.sort(numeros); // Ordenar
        System.out.println(" \n Números ordenados ( Menor a Mayor)");
        for (int i = 0; i < numeros.length; i++) { // Mostrar y contar pares/ impares
            System.out.println(numeros [i] + " "); // Imprime el numero en la misma linea
            if (numeros [i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("Totales de PARES: " + pares);
        System.out.println("Totales de IMPARES: " + impares);
        scanner.close();
    }
}
