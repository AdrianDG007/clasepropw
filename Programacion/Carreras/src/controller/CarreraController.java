package controller;

import model.Carrera;
import model.Coche;

import java.util.*;

public class CarreraController {

    private static final Random random = new Random();

    public void simularCarrera(Carrera carrera) {
        boolean terminada = false;

        while (!terminada) {
            for (Coche c : carrera.getParticipantes()) {
                c.avanzar(20 + random.nextInt(31)); // 20-50
                if (c.getKmRecorridos() >= carrera.getKmObjetivo()) {
                    terminada = true;
                }
            }
        }

        carrera.getParticipantes().sort(
                Comparator.comparingInt(Coche::getKmRecorridos).reversed()
        );

        asignarPuntos(carrera.getParticipantes());
        mostrarResultados(carrera.getParticipantes());
    }

    private void asignarPuntos(List<Coche> coches) {
        int[] puntos = {10, 8, 6};
        for (int i = 0; i < coches.size() && i < 3; i++) {
            coches.get(i).sumarPuntos(puntos[i]);
        }
    }

    private void mostrarResultados(List<Coche> coches) {
        System.out.println("=== RESULTADOS CARRERA ===");
        for (int i = 0; i < coches.size(); i++) {
            System.out.println((i+1) + "º - " + coches.get(i).getNombre()
                    + " [" + coches.get(i).getPuntos() + " puntos totales]");
        }
    }
}
