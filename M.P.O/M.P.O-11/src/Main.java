import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {

    static ArrayList< Object [] > listaContactos = new ArrayList<>();
    /*public static void main (String [] args) {
        // Colecciones dinamicas
        // Array -> []
        ArrayList <Integer> listaCosas  = new ArrayList <> ();
        // el tamaño de la lista es -> 0
        System.out.println ("El tamaño es de " +  listaCosas.size ());
        listaCosas.add (5);
        listaCosas.add (15);
        listaCosas.add (25);
        System.out.println ("El tamaño actuaizado es de " + listaCosas.size ());
        listaCosas.remove (1);
        System.out.println ("El tamaño acutalizado es de " +  listaCosas.size ());
        System.out.println ("El elemento en posicion 1 es " + listaCosas.size (1));
        for (int i = 0; i < listaCosas.size (); i++) {
            System.out.println (listaCosas.get (i));
        }
    } */
    public static void main ( String [] args ) {
        // Agenda de contactos -> ArrayList< Object [] >
        // poder guardar tantos contactos como necesite
        // cada contacto tiene unos datos fijos -> nombres, apellidos, dni, telefono
        // Object [] {"Borja", "Martin","1234A",12345}
        // Array <  Object [] > -> [{"B","N","1234A",1234}]
        // lista.get (0) -> Objerct [] [0] -> "B"
        // Array <Object> -> [{"B","N","1234A",1234}]
        // lista.get (0) -> ( (Object [] ) Object) [0]
        // [{"B","M","1234A",1234},{"M","L","2345A",2345},{"J","G","3456A",3456}]
        listaContactos.add (new Object [] { "Borja","Martin","1234A",1234 }  );
        listaContactos.add (new Object [] { "Maria","Lopez", "2345A",2345 }  );
        listaContactos.add (new Object [] { "Jaun", "Gomez", "3456A",3456 }  );
        mostrarcontactos ();
        System.out.println ("Vamos a sacar solo el nombre del ultimo contacto");
        listaContactos.addFirst( new  Object [] {"Marta","Gomez","4567A",3456} );
        // Objects [] contacto = listaContactos.get (listaContactos.size () - 1)
        Object [] contacto = listaContactos.getLast();
        System.out.println ( contacto [0] );
        System.out.println ("Procedemos ahora a borrar un elemento");
        //borrarContacto ("1234A");
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Indica que DNI quieres borrar");
        String dni = scanner.next ();
        
        listaContactos.removeIf(new Predicate<Object[]>() {
            @Override
            public boolean test(Object [] objects) {
                return objects [2].equals (dni);
            }
        });
        mostrarcontactos();
    }
    public static void mostrarcontactos () {
        for (Object [] contacto : listaContactos) {
            System.out.println ("Imprimiendo datos del contacto");
            System.out.printf ( "\tNombre: %s Apellido %s DNI: %s Telefono: %d%n",
                    contacto [0] ,contacto [1] ,contacto [2], (int) contacto [3] );
        }
    }
    public static void  borrarContacto (String dni) {
        // listaContactos.remove (posicion) -> borra el elemento de dicha posicion
        for (int i = 0; i < listaContactos.size (); i++) {
            if ( listaContactos.get (i) [2].equals (dni) ) {
                 // listaContactos.remove (i);
                listaContactos.remove( listaContactos.get (i) );
                 break;
            }
        }
    }
}

