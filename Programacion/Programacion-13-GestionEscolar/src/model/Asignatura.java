package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Asignatura {
    private int id;
    private double calificaicon;

    public Asignatura(int id) {
        this.id = id;
    }
    public void mostrarDatos () {
        System.out.println("id. " + id );
        System.out.println("Calificación: " + calificaicon);
    }
}
