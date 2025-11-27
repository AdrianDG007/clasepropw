public class Main {

    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones();
        // Evaluar el dai de la smeana y si es laborable o no es alborable
        DiasSemanas diaSemana = DiasSemanas.Viernes ;
        //solo funciona si tengo un level de 14 o >
        switch (diaSemana){
            case Lunes,Martes,Miercoles,Jueves -> System.out.println("Laborable ");
            case Viernes -> System.out.println("Laborable, casi lo tenemos ");
            case Sabado, Domingo -> System.out.println("Descasnos");
        }
        MesesAnio mesActual = MesesAnio.Febrero;
        //System.out.println("La fecha de hoy  es 27 de " + MesesAnio.Noviembre+"de 2025 y es " + DiasSemanas.Jueves);
        System.out.printf("La fecha de hoy es %d de %s de %d y es %s estamos en la estacion de %s, los dias que tiene este mes son %d%n"
                ,7 ,MesesAnio.Noviembre, 2025, DiasSemanas.Jueves,MesesAnio.Noviembre.estacion,MesesAnio.Noviembre.diasMes);
        int numero = 12;
        // 0 nuermo 10
        // 10 numero 20
        // 20 numero 30
        // if nuermo >= 0 && numero < 10
        // else if nuermo >= 10 && nuermo < 20
        // else if numero > = 200 && nuermo < 30
        /*final int NUMERO = 12;
        switch (true){
            case (NUMERO >= 0 && NUMERO < 10) ->{
                System.out.println("23123");
            }
            case (NUMERO > 10 && NUMERO < 20) ->{
                System.out.println("23123");
            }
         */
        operaciones.evaluarServidor("ok");
        }
    }

