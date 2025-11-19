public class Operadores {
    public void  operadoresAritmeticos() {
        //unarios
        int operandoUno = 5;
        //incremento -> para poder hacer un contador
        operandoUno++; //le suma uno al valor que ya tenia
        operandoUno++;
        operandoUno++;
        operandoUno++;
        System.out.println("El valor del opreando uno de los incrementos " + operandoUno);
        //decremento -> le resta uno al valor que ya enia ->
        operandoUno--;
        operandoUno--;
        operandoUno--;
        System.out.println("El valor del operando uno depsues de los decrementos es " + operandoUno);
        //binarios -> dos operadores: suma (+( resta (-) multi(*) div (/) modulo-resto division (%)
        operandoUno = 8;
        int operandoDos = 3;
        int suma = operandoUno + operandoDos;
        System.out.println("El resultado de la suma es "+suma);
        System.out.println("El reusltado de la suma de op1+op2 es "+(operandoUno+operandoDos));
        int resta = operandoUno-operandoDos;
        System.out.println("El resultado de la resta es "+resta);
        System.out.println("El resultado de la resta de op1-op2 es " + (operandoUno-operandoDos));
        int multi = operandoUno * operandoDos;
        System.out.println("El resultado de la multiplicaicon es "+multi);
        System.out.println("El resultado de la mulptiplicacion de op1*op2 "+(operandoUno * operandoDos));
        double div = (double)operandoUno/operandoDos;
        System.out.println("El resultado de la divison es "+div);
        System.out.println("El resultado de la divison  de op1/op2 es "+((double)operandoUno / operandoDos));
        int modulo = operandoUno%operandoDos;
        System.out.println("El modulo de la divison es "+modulo );
        System.out.println("El modulo de la divison de op1%op2 es "+(operandoUno%operandoDos));
        //me sirve para saber si un numero es par o impar

    }

    public void operadoresAsignacion(){
        int operadorUno = 10;
        int operadorDos =6;
        //operadorUno = operadorUno +5;
        operadorUno +=5;// en operadorUno guarda la suma de lo que valia operdaorUno + 5
        //operadorUno +=15;
        operadorUno +=operadorDos;
        System.out.println("El valor de operador 1 es "+operadorUno);
        operadorUno-=5; // 16 operadorUno = operadorUno -5
        operadorUno*=2; // 32 operadorUno = operadorUno *2
        operadorUno%=2; // 0  operadorUno = operadorUno %2
        System.out.println("El resultado de las asignaciones completas es de "+operadorUno);


   }

   //seran utilizados cmo condicionespara ejecutar una parte del codigo u otra
   public void operadoresComparacion(){
       int operandoUno = 10;
       int operandoDos = 20;
       boolean resultado= operandoUno>operandoDos;
       System.out.println("El resultado de la comparacion es "+resultado);
       resultado = operandoUno<operandoDos;
       System.out.println("El resultado de la comparcion "+resultado);
       resultado = operandoUno<=operandoDos;
       resultado = operandoUno>=operandoDos;
       resultado = operandoUno==operandoDos;
       resultado = operandoUno!=operandoDos;
       //cuanto quires cobrar
       //cuantos años tienes
       //tienes carnet
   }

   public void  operadoresLogicos(){
        int sueldo = 20000;
        int edad = 35;
        boolean conducir = true;
        //conducir = !conducir;
       System.out.println("El candidato peude conducir: "+!conducir);
        //cuando quiere cobrar menos de 30000 y tienes menos de 40 y puede conducir
        boolean candidadtoValido = sueldo<30000 && edad<40 && conducir; //true
       candidadtoValido = (sueldo<20000) || (edad<25 || conducir && sueldo>25000 && edad> 60);
                        // F           || T || T||
                        //T && F && F -> F
       System.out.println("El candidato es valido: "   +candidadtoValido);
   }

   public void evalaurCandidato(double sueldo, int edad, boolean conducir, String nombre){
        boolean resultado= sueldo<=20000 && edad<40 &&conducir;
       System.out.println("Evaluando al candidato "+nombre);
       System.out.println("La evaluacion del canididato es: "+resultado);
   }
}

