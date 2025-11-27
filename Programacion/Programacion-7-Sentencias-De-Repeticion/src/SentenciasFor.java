import java.util.Scanner;

public class SentenciasFor {
    // cafa una de las letras de una palabra
    public void palabraPalindormo (){
        // For tradicional
        // palabra es palindormo cuando se lee igual de principio a fin a principio
        // oso alli ves sevilla
        //tiene que haver un boolean en algun sitio
        // ANNA
        String frase = "alli ves sevilla";
        frase = frase.replaceAll(" ","");
        boolean esPalindromo = true;
        for (int i = 0; i <frase.length()/2; i++) {
            // comparar cada letra 0->ultimo
            // comparar cada letra 1-> penultimo
            // comparar cada letra 2 -> antepenultima
            // i=0
            // letraUno = l
            // letraDos = a
            char letraUno = frase.charAt(i);
            char letraDos = frase.charAt(frase.length()-1-i);
            if (letraUno != letraDos){
                esPalindromo = false;
                break;
            }
        }
        if (esPalindromo) {
            System.out.println("La palabra es palindromo");
        } else {
            System.out.println("La palabra no es palindormo");
        }
    }

    //calcular el factorial de un numero
    public void calcularFactorial(){
        //calcular sin recursividad
        //5! = 5 * 4 * 3 * 2 * 1
        //7! = 7 * 6 * 5 * 4 * 3 * 2 * 1
        /*
        4 * 3 = 12
        12 * 2 = 24
        24 * 1 = 24
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que numero quieres factorizar:");
        int numFactorizar = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= numFactorizar; i++) {
            factorial *= i;
        }
        System.out.printf("El factorial de %d es %d",numFactorizar,factorial);
    }

    public void recorrerColeccion (){
        int[] numeros = {1,10,90,40,98,76,53};
        // un armario de n posiciones
        /*for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
         */
        for (int item : numeros){
            System.out.println(item);
        }
    }
}
