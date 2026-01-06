package model;

public class Coche {
    private String nombre, marca, modelo;
    private int km;
    private int puntos;

    public Coche (String nombre, String marca, String modelo) {
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.km = 0;
        this.puntos = 0;
    }

    public void avanzar (int km) {
        this.km += km;
    }

    public void resetKm () {
        km = 0;
    }

    public void sumarPuntos (int puntos) {
        this.puntos += puntos;
    }

    public String getNombre () {
        return nombre;
    }

    public int getKm () {
        return km;
    }

    public int getPuntos () {
        return puntos;
    }
}
