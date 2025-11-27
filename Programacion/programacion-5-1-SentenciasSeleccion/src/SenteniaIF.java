import javax.sound.sampled.Line;

public class SenteniaIF {
    public void examenAprobado (int nota){
        System.out.println("Procedemos a evaluar si un examen esta OK");
        System.out.println("La nota que vamos a evalaur es " +nota);
        if(nota>=5){
            System.out.println("El examen esta aprobado");
        } else {
            System.out.println("El examen esta suspenso");
        }
        System.out.println("Terminando la evaluacion del examenes");
        System.out.println("Programa finalizado");
    }
    public void notaExamen (int nota){
        // suspenso -> 0-4.99
        // aprobado -> 5-7.99
        // notalbe -> 8-8.99
        // sobresaliente -> 9-9.99
        // MH ->10
        String resultadoExamen;
        if (nota>=0 && nota<=10){
            if (nota < 5) {
                resultadoExamen = "suspenso";
                //System.out.println("El examne esta suspenso");
            } else if (nota < 8) {
                resultadoExamen = "aprobado";
                //System.out.println("El examen esta aprobado");
            } else if (nota < 9) {
                resultadoExamen = "notable";
                //System.out.println("El examen es notable");
            } else if (nota < 10) {
                resultadoExamen = "sobresaliento";
                //System.out.println("El examen es sobresaliente");
            } else {
                resultadoExamen = "MH";
                //System.out.println("El examen esta de MH");
            }
        } else {
            //System.out.println("La nota no esta en la escala correcta");
            resultadoExamen = "Fuera de rango";
        }
        System.out.println(resultadoExamen);

    }
}
