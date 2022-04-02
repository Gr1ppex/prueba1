/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package herencia2;

public abstract class Vehiculo {
    int cantRuedas;
    int kilometraje;
    String marca;
    
    public Vehiculo() {
    }

    public Vehiculo(int cantRuedas, int kilometraje, String marca) {
        this.cantRuedas = cantRuedas;
        this.kilometraje = kilometraje;
        this.marca = marca;
    }
    
    public void obtenerKilometraje() {
        System.out.println("this kilometraje " + this.kilometraje);
    }
    
    public abstract Boolean tienePuertas();
    
    public void caracteristicasVehiculo() {
        System.out.println("cantRuedas: " + this.cantRuedas);
        System.out.println("Kilometraje: " + this.kilometraje);
        System.out.println("Marca: " + this.marca);
    }
    
}
