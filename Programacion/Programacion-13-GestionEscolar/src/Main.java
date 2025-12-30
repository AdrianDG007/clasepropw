import model.Alumno;
import model.Asignatura;

public class Main {
    public static void main (String [] args) {
        Asignatura programacion = new Asignatura(1,6.0);
        Asignatura sistemas     = new Asignatura(2,6.0);
        Asignatura marcas       = new Asignatura(3);
    /*Alumno borja1  = new Alumno();
    borja1.set*/
        Alumno borja   = new Alumno (1, 2, 3);
        // asi1 = id -1 -- calif = 0, asi2 = di - 2 --calif = 0, asi3 = id - 3 --calif = 0
        Alumno celia   = new Alumno (programacion, sistemas, marcas);
        // asi1 = programacion --calif = 0, asi2 = sistemas --calif = 0, asi3 = marcas --calif = 0
        Alumno claudia = new Alumno (programacion, sistemas, marcas);
        // asi1 = programacion --calif = 0, asi2 = sistemas --calif = 0, asi3 = marcas --calif = 0
    }
}
