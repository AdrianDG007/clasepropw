package ejercicio4;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        String [] bomobo1 = new String [5];
        String [] bomobo2 = new String [5];
        for (int i = 0; i < 2; i++) {
            System.out.println("Equipos del bombo " + i + 1);
            for (int j = 0; j < bomobo1.length; j++) {
                System.out.println("Indica la seleccion");
                String seleccion = scanner.next();
                if (i == 0) {
                    bomobo1 [j] = seleccion;
                } else {
                    bomobo2 [j] = seleccion;
                }
            }
        }
        System.out.println("Imprimiendo bombo 1");
        imprimiendobombo(bomobo1);
        System.out.println("Imprimiendo bombo 2");
        imprimiendobombo(bomobo2);
    }
    public static void imprimiendobombo (String [] bombo) {
        for (String item : bombo) {
            System.out.println(item);

        }
    }
}
