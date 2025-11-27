import java.util.Scanner;

public class Ejercicos {
    public void ejercicioT3E12() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica que conrtaseña quieres evaluar");
        String contrasenia = scanner.next();
        boolean requisitoLong = longCadena(contrasenia) >= 8;
        boolean contieneNumero = contieneNumero(contrasenia);
        boolean passInvalida = contrasenia.equals("password") || contrasenia.equals("12345678");
        System.out.println("Requisito long: " + requisitoLong);
        System.out.println("Requisito nuermo: " + contieneNumero);
        System.out.println("Requisito pass invalida: " + passInvalida);
        boolean passOK = requisitoLong && contieneNumero && !passInvalida;
        System.out.println("La evaluacion general es " + passOK);
    }
    private int longCadena (String cadena){
        return cadena.length();
    }
    private boolean contieneNumero(String cadena){
        return  cadena.contains("0") || cadena.contains("1")
                || cadena.contains("2") || cadena.contains("3") || cadena.contains("4")
                || cadena.contains("5") || cadena.contains("6") || cadena.contains("4")
                || cadena.contains("5") || cadena.contains("6") || cadena.contains("7")
                || cadena.contains("8") || cadena.contains("9");
    }

    public void ejercicioT3E10(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos centimetros mides:");
        int altura = scanner.nextInt();
        int alturaMin = 120, alturaMax = 200;
        if (altura>=alturaMin && altura<=alturaMax){
            System.out.println("La altura esta permitida puede subir");
        } else if (altura<alturaMin) {
            System.out.println("Altura inferior a la minima permitida, no puede subir");
        } else {
            System.out.println("Altura superor a la maxima permitada, no puede subir");
        }
    }
}

