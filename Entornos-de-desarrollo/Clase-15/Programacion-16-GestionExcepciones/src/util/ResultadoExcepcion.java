package util;

public class ResultadoExcepcion extends Exception{
    // atributos
    // métodos
    // se produce cuando elr resultado es < 0
    public ResultadoExcepcion (String message) {
        super(message);
        System.out.println("Lanzado excepción");
    }
}
