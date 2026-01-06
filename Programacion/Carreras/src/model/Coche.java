package model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


public class Coche {
    private String nombre;
    private String marca;
    private String modelo;
    private int kmRecorridos;
    private int puntos;

    public Coche(String nombre, String marca, String modelo) {
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.kmRecorridos = 0;
        this.puntos = 0;
    }

    public void avanzar(int km) {
        kmRecorridos += km;
    }

    public void resetKm() {
        kmRecorridos = 0;
    }

    public void sumarPuntos(int puntos) {
        this.puntos += puntos;
    }

    // Getters
    public String getNombre() { return nombre; }
    public int getKmRecorridos() { return kmRecorridos; }
    public int getPuntos() { return puntos; }
}
