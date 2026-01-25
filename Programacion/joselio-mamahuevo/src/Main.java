import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Que numero quieres:");
            N = scanner.nextInt();
            if (N <= 0) {
                System.out.println("Numero no valido");

            }
        } while (N <= 0);
        System.out.println(" Tu numero es " + N);
        for (int i = 1; i < N; i++) {

            if (i % 2 == 0) {
                System.out.print(-i);
            } else {
                System.out.print(i);
            }
            if (i == N - 1) {
                System.out.print( ".");
            } else {
                System.out.print(",");
            }
        }
    }
}