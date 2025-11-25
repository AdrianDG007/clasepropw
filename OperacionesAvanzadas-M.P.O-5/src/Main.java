import Controller.GestorDocumental;
import Controller.GestorUsuaria;

import java.util.Scanner;

//necesito funcionalidad de otra clase
//import cntroller.GestorDocumental
public class Main {
    public static void main(String[] args) {
        System.out.println("Ejecutable");
        Scanner scanner = new Scanner(System.in);
        GestorDocumental gestorDocumental =  new GestorDocumental();
        GestorUsuaria gestorUsuaria = new GestorUsuaria();
        gestorUsuaria.evaluarUsuaria("");
        gestorDocumental.archivarDocumento("");

        //GestorDocumental.gestionarStati();
    }
}
