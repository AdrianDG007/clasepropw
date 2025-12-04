import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
         /*Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el nombre de la persona");
        String  nombre = scanner.next ();
        System.out.println("Dime el apellido de la persona");
        String  apellido = scanner.next ();
        System.out.println("Dime el correo de la persona");
        String  correo = scanner.next ();
        System.out.println("Dime el telefono de la persona");
        int telefono = scanner.nextInt ();
        // nombre, apellido, correo, telefono
        Object [] persona1 = new Object [] {nombre,apellido,correo,telefono};
        Objecto [] [] personas new Objtec [] []
        System.out.println (2los datos del usuario son:");
        for ( Object item : persona1 ) {
            System.out println(item);
          */
        Object [] persona2 = new Object[]{"borja1","martin1","borja1@gmail.com",234};
        System.out.println("Los datos del usuario son: ");
        for ( Object item : persona1 ){
            System.out.println(item);
        }
        /* persona [0] = "Borja";
           persona [1] = "Martin";
           persona [2] = "borja.martin@gmail.com";
           persona [3] = 1234
         */
        int [] [] numeros = new int [4] [4];
        // {{4,6,1},{1,8,9},{11,18,10}};
        // 4   6  1
        // 1   8  9
        // 20 18 19
        // System.out.println(numeros [2][1]);
        // numeros [2][0] = 20;
        // numero.length -> cuenta filas
        //numeros[0] .length -> cuantas columnas tiene la fila indicada (0)
        //rellenamos
        for (int i = 0; i < numeros.length; i++) {
            //System.out.println("Accediendo a las filas" + i);
            for (int j = 0; j < numeros [i].length; j++) {
                //System.out.print(numeros [i] [j] + "\t");
                // 0,0 0,1 0,2
                // 1,0 1,1 1,2
                // 2,0 2,1 2,2
                numeros [i] [j] = (int) (Math.random()*16);
            }
            System.out.println();
        }
        // mostrarmos
        for ( int [] fila : numeros ) {
            for (int item : fila ) {
                System.out.printf ("%d\t",item);
            }
            System.out.println();
        }
    }
}
