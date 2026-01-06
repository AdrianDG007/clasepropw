package controller;

import model.*;

import java.util.Comparator;

public class CampeonatoController {

    private CarreraController carreraController = new CarreraController();

    public void ejecutarCampeonato(Campeonato campeonato) {
        int numCarrera = 1;

        for (Carrera carrera : campeonato.getCarreras()) {
            System.out.println("\n=== CARRERA " + numCarrera++ + " ===");

            campeonato.getCoches().forEach(Coche::resetKm);
            carreraController.simularCarrera(carrera);
            mostrarClasificacion(campeonato);
        }
    }

    private void mostrarClasificacion(Campeonato campeonato) {
        campeonato.getCoches().sort(
                Comparator.comparingInt(Coche::getPuntos).reversed()
        );

        System.out.println("\n=== CLASIFICACIÓN GENERAL ===");
        for (int i = 0; i < campeonato.getCoches().size(); i++) {
            Coche c = campeonato.getCoches().get(i);
            System.out.println((i+1) + "º " + c.getNombre() + " - " + c.getPuntos() + " puntos");
        }
    }
}
