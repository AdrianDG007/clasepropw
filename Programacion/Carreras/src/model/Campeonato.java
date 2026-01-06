package model;

import java.util.List;

public class Campeonato {
    private List<Carrera> carreras;
    private List<Coche> coches;

    public Campeonato(List<Carrera> carreras, List<Coche> coches) {
        this.carreras = carreras;
        this.coches = coches;
    }

    public List<Carrera> getCarreras() { return carreras; }
    public List<Coche> getCoches() { return coches; }
}
