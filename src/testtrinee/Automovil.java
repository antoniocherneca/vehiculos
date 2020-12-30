
package testtrinee;

import java.text.DecimalFormat;

public class Automovil extends Vehiculo {
    private int puertas;

    public Automovil() {
    }

    public Automovil(int puertas, String patente, String Marca, String modelo, int cilindrada, double precio) {
        super(patente, Marca, modelo, cilindrada, precio);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    
    @Override
    public String toString() {
        DecimalFormat formato = new DecimalFormat("#,###,###.00");
        String precioFormateado = formato.format(precio);
        return "Marca: " + marca + " // Modelo: " + modelo + " // Puertas: " +
                puertas + " // Precio: $" + precioFormateado;
    }
}
