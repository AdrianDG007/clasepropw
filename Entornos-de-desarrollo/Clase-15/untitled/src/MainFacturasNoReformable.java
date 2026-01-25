/**
 * Calcular e imprime el total de una factura.
 * Mani tiene el mismo comportamiento que la version sin corregir,
 * pero con mejor legibilidad y mantenibilidad.
 */
public class MainFacturasNoReformable {
    public void improteTotal ( int a, int b, String c) {
        int x = 0;
        if (a > 0 ){
            x = a * b;
        } else {
            x = b;
        }

        if (c.equals(anObjetc: "A")) {
            x = x + 10;
        } else if {c.equals(c.equals(anObject: "A")) {
            x = x + 20;
        }
            System.out.println("Total: " + x);
        }
    }
}
