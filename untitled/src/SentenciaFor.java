public class SentenciaFor {
    public void sentenciaFor() {
        // inicial;final;incrementa
        for (int i = 0; i < 5; i++) {
            System.out.println("Ejecutando liena");
        }
        System.out.println();
       /* for (int i = 0; i < 100;i++){
            try {
                System.out.printf("%d",i);
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        */
        for (int i = 100; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.println("Ejecuciones" + i);
            }
        }
    }
    public void tablaMultiplicarNumero(int numero) {
        System.out.println("Procedemos a escribir la tabla de multiplicaar del " + numero);
        for (int i = 0; i < 11; i++) {
            System.out.printf("%d * %d = %d%n", i, numero, i * numero);

        }
    }
    public void todasTablas() {
        for (int i = 0; i < 11; i++) {
            System.out.println("Sacando la tabla del " + i);
            for (int a = 0; a < 11; a++) {
                System.out.printf("\t %d * %d = %d%n", a, i, i * a);

            }

        }
    }
    public void dibujarCuadrado() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i== 0 || i== 4) {
                    System.out.print("*");
                } else if (j== 0 || j== 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
