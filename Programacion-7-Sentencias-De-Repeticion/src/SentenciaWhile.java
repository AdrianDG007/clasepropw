import java.util.Scanner;

public class SentenciaWhile {
    public void evaluacionNumero(){
        Scanner scanner = new Scanner(System.in);
        int intentos = 1;
        int aleatorio = (int)(Math.random() *11);
        System.out.println("Introduce un numero a ver si es el correcto");
        int numero =scanner.nextInt();
        while (aleatorio != numero){
            System.out.println("Intento fallido, por favor intentalo de nuevo");
            numero = scanner.nextInt();
            intentos ++;
        }
        /*while (numero<10){
            System.out.println("El numero introducido es menor que 10");
            System.out.println("Introduce un nuermo nuevo");
            numero = scanner.nextInt();
        }

         */
        System.out.printf("Numero acertado el numero en %d intentos",intentos);
        //System.out.println("La evaluacion se ha temrinado");
    }
    public void  imprimirMenu (){
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        int opcion;
        /*do {
            System.out.println("Ejecutando sentencia repetitiva con do-whiel");
            System.out.println("Introduce el numero nuevamente");
            numero =scanner.nextInt();
        }while (numero%2==0);
         */
        do {
            System.out.println("1- Suma");
            System.out.println("2- Resta");
            System.out.println("3- Multiplicaicon");
            System.out.println("4- Division");
            System.out.println("5- Salir");
            System.out.println("Indica que operacion quieres realizar");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1->{
                    System.out.println("Opcion seleccionada suma");
                    //la logica de la suma
                }
                case 2->{
                    System.out.println("Opcion seleccionada resta");
                    //la logica de la resta
                }
                case 3->{
                    System.out.println("Opcion seleccionada multiplicacion");
                    //la logica de la multiplicacion
                }
                case 4->{
                    System.out.println("Opcion seleccionada division");
                    //la logica de la divisiones
                }
                case 5->{
                    System.out.println("Saliendo....");
                }
                default ->{
                    System.out.println("Opcione no contemplada");
                }
            }
        }while ( opcion != 5);
        System.out.println("Finalizando la repeticion");
    }
}
