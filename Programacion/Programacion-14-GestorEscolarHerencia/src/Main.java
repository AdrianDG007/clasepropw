import model.Alumno;
import model.Persona;
import model.Profesor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Bienvenido al gestor escolar");
        /*Persona borja = new Persona ("Borja","Martin");
        borja.saludar();
        borja.mostrarDatos();*/

        // Alumno alumno = new Alumno ("Borja", "Martin",1234,"DAM");
        Alumno alumno1 = new Alumno("Borja", "Martin", 1234,"Dam");
        Alumno alumno2 = new Alumno("Borja", "Martin", 1234,"Dam");
        Alumno alumno3 = new Alumno("Borja", "Martin", 1234,"Dam");
        Alumno alumno4 = new Alumno("Borja", "Martin", 1234,"Dam");
        // Profesor profesor = new Profesor("Maira", "Lopez",3000);
        Profesor profesor1 = new Profesor("Maira", "Lopez",3000);
        Profesor profesor2 = new Profesor("Maira", "Lopez",3000);
        Profesor profesor3 = new Profesor("Maira", "Lopez",3000);
        Profesor profesor4 = new Profesor("Maira", "Lopez",3000);
        ArrayList <Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(alumno1);
        listaPersonas.add(alumno2);
        listaPersonas.add(alumno3);
        listaPersonas.add(alumno4);
        listaPersonas.add(profesor1);
        listaPersonas.add(profesor2);
        listaPersonas.add(profesor3);
        listaPersonas.add(profesor4);

        for (Persona persona : listaPersonas){
            persona.saludar();
            persona.mostrarDatos();
            //CASTEO
            if (persona instanceof Alumno){
                ((Alumno) persona).realizarExamen();
            } else if (persona instanceof Profesor) {
                ((Profesor)persona).corregirExamen();
            }
            // ((Profesor)persona).corregirExamen();
            // ((Alumno)persona).realizarExamen();
            // persona.realizarExamen(); // solo si soy alumno
            // persona.corregirExamen(); // solo si soy profesor
        }
        //profesor.corregirExamen();

        //profesor.saludar();
        // alumno.saludar();
        /*
        alumno.setNombre    ("Borja");
        alumno.setApellido  ("Martin");
        alumno.setCurso     ("DAM");
        alumno.setNMatricula (1234);
         */
        // alumno.mostrarDatos ();
        // alumno.
    }
}
