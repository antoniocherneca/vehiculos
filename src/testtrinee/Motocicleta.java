
package testtrinee;

import java.text.DecimalFormat;

public class Motocicleta extends Vehiculo {

    public Motocicleta() {
    }

    public Motocicleta(String patente, String Marca, String modelo, int cilindrada, double precio) {
        super(patente, Marca, modelo, cilindrada, precio);
    }

    @Override
    public String toString() {
        DecimalFormat formato = new DecimalFormat("#,###,###.00");
        String precioFormateado = formato.format(precio);
        return "Marca: " + marca + " // Modelo: " + modelo + " // Cilindrada: " +
                cilindrada + "cc // Precio: $" + precioFormateado;
    }
    
    
}
