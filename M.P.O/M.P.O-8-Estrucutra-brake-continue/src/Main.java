public class Main {
    //break ->para la repeticion en el momento donde se indica. SIEMPRE es la ultima linea del cuerpo de repeticon
    public static void main(String[] args) {
        int acumulador = 0;
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
        for (int i = 0; i < 10; i++) {
            System.out.println( "La tabla del "+ i);
            for (int j = 0; j < 11; j++) {
                System.out.printf("\t El resultado de %d * %d = %d%n", i, j, i*j);
                if (j == 5){
                    break;
                }
            }

        }
        System.out.println("El acumulador tiene valor de " + acumulador);
        System.out.println("Termianando el programa ");
    }
}
