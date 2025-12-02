import java.util.Scanner;

public class Bonoloto {
    private int [] numerosSistema = new int[5]; //0,0,0,0,0
    private int [] numerosUsuario = new int[5]; //0,0,0,0,0
    int aciertos = 0;
    private Scanner scanner = new Scanner(System.in);
    public  void iniciarJuego (Quiniela quiniela){
        // al iniciar el juego pasan dos cosas
            // 1 - sale de la maquina 5 numeros que seron los nuermos del sistema
        for (int i = 0; i < 5; i++) {
            numerosSistema [i] = (int) (Math.random() * 21);
        }
            // 2 - se le piden 5 numeros al usuario
        System.out.println("Procedemos a sellar tu boleto");
        for (int i = 0; i < 5; i++) {
            int numeroIntroducido;
            do {
                System.out.println("Introduce el numero que quieres jugar");
                numeroIntroducido = scanner.nextInt();
                if (numeroIntroducido < 0 || numeroIntroducido > 20) {
                    System.out.println("Incorrecto");
                }
            } while ( numeroIntroducido < 0 || numeroIntroducido > 20);
            numerosUsuario [i] = numeroIntroducido;
        }
        // 5,6,7,2,1  -> n sistema
        // 4,7,8,12,3 -> n usuario
        System.out.println("Procedemos a ver las coincidencias del sistema");
        for ( int item : numerosUsuario){
            buscasNumero(item);
        }
        System.out.println("Has acertado una cantidad de " + aciertos);
    }
    // le damos un numero y se encarga de buscarlo dentro del array del sistema
    public void buscasNumero (int numero){
        // buscar un numero dentro del array numeros sistema
        // numerosSistema -> variable clase
        // numero -> parametro
        // 3
        // 4,5,12,20,3
        for ( int item : numerosSistema) {
            if (item == numero) {
                aciertos++;
                break;
            }
        }
    }
    public void listarNumerosSistema (){
        for (int item : numerosSistema){
            System.out.println(item);

        }
    }
    public void listarNumeroUsuario (){
        for ( int item : numerosUsuario ) {
            System.out.println(item);
        }
    }

}
