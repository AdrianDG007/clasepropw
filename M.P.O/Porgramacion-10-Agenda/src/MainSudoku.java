import java.util.Scanner;

public class MainSudoku {
    public static void main(String [] args) {
        Sudoku sudoku1 = new Sudoku();
        // sudoku1.inicarCudrado();
        // sudoku1.rellenarNumeros();
        // sudoku1.mostrarNumeros();
        // acceso a todos los metodos de la clase y sus propiedades
        // int [4] [4];
        // Sudoku sudoku2 = new Sudoku();
        // acceso a todos los metodos de la clase y sus propiedades
        // int [4] [4];
        // sudoku.inicarCudrado();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("1 rellenar cuadrado");
            System.out.println("2 listar cuadrado");
            System.out.println("Que opcion quiereres hacer");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> {
                    sudoku1.rellenarNumeros();
                    System.out.println("Rellenando");
                }
                case 2 ->{
                    sudoku1.mostrarNumeros();
                }
            }
        } while (opcion != 3);
    }
}
