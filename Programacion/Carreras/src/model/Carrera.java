package model;

import java.util.List;

public class Carrera {
    private int kmObjetivo;
    private List<Coche> participantes;

    public Carrera(int kmObjetivo, List<Coche> participantes) {
        this.kmObjetivo = kmObjetivo;
        this.participantes = participantes;
    }

    public int getKmObjetivo() { return kmObjetivo; }
    public List<Coche> getParticipantes() { return participantes; }
}
