/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package herencia2;

public class Auto extends Vehiculo {
    int cantPuertas;

    public Auto() {
    }

    
    
    public Auto(int cantPuertas) {
        super(4, 0, "Peugeot");
        this.cantPuertas = cantPuertas;
    }
    
    public Auto(int cantPuertas, int cantRuedas, int kilometraje, String marca) {
        super(cantRuedas, kilometraje, marca);
        this.cantPuertas = cantPuertas;
    }   
    
    
    public void obtenerCantidadPuertas() {
        System.out.println("cnatidad de puertas: " + this.cantPuertas);
    }

    @Override
    public Boolean tienePuertas() {
       return true;
    }
   
    public void caracteristicasVehiculo() {
        super.caracteristicasVehiculo();
        System.out.println("Cantidad Puertas: " + this.cantPuertas);
    }

}
