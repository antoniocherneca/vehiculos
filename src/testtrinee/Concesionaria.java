
package testtrinee;

import java.text.DecimalFormat;
import java.util.Collections;
import java.util.List;

public class Concesionaria {
    
    private List<Vehiculo> listaVehiculos;

    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }
    
    public void mostrarVehiculos() {
        for(Vehiculo vehic : listaVehiculos) {
            System.out.println(vehic);
        }
    }
    
    public void mostrarMasCaro() {
        Collections.sort(listaVehiculos);
        System.out.println("Vehículo más caro: " + listaVehiculos.get(0).marca + " " + listaVehiculos.get(0).modelo);
    }
    
    public void mostrarMasBarato() {
        System.out.println("Vehículo más barato: " + listaVehiculos.get(listaVehiculos.size() - 1).marca +
                " " + listaVehiculos.get(listaVehiculos.size() - 1).modelo);
    }
    
    public void contieneY() {
        for(Vehiculo vehic : listaVehiculos) {
            if(vehic.modelo.contains("Y")) {
                DecimalFormat formato = new DecimalFormat("#,###,###.00");
                String precioFormateado = formato.format(vehic.getPrecio());
                
                System.out.println("Vehículo que contiene la letra Y: " +
                        vehic.marca + " " + vehic.modelo + " $" + precioFormateado);
            }
        }
    }
    
    public void ordenarPorPrecio() {
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        for(Vehiculo vehic : listaVehiculos) {
            System.out.println(vehic.getMarca() + " " + vehic.getModelo());
        }
    }
    
}