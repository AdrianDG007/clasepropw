import java.util.Scanner;

public class SentenciaSwitch {
    public void usoSwitchInt(){
        //esto es una escritura tradicional
        // botenido por el usuario o por parametros
        int valorUno = 7;
        int valorDos = 7;
        // 1, 5, 7, resto
        String nombre=null;
        switch (valorDos){
            case 1:
                // cuerpo cuando la variable toma valor 1
                nombre = "juan";
                System.out.println("toma valor de 1");
                break;
            case 5:
                // cuerpo cuando la variable toma valor 5
                nombre = "Pedri'";
                System.out.println("toma valor de 5");
                break;
            case 7:
                //cuerpo cuando la variable toma valor 7
                nombre = "Maira";
                System.out.println("toma valor de 7");
                break;
        }
        System.out.println("El nombre resultante es: "+nombre);
        System.out.println("Termina el bloque de switch");
        System.out.println();

        switch (valorDos){
            case 1:
                // cuerpo cuando la variable toma valor 1
                nombre = "juan";
                System.out.println("toma valor de 1");
            case 5:
                // cuerpo cuando la variable toma valor 5
                nombre = "Pedri'";
                System.out.println("toma valor de 5");
            case 7:
                //cuerpo cuando la variable toma valor 7
                nombre = "Maira";
                System.out.println("toma valor de 7");
            default:
                nombre = "sin nombre";
                System.out.println("Valor no contemplado");
        }
        System.out.println("El nombre resultante es: "+nombre);
        System.out.println("Termina el bloque de switch");
        System.out.println();
    }
    public void usoSwitchString(){
        //esto es una escritura tradicional
        String nombre = "Borja";
        switch (nombre.toLowerCase()) {
            case "borja":
                System.out.println("El nombre es borja");
                break;
            case "maria":
                System.out.println("El nombre es maria");
                break;
            case "juan":
                System.out.println("El nombre es Juan");
                break;
            default:
                System.out.println("Nombre no contemplado");
        }
        System.out.println("Terminando de analizar el nombre");
    }
    public void usoSwitchChar(){
        //esto es una escritura tradicional
        char letra = 'A';
        switch (letra){
            case 'A':
                //logica
                break;
            case 'B':
                //logica
                break;
            case 'a':
                //logica
                break;
            case 'C':
                //logica
                break;
            case 'd':
                //logica
                break;
            case 68 :
                //logica
                break;
            default:
                System.out.println("Letra no contemplada");
        }

    }
    public void usoSwitchLambda(){
        int notaUno = 7;
        int notaDos = 7;
        switch (notaUno){
            case 1->{
                System.out.println("Seleccionado el caso 1");
            }
            case 2->{
                System.out.println("Seleccionado el caso 3");
            }
            case 3->{
                System.out.println("Seleccionado el caso 4");
            }
            case 4,5,6,7,8,9->{
                System.out.println("Seleccionado el caso 5");
            }
            default -> {
                System.out.println("Sin contemplar");
            }
            }
        System.out.println();
        }
    public void menuOpciones(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu operaciones");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multi");
        System.out.println("4. Dividir");
        System.out.println("5. modulo");
        System.out.println("Que operaciones quieres hacer");
        int opciones = scanner.nextInt();
        System.out.println("Dime el prime operador");
        int op1 = scanner.nextInt();
        System.out.println("Dime el segundo operador");
        int op2 = scanner.nextInt();
        double resultado = 0;
        switch (opciones){
            case 1->{
                System.out.println("Vas a sumar");
                resultado = op1 + op2;
            }
            case 2->{
                System.out.println("Vas a restar");
                resultado = op1 - op2;
            }
            case 3->{
                System.out.println("Vas a multiplicar");
                resultado = op1 * op2;
            }
            case 4->{
                System.out.println("Vas a Dividir");
                resultado = (double) op1 / op2;
                if (op2==0){
                    System.out.println("El resultado incierto se aplica la regal del 0");
                    //resultado=0;
                } else {
                    resultado = (double)  op1 / op2;
                }
            }
            case 5->{
                System.out.println("Vas a modulo");
                resultado = op1 % op2;
            }
            default ->{
                System.out.println("Datos incorrectos");
            }
        }
        System.out.printf("El reusltado de la operaicon es %.1f %n",resultado);
    }
}


