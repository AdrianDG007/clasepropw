import java.util.Scanner;

public class Ejercicio {

    private Scanner lecturaTeclado;

    public void ejercicio1 (){
        lecturaTeclado = new Scanner(System.in);

        System.out.println("Cuantos bocas vais a pedir");
        int numeroBocata = lecturaTeclado.nextInt();
        //boolean bocataAceptado = numeroBocata>=0 && numeroBocata<=20;
        System.out.println("Cuantos bebidas vais a pedir");
        int numeroBebida = lecturaTeclado.nextInt();
        //boolean bebidaAceptado = numeroBebida>=0 && numeroBebida<=20;
        System.out.println("Cuanto cuesta cada bocata");
        double precioBocata = lecturaTeclado.nextDouble();
        //boolean precioAceptadoBocata = precioBocata>=0.00 && precioBocata<=5.00;
        System.out.println("Cuanto cuesta cada bebida");
        double precioBebida = lecturaTeclado.nextDouble();
        //boolean precioAceptadoBebida = precioBebida>=0.00 && precioBebida   <=5.00;
        System.out.println("Cuantas personas entran en la cuenta");
        double personas = lecturaTeclado.nextDouble();
        //boolean personasAceptada = personas>=0 && personas<=10;


        double precioBocatas = numeroBocata*precioBocata;
        double precioBebidas = numeroBebida*precioBebida;
        double costeTotal = precioBebidas+precioBocatas;
        double preicoPersona = costeTotal/personas;

        System.out.printf("El precio de los bocatas es %.2f %n",precioBocatas);
        System.out.printf("El precio de los bebidas es %.2f %n",precioBebidas);
        System.out.printf("El precio total es %.2f %n",costeTotal);
        System.out.printf("El precio por persona es %.2f %n",preicoPersona);
        //Buena practica cuando hya un flujo de datos cerrarlo con nombre.closed();
        lecturaTeclado.close();
    }

    public void ejercicio4 (){
        lecturaTeclado = new Scanner(System.in);
        System.out.println("Cuantos segundos quieres pasar a tiempo: ");
        int segundosTotal = lecturaTeclado.nextInt();
        /*
        lo he hecho yo
        int segundoshora = segundos/3600;
        int restohora = segundos%120;
        int segundosMinutos = restohora/60;
        boolean cantiadadValida = segundosMinutos <= 60;
        int restominuto = segundosMinutos%60;

        System.out.println("Número de segundos: "+segundos);
        System.out.println("Horas: "+segundoshora);
        System.out.println("Minutos: "+segundosMinutos);
        System.out.println("Segundos: "+restominuto);
         */
        int horas = segundosTotal/3600;
        int minutos = (segundosTotal%3600)/60;
        int segundo = segundosTotal%60;

        System.out.println("El numero de horas es "+horas);
        System.out.println("El numero de minutos es "+minutos);
        System.out.println("El numero de horas es "+segundo);
        lecturaTeclado.close();

    }
}
