import java.util.Scanner;

public class Ejercicios {
    public void ejercicioP7 (){
        // 1 - cuantas horaciones tiene
        // 2 - cunatas palabras tiene
        // 3 - cunatas letras tengo
        // 4 - cuantas palabras tiene cada oracion
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica la frase que quires");
        String frase = scanner.nextLine();
        // Esto es solo una frase. Esta es la segunda
        // String [] = [Esto es solo una frase, Esta es la segunda]
        //System.out.println("La frase es " + frase);
        String [] frases  =  frase.split("\\.");
       //Esta es mi forma y es la correcta
        String [] frasePalabra = frase.split(" ");
        String fraseletra = frase.replaceAll(" ","")
                .replaceAll(",", "").replaceAll("\\.","");
        /* Esto lo ha hecho mal el tio y cuenta tambien los puntos y comas
         ya que lo sustitulle por un espacio entonces cuenta doble
        String palabraFrase = frase.replaceAll(","," ").replaceAll("\\.", " ");
        String [] palabras = palabraFrase.split(" ");
         */
        System.out.println("El numero de frases es " + frases.length);
        //Esta es mi forma y es la correcta ya que no  hace cuentas dobles
        System.out.println("El nuermo de palabras es " + frasePalabra.length);
        System.out.println("El numero de letras es " + fraseletra.length());
        /*Esto referencia al comentario de texto extenso justo anterior
        System.out.println("El numero de palabras es " + palabras.length);
        */
        for (String item: frases) {
            int contador = item.split(" ").length;
            System.out.println("El numero de palabras por fraser es " + contador);
            /*
            Cuidado este ejrcicio esta mal hecho est aprte cuenta los espacio
            sin tener en cuenta los espacios de escritura con el punto
             */
        }
    }
    public void ejercicoAdivinacionCincuenta (){
        Scanner scanner = new Scanner(System.in);
        int intetno =6;
        int aleatorio = (int)(Math.random() *5);
        boolean acertado = false;
        System.out.println("El numero es " + aleatorio);
        System.out.println("El numero de intentos que tienes es de 7");
        System.out.println("Intenta adivinar el numero");
        int numero = scanner.nextInt();
        do {
            System.out.println("Introduce el numero para ver si aciertas");
            numero = scanner.nextInt();
            intetno--;
            if (numero == aleatorio){
                System.out.println("Numero hacertado");
                acertado = true;
                break;
            }
            System.out.println("Vas por el intento numoer " +intetno);
            if (numero>aleatorio){
                System.out.println("Numero mas pequeño");
            } else {
                System.out.println("Numero mas grande");
            }
            //System.out.println("Numero incorrcto");
        }while (intetno > 0);
        if (!acertado){
            System.out.println("Lo siento has perdido");
        }
        System.out.println("Terminando juego");
        System.out.printf("Terminado el juego con %d intentos",7-intetno);
        /*
         Esta es mi forma de hacerlo
        while (aleatorio != numero){
            if (numero <= 0 || numero >50){
                System.out.println("El numero no esta comprendido entre 0-50");
            }
            if(intetno == 0) {
                break;
            }
            System.out.println("Intento fallido, intentalootra vez");
            System.out.println("Numero de intentos resntastes " + intetno--);
            numero = scanner.nextInt();
        }
        if (intetno >0){
            System.out.printf("Bravo adivinaste el numero %d y te sobraron %d intentos %n",aleatorio,intetno);
        } else {
            System.out.printf("Te quedaste sin intento no adivinaste el numero %n" +
                    "el nuermo era el %d ",aleatorio);
         */
        }
    public void ejercicio2 (){
        String  palabraSistema = "frase", palabraUsuario;
        Scanner scanner = new Scanner(System.in);
        int intentos = 5, numeroAceirto = 0, numeroAprox = 0, numeroFallos = 0;
        //frase
        //datos
        do {
            System.out.println("Introduce la palabra");
            intentos--;
            palabraUsuario = scanner.next();
            numeroAprox = 0;
            numeroAceirto = 0;
            numeroFallos = 0;
            for (int i = 0; i < 5; i++){
                if(palabraSistema.equals(palabraUsuario)){
                    numeroAceirto = palabraSistema.length();
                    break;
                } else if (palabraSistema.charAt(i) == palabraUsuario.charAt(i)){
                    numeroAceirto++;
                } else if (palabraSistema.contains(String.valueOf(palabraUsuario.charAt(i)))){
                    numeroAprox++;
                } else {
                    numeroFallos++;
                }
            }
            System.out.println("Los aceirtos en este intento son " + numeroAceirto);
            System.out.println("Los aceirtos en este aprox son " + numeroAprox);
            System.out.println("Los aceirtos en este fallos son " + numeroFallos);
        } while (intentos > 0 && numeroAceirto<5);
        if (numeroAceirto == 5){
            System.out.println("Palabra acertada correctamente");
        }
    }
    public void ejercicio3 () {
        Scanner scanner = new Scanner(System.in);
        int precipoPizza = 0;
        String ingredinetesString = "";
        System.out.println("El menu de pizza es: ");
        System.out.println("1. Queso");
        System.out.println("2. Jamon");
        System.out.println("3. Piña");
        System.out.println("4. Tomate");
        System.out.println("5. Peperoni");
        System.out.println("Indica el numero de ingrecdeintes:");
        int numeroIngredeinte = scanner.nextInt();
        for (int i = 0; i < numeroIngredeinte; i++) {
            System.out.println("Indica el ingrediente a agregar");
            int ingrediente  = scanner.nextInt();
            if (ingrediente == 0){
                break;
            }
            switch (ingrediente){
                case 1->{
                    precipoPizza += 10;
                    ingredinetesString += "Queso";
                }
                case 2->{
                    precipoPizza += 15;
                    ingredinetesString += "Jamon";
                }
                case 3->{
                    precipoPizza += 8;
                    ingredinetesString += "Piña";
                }
                case 4->{
                    precipoPizza += 6;
                    ingredinetesString += "Tomate";
                }
                case 5->{
                    precipoPizza += 12;
                    ingredinetesString += "Peperoni";
                }
            }
        }
        //ejecutando despues de un break o cuadno termina el for
        System.out.println("El precio de la pizza es " + precipoPizza);
        System.out.println("Los ingredientes de la pizza son " + ingredinetesString);
    }
    
}



