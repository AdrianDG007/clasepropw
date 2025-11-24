import java.util.Scanner;

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
        System.out.println();
        String palabraBool = "true";
        boolean palabraBoolean = Boolean.parseBoolean(palabraBool);
        System.out.println(palabraBoolean );
        System.out.println();
        int numeroEvaluar = 12345;
        String numeroEvaluarStr = String.valueOf(numeroEvaluar);

        boolean acierto = true;
        String aciertStr = String.valueOf(acierto); // "true"

    }
    public void ejercicioNotion4Tema2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que nuymero quieres comprobar si es par");
        int numero = scanner.nextInt();
        boolean numeroPar = numero%2==0;
        System.out.printf("El numeor %d es par: %b ",numero,numeroPar);
        scanner.close();
    }
    public void ejercicioNotion10Tema2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica el salario base");
        int salaraioBaseHora = scanner.nextInt();
        System.out.println("Indica las horas trabajadas");
        int horasTrabajadas = scanner.nextInt();
        System.out.println("Has realizado horas extras");
        boolean horasExtra = scanner.nextBoolean();
        //60
        boolean condicionExtras =  horasTrabajadas>40 && horasExtra;
        //si condicionExtras es true
            int horasExtrasTotal = horasTrabajadas -40;
            int salarioBase = 40* salaraioBaseHora;
            int salarioBaseExtra = horasExtrasTotal* salarioBase*2;
            int salarioTotal = salarioBase+salarioBaseExtra;
            System.out.println("Has cobrado un total de: "+salarioTotal);
            System.out.println("Has cobrado un base de: "+salarioBase);
            System.out.println("Has cobrado un extrad de: "+salarioBaseExtra);
            // ne caso contrario
        salarioBase = 40*salaraioBaseHora; 
    }
}
