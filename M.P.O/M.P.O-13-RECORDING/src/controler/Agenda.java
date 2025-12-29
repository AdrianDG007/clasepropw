package controler;

import java.util.ArrayList;
import java.util.Objects;
import java.util.function.Predicate;

public class Agenda {
    // atributos -> cualificar
    // [ nombre, apellido,  correo, teléfono, dni]
    private ArrayList < Object [] > listaContactos;
    public Agenda () {
        listaContactos = new ArrayList <> ();
    }
    // métodos -> funciones -acciones uqe quiero que el objeto pueda ejecutar

    // agregar
    public void agregarContacto (Object [] contacto) {
        // si intento agregar un contacto con un dni existente deberia avisar de que no se puede
        listaContactos.add (contacto);
        System.out.println ("Contacto agregado correcto");
    }
    // borrar
    public void borrarContacto (String dni) {
        boolean borrado = listaContactos.removeIf(new Predicate<Object[]>() {
            @Override
            public boolean test (Object [] objects) {
                return objects [4].equals (dni);
            }
        });
        if (borrado) {
            System.out.println("Contacto borrado correctamente");
        } else {
            System.out.println("Contacto no encontrado");
        }
        /*for (Object[] item : listaContactos) {
            if ( item [4].equals (dni) ) {
                listaContactos.remove (item);
                return;
            }
        }
        System.out.println("No encontrado");*/
    }
    // buscar
    public void  buscarContacto (String dni) {
        for (Object [] item : listaContactos) {
            if ( item [4].equals (dni) ) {
                System.out.println ( "Contacto encontrado"  );
                System.out.println ( "Nombre"   + item [0] );
                System.out.println ( "Apellido" + item [1] );
                System.out.println ( "Correo"   + item [2] );
                System.out.println ( "Teléfono" + item [3] );
                //System.out.println ("DNI"     + item [4] );
                return;
            }
        }
        System.out.println ("No encontrado");
    }
    // listar
     public void listaContactos () {
         for (Object [] item : listaContactos) {
             System.out.println ("Contacto encontrado");
             System.out.println ( "Nombre"   + item [0] );
             System.out.println ( "Apellido" + item [1] );
             System.out.println ( "Correo"   + item [2] );
             System.out.println ( "Teléfono" + item [3] );
         }
     }
    public ArrayList < Object [] > getListaContactos() {
        return listaContactos;
    }

    public void setListaContactos (ArrayList < Object [] > listaContactos ) {
        this.listaContactos = listaContactos;
    }
}
