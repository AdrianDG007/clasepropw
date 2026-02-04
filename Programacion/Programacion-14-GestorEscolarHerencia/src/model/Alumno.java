package model;

public class Alumno extends Persona {
    private int nMatricula;
    private String curso;
    //1 -> vaico
    public Alumno (String nombre, String apellido, int nMatricula){
        //llama al constructor de la superclase
        super(nombre, apellido);
        this.nMatricula = nMatricula;
    }
    public Alumno (String nombre, String apellido, int nMatricula, String curso){
        super(nombre, apellido);
        this.nMatricula = nMatricula;
        this.curso = curso;
    }
    @Override
    public void saludar() {
        System.out.println("Soy un Alumno y voy a aprender un monton");
    }
    @Override
    public void mostrarDatos() {
        System.out.println("nMatricula = " + nMatricula);
        super.mostrarDatos();
        System.out.println("cuso = " + curso);;
    }
    public int getnMatricula() {
        return nMatricula;
    }
    public void setnMatricula(int nMatricula) {
        this.nMatricula = nMatricula;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void realizarExamen() {
    }
}