public class Main {
    public static void main(String[] args) {
        System.out.println("Proyecto metodos");
        System.out.println("Vamos a realizar llamdas a metodos");
        /*
        String data="Laura";
        saludar(data);
        despedir();
        System.out.println();
        data = "Borja";
        saludar(data);
        despedir();
        */
        /*
        System.out.println("Hola Borja");
        System.out.println("Encantado de saludarte, vamos a practicar");
        System.out.println("Vamos a practicar el llamado de metodo");
        System.out.println("Animo no deacaigas en tu tarea");

        System.out.println("Hola Juan");
        System.out.println("Encantado de saludarte, vamos a practicar");
        System.out.println("Vamos a practicar el llamado de metodo");
        System.out.println("Animo no deacaigas en tu tarea");


        System.out.println("Hola Maria");
        System.out.println("Encantado de saludarte, vamos a practicar");
        System.out.println("Vamos a practicar el llamado de metodo");
        System.out.println("Animo no deacaigas en tu tarea");


        System.out.println("Hola Claudia");
        System.out.println("Encantado de saludarte, vamos a practicar");
        System.out.println("Vamos a practicar el llamado de metodo");
        System.out.println("Animo no deacaigas en tu tarea");

         */
       //Operaciones.sumar(4,4);
        int nuermo;
        Operaciones operacionesMatematicas = new Operaciones();
        operacionesMatematicas.sumar(1, 4);
        operacionesMatematicas.restar(8, 2);

    }
    public static void saludar(String nombre){
        System.out.println("Hola "+nombre);
        System.out.println("Encantado de saludarte,vamos a practicar");
        System.out.println("Vmaos a practicar el llamado de metodos");
        System.out.println("Vamos a por el dia");
    }
    public static void despedir(){
        System.out.println("A cerrar el portatil, a pasr la tarde en casa ");
    }
}
