public class Calculadora {
    public void sumar(int op1, int op2){
        int resultado = op1+op2;
        System.out.println("El resultado de la suam es "+resultado);

    }
    public void  restar (int op1, int op2){
        int resultado = op1-op2;
        System.out.println("El resultao de la resta es "+resultado);
    }
    public int mutli (int op1, int op2){
        int resultado = op1*op2;
        System.out.println("El metodo esta listo para retornar");
        return resultado;
    }
    public boolean validarNumero (int numeroValidar){
        return numeroValidar>0;
    }
}

