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
        //operadorUno = operadorUno +5;
        operadorUno +=5;// en operadorUno guarda la suma de lo que valia operdaorUno + 5
        operadorUno +=15;
        System.out.println("El valor de operador 1 es "+operadorUno);


   }
}

