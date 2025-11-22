public class Operadores {
    public void cambioTipos(){
        double numeroDecimal =5.98;
        int numeorEntero = 6;

        double numero = numeorEntero;
        System.out.println((int)numeroDecimal);
        System.out.println((double) numeorEntero);
        System.out.println( );
        String palabra = "12";
        int numeroPalabra = Integer.parseInt(palabra);
        int numeroPalabras = Integer.valueOf(palabra);
        System.out.println(numeroPalabra+10);
        System.out.println(numeroPalabras+10);


    }
}
