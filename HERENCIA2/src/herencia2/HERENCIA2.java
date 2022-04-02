/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

public class HERENCIA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto auto1 = new Auto(4, 4, 900, "Citroen");
        Auto auto2 = new Auto();
        
        auto1.obtenerKilometraje();
        auto2.obtenerKilometraje();

        auto1.caracteristicasVehiculo();
        
        Moto moto1 = new Moto();
        moto1.obtenerKilometraje();
        
        Cuatriciclo cuat1 = new Cuatriciclo(0, 0, "marca");
        cuat1.tienePuertas();
    }
    
}
