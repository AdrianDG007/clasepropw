import java.util.*;

public class Main {

    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Vamos a hacer un cuadrado mágico:");
        System.out.print   ("Introduce el tamaño de la matriz (n): ");
        int n = scanner.nextInt ();

        if (n < 3) {
            System.out.println ("El tamaño debe ser al menos 3.");
            return;
        }

        int [] [] cuadrado;
        int intentos = 0;

        int constanteMagica = n * (n * n + 1) / 2;

        do {
            intentos++;
            cuadrado = genMatrizAlt(n);
        } while ( !cuaMagic (cuadrado, constanteMagica) );

        // Mostrar resultados
        System.out.println (" \n === CUADRADO MÁGICO ENCONTRADO ===");
        impriMatri (cuadrado);
        System.out.println ("\nConstante mágica: " + constanteMagica);
        System.out.println ("Intentos realizados: " + intentos);
    }

    private static int [] [] genMatrizAlt (int n) {
        int [] [] matriz = new int [n] [n];
        ArrayList <Integer> numeros = new ArrayList <> ();
        for (int i = 1; i <= n * n; i++) {
            numeros.add (i);
        }
        Collections.shuffle (numeros);
        //shuffle remueve aleatoriamente los numeros generadosD
        
        int a = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz [i] [j] = numeros.get (a);
                a++;
            }
        }
        return matriz;
    }

    private static boolean cuaMagic(int [] [] matriz, int constante) {
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            int sumaFilas = 0;
            for (int j = 0; j < n; j++) {
                sumaFilas += matriz [i] [j];
                /*
                n = 3;
                cuando termine una fila i++ y la j es ++ por cada columna
                00 01 02 'i' = 0, j = 0 == 00, j = 1 ==01 j = 2 == 02 == 00 + 01 + 02 == si las sumas son iguales a la constante mágica se da como válido y pasas a la siguiente si no rompe
                10 11 12 'i' = 1, j = 0 == 10, j = 1 ==11 j = 2 == 12 == 10 + 11 + 12 == si las sumas son iguales a la constante mágica se da como válido y pasas a la siguiente si no rompe
                20 21 22 'i' = 2, j = 0 == 20, j = 1 ==21 j = 2 == 22 == 20 + 21 + 22 == si las sumas son iguales a la constante mágica se da como válido y pasas columnas si no rompe3
                 */
            }
            if (sumaFilas != constante) return false;
        }


        for (int j = 0; j < n; j++) {
            int sumaColumnas = 0;
            for (int i = 0; i < n; i++) {
                sumaColumnas += matriz[i] [j];
            }
            /*
            n = 3;
            cunado termine una columna j ++ y la i es ++ por cada fila
            00 01 02 'j' = 0, i = 0 == 00, i = 1 ==10 i = 2 == 02 == 00 + 10 + 02 == si las sumas son iguales se da como válido y pasas sumaDiagonal1 si no rompe
            10 11 12 'j' = 1, i = 0 == 01, i = 1 ==11 i = 2 == 21 == 10 + 11 + 12 == si las sumas son iguales se da como válido y pasas sumaDiagonal1 si no rompe
            20 21 22 'j' = 2, i = 0 == 02, i = 1 ==12 i = 2 == 22 == 20 + 21 + 22 == si las sumas son iguales se da como válido y pasas sumaDiagonal1 si no rompe
             */
            if (sumaColumnas != constante) return false;
        }

        int sumaDiagonal1 = 0;
        for (int i = 0; i < n; i++) {
            sumaDiagonal1 += matriz[i] [i];
        }
        if (sumaDiagonal1 != constante) return false;

        int sumaDiagonal2 = 0;
        for (int i = 0; i < n; i++) {
            sumaDiagonal2 += matriz[i] [n - 1 - i];
            /* con n -1 - i, podemos hacer la otra diagonal, ya que y
             n = 3;
             00 01 02 'i' = 0 entonces es 3 - 1 - 0 = 2 == 02
             10 11 12 'i' = 1 entonces es 3 - 1 - 1 = 2 == 11
             20 21 22 'i' = 2 entonces es 3 - 1 - 2 = 2 == 20
             */
        }
        if (sumaDiagonal2 != constante) return false;

        return true;
    }


    private static void impriMatri (int [] [] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz [i].length; j++) {
                System.out.printf ( "%3d ", matriz [i] [j] );
            }
            System.out.println ();
        }
    }
}
