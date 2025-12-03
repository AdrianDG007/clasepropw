import java.util.Scanner;

public class MainBonoloto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jugar = false;

        do {
            Bonoloto bonoloto = new Bonoloto();
            //bonoloto.iniciarJuego();
            System.out.println("Los numeros del usuario son");
            bonoloto.listarNumeroUsuario();
            System.out.println("Los numeros del sistema son");
            bonoloto.listarNumerosSistema();
            System.out.println("Quiers jugar otra vez");
            jugar = scanner.nextBoolean();
        }while (jugar);


    }
}
