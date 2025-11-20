import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Proyecto metodos");
        System.out.println("Vamos a relaizar llamada a metodos");
        Calculadora operacionesMatematicas = new Calculadora();
        //operacionesMatematicas.sumar(1, 4);
        //operacionesMatematicas.sumar(2, 4);
        //operacionesMatematicas.restar(8, 5);
        //operacionesMatematicas.restar(8, 9);
        //System.out.println(operacionesMatematicas.mutli(7,3)*4);//21->84
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Que numero quieres validar");
        int numeroValidar = lectorTeclado.nextInt();
        System.out.println("El nuermo que se intenta validar tiene como resultado:"
                +operacionesMatematicas.validarNumero(numeroValidar));
    }
    public static void saludar (String nombre){
        System.out.println("Hola " + nombre);
        System.out.println("Encantado de saludarte,vamos a practiar");
        System.out.println("Vamos, a practicar el llamado de metodos");
        System.out.println("Vamos, a por el dia");
    }
    public static void despedir(){
        System.out.println("A cerrrar el portatil, a pasar la tarede a casa");
    }
}
