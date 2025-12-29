package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class Contacto {

    private int id;
    private String nombre, apellido, dni;
    private int telefono;

    public Contacto(int id) {
        this.id = id;
    }

    public Contacto (String nombre, String apellido, String dni, int telefono) {
        this.nombre   = nombre;
        this.apellido = apellido;
        this.dni      = dni;
        this.telefono = telefono;
    }
    public void mostrarDatos () {
        System.out.println("Mostrar los datos del contacto " + nombre);
        System.out.println ("id = " + id);
        System.out.println ("apellido = " + apellido);
        System.out.println("dni = " + dni);
        System.out.println("teléfono = " +  telefono);
    }

    public int getId () {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public String getNombre () {
        return nombre;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public String getApellido () {
        return apellido;
    }

    public void setApellido (String apellido) {
        this.apellido = apellido;
    }

    public String getDni () {
        return dni;
    }

    public void setDni (String dni) {
        this.dni = dni;
    }

    public int getTelefono () {
        return telefono;
    }

    public void setTelefono (int telefono) {
        this.telefono = telefono;
    }
}
