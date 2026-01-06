import controller.CampeonatoController;
import model.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número de coches: ");
        int nCoches = sc.nextInt();
        sc.nextLine();

        List<Coche> coches = new ArrayList<>();

        for (int i = 0; i < nCoches; i++) {
            System.out.print("Nombre coche: ");
            String nombre = sc.next();
            coches.add(new Coche(nombre, "Marca", "Modelo"));
        }

        System.out.print("Número de carreras: ");
        int nCarreras = sc.nextInt();

        List<Carrera> carreras = new ArrayList<>();
        for (int i = 0; i < nCarreras; i++) {
            System.out.print("Km carrera " + (i+1) + ": ");
            carreras.add(new Carrera(sc.nextInt(), coches));
        }

        Campeonato campeonato = new Campeonato(carreras, coches);
        new CampeonatoController().ejecutarCampeonato(campeonato);
    }
}
