
/**
 *
 */
public class Main {
//Este comentario es solo de una linea->ANOTACION O ACLARACION BREVE de lo que hace el metodo
    
String nombreMio ="Borja completo clase";

    /**
     * Comentario de documentocion Javadoc
     * @param args esto es la informacion de entrada
     * @return int vale para retornar el resultado de la operaicon
     * @version 1.0
     * @author Borja Martin
     */
    public static void main(String[] args){
        System.out.println("Esta impresion la acabo de hacer");
        System.out.println("Hola,este es mi primer programa en Java \nEstoy es la sugunda linea\n");
        System.out.println("Tercera linea");
        System.out.println("Cuarta linea");
        /*
        Este comentario lo voy a utilizar si ncesito una explicacion
        un poco mas larga de lo que hace el metodo o de la duda que me
        genera el metodo
        */
        String nombreCompleto; //null
        String nombreCompleto1 ="Borja Martin Herrera"; // Los String son palabras y van entrecomillados dobles
        nombreCompleto1 = "Borja M. H. "; // Para dar otro valor
        //System.out.println(nombreCompleto1.toLowerCase());
        final String NUMERO_DNI = "123123A";
        Integer edadCompleja =23;
        System.out.println("El valor maximo de un int es "+Integer.MAX_VALUE);
        System.out.println("El valor minimo de un int es "+Integer.MIN_VALUE);
        System.out.println("El valor de pi es "+Math.PI);
        int edad = 41;
        edad = edad +1;
        edad = edad +1;
        Float alturaCompleja = 1.65f;
        float altura = 1.71f;
        double peso = 70.23456789;
        Character letraCompleja = 'A';
        char letraCarnet = 'E';
        char letraCarnetNumero =342;//ASCI-> caracter raro -< cifrador / descifrador
        boolean experiencia = true;
        // Object [] datos = {nombreCompleto,edad,altura,peso,letrasCarnet,experiencia};
        Object cosa = true;
        cosa = 2;
        cosa = "dato";
        System.out.println("Mi nombre es "+nombreCompleto1);
        System.out.println("Mi edad es "+edad+" años");
        System.out.println("Mi altura es de "+altura+" cm");
        System.out.println("Mi peso es de "+peso+" kg");
        System.out.println("La letra de mi DNI es "+letraCarnet);
        System.out.println("Tengo experiencia "+experiencia);
    }

    public void  metodoCarton(){
        // TODO pendiente creral el carton con numeros aletorios sin repetir
        System.out.println("Mi metodo particular");

    }
public void otroMetodo() {
        String nombreMio ="asdaasda";
        System.out.println(this.nombreMio);
}
}
