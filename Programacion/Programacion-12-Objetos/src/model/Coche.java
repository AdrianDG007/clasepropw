package model;
import lombok.*;

@ Getter
@ Setter
// @ Data
//@ NoArgsConstructor
@ AllArgsConstructor
public class Coche {
    /* private String modelo;
       private String bastidor;
       private String color;
    */
    private String  marca, modelo, bastidor, color ;
    protected int cv, velocidad;
    private double precio;
    private boolean usado;
    // por defecto, en toda clase hay un constructor que denomina constructor vacío
        // desaparece implícito cunado escribo otro constructor
    // public Coche () { cuerpo }
    //public Coche () {System.out.println("Vamos a construir el coche")}
    public Coche() {}
    public Coche (String marca, String modelo, String bastidor, String color, int cv) {
        this.marca    = marca;
        this.modelo   = modelo;
        this.bastidor = bastidor;
        this.color    = color;
        this.cv       = cv;
        // this.velocidad = 0;
        // this.precio = 0.0
    }
    public Coche (String marca, String modelo, double precio) {
        this.marca  = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    public Coche (String marca, String modelo, double precio, int cv) {
        this.marca  = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.cv     = cv;
    }
    public void mostrarDatos () {
        System.out.println ("Mostranbdo los datos del coche");
        System.out.println ("marca = "     + marca);
        System.out.println ("modelo = "    + modelo);
        System.out.println ("bastidor = "  + bastidor);
        System.out.println ("color = "     + color);;
        System.out.println ("cv = "        + cv);
        System.out.println ("velocidad = " + velocidad);
        System.out.println ("precio = "    + precio);
        System.out.println ("usado = "     + usado);
    }
    /*
    public boolean isUsado () {
        return usado;
    }

    public void setUsado (boolean usado) {
        this.usado = usado;
    }

    public String getMarca () {
        return marca;
    }

    public void setMarca (String marca) {
        this.marca = marca;
    }

    public double getPrecio () {
        return precio;
    }

    public void setPrecio (double precio) {
        this.precio = precio;
    }

    public String getModelo () {
        return modelo;
    }

    public void setModelo (String modelo) {
        this.modelo = modelo;
    }

    public String getColor () {
        return color;
    }

   public void setColor (String color) {
        this.color = color;
    }

    public String getBastidor () {
        return bastidor;
    }

    public void setBastidor (String bastidor) {
        this.bastidor = bastidor;
    }

    public int getVelocidad () {
        return velocidad;
    }

    public void setVelocidad (int velocidad) {
        this.velocidad = velocidad;
    }

    public int getCv () {
        // puedo hacer validaciones de datos
            // los cv del coche han sido modificados;
                // en caso de estar modificados retorno los reales
        return this.cv;
    }

    public void  setCv (int cv) {
        // this.cv = this.cv + cv
        // si el coche al cambiarlos pasa de 100 cv, se queda con 1000, es el tope
        this.cv += cv;
    }
*/
    /*public  int getCv () {
        // la logica de saber si los CV son impares
        if (cv % 2 != 0) {

        }
        return cv;
    }*/

    @Override
    public String toString () {
        return this.modelo + " " + this.marca + " " + this.precio;
    }
}
