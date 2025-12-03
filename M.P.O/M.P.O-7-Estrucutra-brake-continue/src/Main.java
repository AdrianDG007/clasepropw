public class Main {
    //break ->para la repeticion en el momento donde se indica. SIEMPRE es la ultima linea del cuerpo de repeticon
    //return -> retorna un valor (el metodo). el metodo termina!!!!el reutrn es la ultima linea de metodo
    // continue -> vs a "pasar" el turno cunado te indique
    // if -> evalua una condicion y decide si entrea en un cuerpo o en otro
    // if ternario .> decide el VALOR de una variable depedeindo de una condicion logica
    public static void main(String[] args) {
        int acumulador = 1000;
        //repetitiva
        /*
        for (int i = 0; i < 10; i++) {
            System.out.println("Repitiendo" + i);
            System.out.println("Terminando");
            if (i == 3) {
                break;
            }
        }*/
        /* int acumulador = 0;
        do {
            acumulador += (int) (Math.random()*41);
            if (acumulador > 100 && acumulador < 120){
                //pase algo logicamente
                 System.out.println("Te acercas peligrosametne, terminamos el programa");
                break;
            }
        }while (acumulador <= 301);*/
        /*
        if (acumulador ==10 ){
            System.out.println("El valor ya lo has alcanzado44");
            //break;
        }*/
        /*for (int i = 0; i < 10; i++) {
            System.out.println( "La tabla del "+ i);
            for (int j = 0; j < 11; j++) {
                System.out.printf("\t El resultado de %d * %d = %d%n", i, j, i*j);
                if (j == 1){
                    break;
                }
            }

        }

         */
        /*do {
            acumulador *= (int) (Math.random() * 41);
            return;
        }while (acumulador <= 301);
         */
        /*for (int i = 0; i < 10; i++) {
            System.out.println("Imprimmiendo datos en posicion");
            return;
        }

         */
        /*do {
            acumulador += (int)  (Math.random() * 41);
            return;
        }
        while (acumulador<301);

         */
        /*System.out.println("El acumulador tiene valor de " + acumulador);
        System.out.println("Termianando el programa ");
        int [] numeros = {1, 4, 34, 56, -12, 56, 78, 12, -56};
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                continue;
            }
            System.out.println(numeros[i]);
        }

         */
        /*if (nota > 5){
            System.out.println("Examen aprobado");
        } else {
            System.out.println("Examen suspenso");
        }

         */
        //variable = condicion logica ? " val de a variable cuiando es true" : "val de la variable cuando es false"
        int nota = 5;
        String resultado = nota < 5 ? "suspesno" : "aprobado";
        char letraNota = nota < 5 ? 'A' : 'P';


    }
}
