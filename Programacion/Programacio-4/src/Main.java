import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando programa de operadores");
        Operadores operadoresVariables = new Operadores();
        //operacionesVariable.OperaciosAritmeticas();
        operadoresVariables.operadoresAritmeticos();
        System.out.println();
        operadoresVariables.operadoresAsignacion();
        System.out.println();
        Calculadora miCalculadora = new Calculadora();
        operadoresVariables.operadoresComparacion();
        System.out.println();
        //BufferedReader
        operadoresVariables.operadoresLogicos();
        Scanner lectroTeclado = new Scanner(System.in);
        System.out.println("Dime tu nomrbe y apellido");
        String nombre = lectroTeclado.nextLine();
        System.out.println("Que salario quieres ganar");
        double salarioEntrada =lectroTeclado.nextDouble();
        System.out.println("Que edad tienes");
        int edad = lectroTeclado.nextInt();
        System.out.println("Tienes permiso de conducir");
        boolean conducir = lectroTeclado.nextBoolean();
        operadoresVariables.evalaurCandidato(salarioEntrada,edad,conducir, nombre);
    }
}
