import java.util.Scanner;

public class Ejercicios {
    public void ejercicio3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica un numero de cinco dijtos");
        int numeroAnalizar = scanner.nextInt();
        if (numeroAnalizar > 9999 && numeroAnalizar < 100000) {
            int decenasMil = numeroAnalizar/10000; //1,2345
            System.out.println("Decenas de Mil: "+decenasMil);
            int unidadesMil = (numeroAnalizar%10000)/1000;
            System.out.println("Unidades de Mil: "+unidadesMil);
            int centenas = (numeroAnalizar%1000)/100;
            System.out.println("centenas: "+centenas);
            int decenas = (numeroAnalizar%100)/10;
            System.out.println("Decenas: "+decenas);
            int unidades = (numeroAnalizar%10);
            System.out.println("unidades "+unidades);
        } else {
            System.out.println("Numero incorrecto");
        }
        String  numeroPalabra = String.valueOf(numeroAnalizar);
        int decenasMil = numeroPalabra.charAt(0);
        int unidadessMil = numeroPalabra.charAt(1);
        int centenas = numeroPalabra.charAt(2);
        int decenas = numeroPalabra.charAt(3);
        int unidades = numeroPalabra.charAt(4);

       /*
        char decenasMil = numeroPalabra.charAt(0);

        char unidadessMil = numeroPalabra.charAt(1);
        char centenas = numeroPalabra.charAt(2);
        char decenas = numeroPalabra.charAt(3);
        char unidades = numeroPalabra.charAt(4);

        String numeroPalabra = String.valueOf((numeroAnalizar);
        String decenasMil = String.valueOf(numeroPalabra.charAt(0));
        String unidadessMil = String.valueOf(numeroPalabra.charAt(1));
        String centenas = String.valueOf(numeroPalabra.charAt(2));
        String decenas = String.valueOf(numeroPalabra.charAt(3));
        String unidades = String.valueOf(numeroPalabra.charAt(4));
        
        */
    }
}
