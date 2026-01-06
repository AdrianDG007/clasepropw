package model;

import java.util.ArrayList;
import java.util.List;

public class Campeonato {
    private ArrayList <Carrera> carreras;
    private ArrayList <Coche> coches;

    public Campeonato (List <Carrera> carreras, List <Coche> coches) {
        this.carreras = (ArrayList <Carrera> ) carreras;
        this.coches =   (ArrayList <Coche> ) coches;
    }

    public List <Carrera> getCarreras() {
        return carreras;
    }
    public List <Coche> getCoches () {
        return coches;
    }
}
