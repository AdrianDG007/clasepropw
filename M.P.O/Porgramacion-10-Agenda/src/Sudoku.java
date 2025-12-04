// instrucciones del sudoku
public class Sudoku {

    private int[] [] cuadrado = new int [4] [4];

    public void  inicarCudrado () {
        // hace todo lo que diga
        System.out.println("Procedemos a iniciar el sudoku");
        rellenarNumeros ();
        mostrarNumeros ();
    }

    public void rellenarNumeros () {
        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado [i].length; j++) {
                int aleatorio;
                do {
                    aleatorio = (int) (Math.random() * 20) + 1;
                } while (estaNumero(aleatorio));
                // estaNuemro (aleatorio)
                // solo si no esta en el cuadrado. En caso de si estar generar otro
                cuadrado [i] [j] = aleatorio; //1-20
                //System.out.print (numeros [i] [j] + "\t");
                // 0,0 0,1 0,2 0,3
                // 1,0 1,1 1,2
                // 2,0 2,1 2,2
                // 3,0 3,1 3,2 3,3
            }
        }
        // guardar aquellos nuemros que no estan repetidos
    }

    private boolean estaNumero (int numero) {
        // el nuermo a comparar OK
        // recorrer que quieres recorrer
            // if comparando OK
        // 10
        // 2 4 6 7
        // 1 4 5 8
        // 42 23 22 12
        for ( int [] fila : cuadrado ){
            for (int item : fila ){
                if (item == numero){
                    return  true;
                }
            }
        }
        return false;
    }

    public void mostrarNumeros () {
        for ( int [] fila : cuadrado ) {
            for ( int item : fila ) {
                System.out.printf ("%d \t",item);
            }
            System.out.println();
        }
    }
}
