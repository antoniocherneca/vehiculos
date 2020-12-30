
package testtrinee;

public class Vehiculo implements Comparable<Vehiculo> {
    protected String patente;
    protected String marca;
    protected String modelo;
    protected int cilindrada;
    protected double precio;

    public Vehiculo() {
    }

    public Vehiculo(String patente, String marca, String modelo, int cilindrada, double precio) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.precio = precio;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public int compareTo(Vehiculo vehic) {
        if(vehic.getPrecio() > precio) {
            return 1;
        }
        else if(vehic.getPrecio() == precio) {
            return 0;
        }
        else {
            return -1;
        }
    }
}
