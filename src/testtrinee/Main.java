
package testtrinee;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
        
        //imprimir todos los vehículos
        double precioMasCaro = 0;
        double precioMasBarato = 0;
        String masCaro = "";
        String masBarato = "";
        int indiceCoincidencia = -1;
        String vehiculoConY = "";
        int contadorCoincidencia = 0;
        
        for(Vehiculo vehic : listaVehiculos) {
            System.out.println(vehic);
            
            //vehículo más caro
            if(vehic.getPrecio() > precioMasCaro) {
                precioMasCaro = vehic.getPrecio();
                masCaro = vehic.getMarca() + " " + vehic.getModelo();
            }
            
            //vehículo más barato
            if(precioMasBarato != 0) {
                if(vehic.getPrecio() < precioMasBarato) {
                    precioMasBarato = vehic.getPrecio();
                    masBarato = vehic.getMarca() + " " + vehic.getModelo();
                }
            }
            else {
                precioMasBarato = vehic.getPrecio();
            }
            
            //vehículo que contenga en su modelo el caracter 'Y'
            indiceCoincidencia = vehic.getModelo().indexOf("Y");
            if(indiceCoincidencia > -1) {
                contadorCoincidencia += 1;
                DecimalFormat formato = new DecimalFormat("#,###,###.00");
                String precioFormateado = formato.format(vehic.getPrecio());
                vehiculoConY = vehic.getMarca() + " " + vehic.getModelo() +
                        " $" + precioFormateado;
            }
        }
        
        System.out.println("=============================");
        
        System.out.println("Vehículo más caro: " + masCaro);
        System.out.println("Vehículo más barato: " + masBarato);
        switch (contadorCoincidencia) {
            case 0:
                System.out.println("No existen vehículos que tengan en el modelo la letra 'Y'");
                break;
            case 1:
                System.out.println("Vehículo que contiene en el modelo la letra 'Y': " + vehiculoConY);
                break;
            default:
                System.out.println("Hay más de un vehículo que tiene en el modelo la letra 'Y'");
                break;
        }
        
        System.out.println("=============================");
        
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        Collections.sort(listaVehiculos);
        for(Vehiculo vehic : listaVehiculos) {
            System.out.println(vehic.getMarca() + " " + vehic.getModelo());
        }
    }
    
}
