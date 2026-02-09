package model;

public class Llamada {

    // solo si quiero tengo metodos abs
    private long nOrigen, nDestino;
    private int duracion;
    private double coste;

    public Llamada () {}
    public Llamada (long nOrigen,long nDestino, int duracion) {
        this.nDestino = nDestino;
        this.duracion = duracion;
        this.nOrigen  = nOrigen;
        // coste = 0;
    }


    public void mostrarDatos () {
        System.out.println ("nOrigen = "  + nOrigen);
        System.out.println ("nDestino = " + nOrigen);
        System.out.println ("duracion = " + nOrigen);
        System.out.println ("coste = "    + nOrigen);
    }

    public long getnOrigen () {
        return nOrigen;
    }

    public void setnOrigen (long nOrigen) {
        this.nOrigen = nOrigen;
    }

    public long getnDestino () {
        return nDestino;
    }

    public void setnDestino (long nDestino) {
        this.nDestino = nDestino;
    }

    public int getDuracion () {
        return duracion;
    }

    public void setDuracion (int duracion) {
        this.duracion = duracion;
    }

    public double getCoste () {
        return coste;
    }

    public void setCoste (double coste) {
        this.coste = coste;
    }
}
