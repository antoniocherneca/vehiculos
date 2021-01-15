
package testtrinee;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Automovil auto1 = new Automovil(4, "AA504MF", "Peugeot", "206", 1600, 200000);
        Automovil auto2 = new Automovil(4, "AF308WE", "Peugeot", "208", 1800, 250000);
        Motocicleta moto1 = new Motocicleta("AER154", "Honda", "Titan", 125, 60000);
        Motocicleta moto2 = new Motocicleta("AFF500", "Yamaha", "YBR", 160, 80500.50);
        
        //agregar vehículos a la lista
        List<Vehiculo> listaVehiculos = new ArrayList<>();
        listaVehiculos.add(auto1);
        listaVehiculos.add(moto1);
        listaVehiculos.add(auto2);
        listaVehiculos.add(moto2);
        
        Concesionaria conse = new Concesionaria();
        conse.setListaVehiculos(listaVehiculos);

        conse.mostrarVehiculos();
        
        System.out.println("=============================");
        
        conse.mostrarMasCaro();
        
        System.out.println("=============================");
        
        conse.mostrarMasBarato();
        
        System.out.println("=============================");
        
        conse.contieneY();
        
        System.out.println("=============================");
        
        conse.ordenarPorPrecio();
    }
    
}
